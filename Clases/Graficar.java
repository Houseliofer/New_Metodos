package Clases;

/**
 *
 * @author Agustin Estrada_
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import org.nfunk.jep.*;  
import org.nfunk.jep.type.*;
import org.lsmp.djep.djep.DJep;//derivadas


public class Graficar extends JPanel
{
    
    private    JEP miEvaluador;
    
    boolean    errorEnExpresion; //si hay error de sintaxis en la funci�n
    boolean    errorEnNumero   ; //si hay error de sintaxis en la funci�n

    JTextField txtfuncion;
    JTextField txtA,txtB;
    JTextField campoNoPuntos;
 
    JScrollPane scrollPane;
    //BOTONES
    JButton btngrafica;
    int puntosInt;
    
    //PANELES
    JPanel panelGrafico; //Zona grafica
    JPanel DisplayPanel1 = new JPanel(); //Panel para la grafica
    
    int Galto,Gancho;       //dimesiones de la zona para graficar
    int    x0,y0;           //origen
    int    escalaX,escalaY;
    int aumento1,aumento2;
    double intervaloA,intervaloB;
    int numeroDeInteraciones;
    double xmin,xmax,imgx;
    
    //Grosor de lineas
    final static BasicStroke grosor1 = new BasicStroke(1.5f); //thickness
    final static float dash1[] = {5.0f};
    final static BasicStroke dashed = new BasicStroke(1.0f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,5.0f, dash1, 0.0f);
    
    public Graficar(JPanel panel, JButton btngraficar, JTextField txtfun, JTextField txtIntA, JTextField txtIntB)
    {
        //
         this.btngrafica=btngraficar;
         this.txtfuncion=txtfun;
         this.txtA=txtIntA;
         this.txtB=txtIntB;
         
        campoNoPuntos = new JTextField("99",3);// puntos de graficacion
              
        Gancho = panel.getHeight();
        Galto = panel.getWidth();
     
        panelGrafico = new ZonaGrafica(); //zona grafica
        
        scrollPane = new JScrollPane(panelGrafico);//
        DisplayPanel1.setLayout(new BorderLayout());
        DisplayPanel1.add(scrollPane, BorderLayout.CENTER);//panelGrafico
        DisplayPanel1.setPreferredSize( new Dimension(Gancho,Galto));
     
        panel.setLayout(new BorderLayout());
        panel.add("North",DisplayPanel1);
	 
        //evaluador de funciones
        miEvaluador = new JEP();
        miEvaluador.addStandardFunctions();  //agrega las funciones matematicas comunes
        miEvaluador.addStandardConstants();
       miEvaluador.addComplex();
       miEvaluador.addVariable("x", 0);
        //funciones trigonometricas 
       miEvaluador.addFunction("sin", new org.nfunk.jep.function.Sine());
       miEvaluador.addFunction("cos", new org.nfunk.jep.function.Cosine());
       miEvaluador.addFunction("tg", new org.nfunk.jep.function.Tangent());
       //funciones trigonometricas hiperbolicas
       miEvaluador.addFunction("sinh", new org.nfunk.jep.function.SineH());
       miEvaluador.addFunction("cosh", new org.nfunk.jep.function.CosineH());
       miEvaluador.addFunction("tgh", new org.nfunk.jep.function.TanH());
       //funciones trigonometricas inversas
       miEvaluador.addFunction("arcsin", new org.nfunk.jep.function.ArcSine());
       miEvaluador.addFunction("arcCos", new org.nfunk.jep.function.ArcCosine());
       miEvaluador.addFunction("arctg", new org.nfunk.jep.function.ArcTangent());
       // funciones hiperbolicas inversas
       miEvaluador.addFunction("arcsinh", new org.nfunk.jep.function.ArcSineH());
       miEvaluador.addFunction("arcCosh", new org.nfunk.jep.function.ArcCosineH());
       miEvaluador.addFunction("arctgh", new org.nfunk.jep.function.ArcTanH());
       //reciprocas
       //logaritmo
       miEvaluador.addFunction("ln", new org.nfunk.jep.function.Logarithm());
       //raiz cuadrada
       miEvaluador.addFunction("sqrt", new org.nfunk.jep.function.SquareRoot());
        miEvaluador.setImplicitMul(true); //permite 2x en vez de 2*x*
        
        escalaX=30;
        escalaY=30;
        x0=Gancho/2;
        y0=Galto/2;
        aumento1=7;
	 
	 	ManejadorDeEvento ManejadorDevt = new  ManejadorDeEvento();		 	
		this.txtfuncion.addActionListener(ManejadorDevt);
		this.btngrafica.addActionListener(ManejadorDevt);
       this.txtA.addActionListener(ManejadorDevt);
        this.txtB.addActionListener(ManejadorDevt);
        campoNoPuntos.addActionListener(ManejadorDevt);
    }//
//constructor
    Graficar() {
    }

private class ManejadorDeEvento implements ActionListener
{
    public void actionPerformed (ActionEvent evt)
    {
        Object source = evt.getSource ();
        //actiliza la grafica si se preciona el boton o se hace un enter en los campos de texto
        if ( source == btngrafica ||source == txtfuncion || source == txtA || source == txtB ){
            panelGrafico.repaint();
        }
    }
}

public class ZonaGrafica extends JPanel  implements MouseListener, MouseMotionListener, MouseWheelListener
{
    int     offsetX, offsetY;
    boolean dragging;
    
    ZonaGrafica() 
    {
        setBackground(Color.white);             
        offsetX=x0; offsetY=y0;
        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
    }
    
    public void mousePressed(MouseEvent evt)
    {
        if (dragging)
            return;
        int x = evt.getX();  // clic inicial
        int y = evt.getY();
        offsetX = x - x0;
        offsetY = y - y0;
        dragging = true;
    }

    public void mouseReleased(MouseEvent evt)
    {
        dragging = false;
        repaint();
    }

    public void mouseDragged(MouseEvent evt)
    {
        if (dragging == false)
            return;
        int x = evt.getX();   // esta es la posicion el mouse
        int y = evt.getY();
        x0 = x - offsetX;     // mover origen
        y0 = y - offsetY;
        repaint();
    }
    //hacer zoom con el scrool del mouse o para el touchpad
    public void mouseWheelMoved(MouseWheelEvent evt) {
        int zoom = evt.getWheelRotation();
        escalaY += -zoom;
        escalaX += -zoom;
        repaint();
    }

           //no hacen nada pero se deben implementar por el extend implements sino marca error
    public void mouseMoved(MouseEvent evt) {}
    public void mouseClicked(MouseEvent evt) { }
    public void mouseEntered(MouseEvent evt) { }
    public void mouseExited(MouseEvent evt) { }

    public void paintComponent(Graphics g)
    {
         super.paintComponent(g);
         Graficar(g, x0, y0);                      
    }
 
    //metodo para dibujar toda la grafica 
    void Graficar(Graphics ap, int xg, int yg)
    {
        int xi=0,yi=0,xi1=0,yi1=0,numPuntos=1;
        int cxmin,cxmax,cymin,cymax;
        double valxi=0.0, valxi1=0.0, valyi=0.0,valyi1=0.0;
        Thread animation;

        //convertimos el objeto ap en un objeto Graphics2D para usar los m�todos Java2D
        Graphics2D g = (Graphics2D) ap;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        //dibujar eje x y
        g.draw(new Line2D.Double(xg, 10, xg, Galto-10)); //eje Y
        g.draw(new Line2D.Double(10, yg, Gancho-10, yg));//eje X

        xmin=-1.0*xg/escalaX;
        xmax=(1.0*(Gancho-xg)/escalaX);
        cxmin=(int)Math.round(xmin); //pantalla
        cxmax=(int)Math.round(xmax);

       if(txtA.getText().equals(""))
            intervaloA = cxmin;
        else
            intervaloA = Double.parseDouble(txtA.getText());
            
        if(txtB.getText().equals(""))
            intervaloB = cxmax;
        else
            intervaloB = Double.parseDouble(txtB.getText());

        puntosInt = Integer.parseInt(campoNoPuntos.getText());
        //intervalos para la funcion 
        cymin=(int)Math.round(1.0*(yg-Galto)/escalaY);
        cymax=(int)Math.round(1.0*yg/escalaY);
        numPuntos=Gancho; //numero de pixels
        g.setPaint(new Color(49,173,215)); //COLOR CUADRICULA

        //dibujar ejes 
        if(escalaX>5)
        {
            for(int i=cxmin;i<=cxmax;i++)
            {   //Eje X
                g.setPaint(new Color(153,163,164)); //color cuadricula x
                g.draw(new Line2D.Double(xg+i*escalaX, yg-2, xg+i*escalaX , yg+2));
                if( (xg+i*escalaX) != xg )
                    g.draw(new Line2D.Double(xg+i*escalaX, 10, xg+i*escalaX, Galto-10));
                
                if(i>0){
                    g.setPaint(new Color(0,0,0));//color numeros positivos X
                    g.drawString(""+i, xg+i*escalaX-aumento1, yg+12);
                }
                if(i<0){
                    g.setPaint(new Color(0,0,0));//color numeros negativos X
                    g.drawString(""+i, xg+i*escalaX-8, yg+12);
                }
            }
        }

        if(escalaY>5)
        {
            for(int i=cymin+1;i<cymax;i++)
            {   //eje Y
                g.setPaint(new Color(153,163,164)); //color cuadricula Y
                g.draw(new Line2D.Double(xg-2, yg-i*escalaY, xg+2 , yg-i*escalaY));
                if( (yg-i*escalaY) != yg )
                    g.draw(new Line2D.Double(10, yg-i*escalaY, Gancho-10, yg-i*escalaY));
                if(i>0){
                    g.setPaint(new Color(0,0,0));//color numeros Y positivos
                    g.drawString(""+i, xg-12,yg-i*escalaY+8 );
                }
                if(i<0){
                    g.setPaint(new Color(0,0,0));//color de numeros Y negativos 
                    g.drawString(""+i, xg-14,yg-i*escalaY+8 );
                }
            }
        }
        g.setPaint(new Color(108, 52, 131));//color funcion
        g.setStroke(grosor1);
        
        miEvaluador.parseExpression(txtfuncion.getText());
        errorEnExpresion = miEvaluador.hasError(); //hay error?
        
        if(!errorEnExpresion)
        {
            txtfuncion.setForeground(Color.black);
            
            //ciclo para dibujar la funcion
            for(int i=(int) (xg+intervaloA*escalaX);i<(xg+intervaloB*escalaY)-1;i++)//numPuntos
            {
                valxi =xmin +i*1.0/escalaX;
                valxi1=xmin+(i+1)*1.0/escalaX;
                miEvaluador.addVariable("x", valxi);
                valyi=miEvaluador.getValue();  
                miEvaluador.addVariable("x", valxi1);
                valyi1 =  miEvaluador.getValue();
                xi =(int)Math.round(escalaX*(valxi));
                yi =(int)Math.round(escalaY*valyi); 
                xi1=(int)Math.round(escalaX*(valxi1));
                yi1=(int)Math.round(escalaY*valyi1); 

                //control de discontinuidades y complejos
                if(i%(100-puntosInt)==0){
                    Complex valC = miEvaluador.getComplexValue();
                    double imgx = (double)Math.abs(valC.im()); 
                    if(dist(valxi,valyi,valxi1,valyi1)< 1000 && imgx==0)
                    {
                        g.draw(new Line2D.Double(xg+xi,yg-yi,xg+xi1,yg-yi1)); 
                    }
                }
            } 
        }else
            txtfuncion.setForeground(Color.red);
    }//Graficar
 
    double dist(double xA,double yA, double xB,double yB)//distancia de puntos
    {
        return (xA - xB)*(xA - xB)+(yA - yB)*(yA - yB);
    }//
 
} // class

}