package Clases;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

    public class frame_panel extends JFrame
    {
       public frame_panel(JPanel espacio, JButton graficar, JTextField txtfuncion, JTextField txtA,JTextField txtB){
            setSize(espacio.getWidth(),espacio.getHeight());//500,350           
            Graficar mipanel = new Graficar(espacio,graficar,txtfuncion, txtA, txtB);
            this.add(mipanel);
        }
    }
