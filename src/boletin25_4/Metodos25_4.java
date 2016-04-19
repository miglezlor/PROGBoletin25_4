/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin25_4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Metodos25_4 implements ActionListener{
    JFrame marco1;
    JFrame marco2;
    JButton boton;
    
    public void crearVentana(){
        marco1 = new JFrame("Venta 1");
        marco2 = new JFrame("Venta 2");
        boton = new JButton("Activar segunda venta");
        
        marco1.setSize(300, 200);
        marco2.setSize(300, 200);

        boton.addActionListener(this);
        
        marco1.add(boton);
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        marco1.setVisible(false);
        marco2.setVisible(true);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
