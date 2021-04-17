package proyectoprogra;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VentanaCreacion extends VentanaGeneral {
    ventanaSeleccion v2 = new ventanaSeleccion();

    public VentanaCreacion() {
        super();
        this.seleccionAtomo();
        this.labelAtomos();
        this.atrasButton();
        this.seleccionEnlaces();
        this.labelEnlaces();
    }

    
    
    private void seleccionAtomo(){
        String [] nombresAtomos = Guardado.box();
        int contador = 0;
        int tamanoArreglo = nombresAtomos.length;
        panel2.setBackground(Color.white);
        JComboBox atomList = new JComboBox();
        atomList.setBounds(20, 200, 150, 30);
        atomList.setBackground(Color.black);
        atomList.setForeground(Color.white);
        atomList.setFont(new Font("times new roman", Font.BOLD, 14));
        while(contador<tamanoArreglo){
            atomList.addItem(nombresAtomos[contador]);
            contador++;  
        }
        
        panel2.add(atomList);
        
        
        
    }
    
    private void labelAtomos(){
        JLabel atomos = new JLabel();
        atomos.setLayout(null);
        atomos.setText("Atomos:");
        atomos.setForeground(Color.black);
        atomos.setBounds(20, 180, 150, 20);
        atomos.setFont(new Font("times new roman", Font.BOLD, 14));
        panel2.add(atomos);
    }
    
    private void atrasButton(){
        JButton backButton = new JButton();
        backButton.setLayout(null);
        backButton.setText("Atras");
        backButton.setFont(new Font("time new roman", Font.BOLD, 14));
        backButton.setForeground(Color.white);
        backButton.setBackground(Color.black);
        backButton.setBounds(20, 700, 150, 30);
        panel2.add(backButton);  
        
        ActionListener evento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                ventanaSeleccion v2 = new ventanaSeleccion();
                v2.setVisible(true);
            }
        };   
        backButton.addActionListener(evento);
        
        
    }
    
    private void seleccionEnlaces(){
        String [] nenlaces = {"1","2","3","Solo el átomo"};
        JComboBox enlaces = new JComboBox(nenlaces);
        enlaces.setBounds(20, 400, 150, 30);
        enlaces.setBackground(Color.black);
        enlaces.setForeground(Color.white);
        enlaces.setFont(new Font("times new roman", Font.BOLD, 14));
        panel2.add(enlaces);
    }

     private void labelEnlaces(){
        JLabel enlaces = new JLabel();
        enlaces.setLayout(null);
        enlaces.setText("Enlaces:");
        enlaces.setForeground(Color.black);
        enlaces.setBounds(20, 380, 150, 20);
        enlaces.setFont(new Font("times new roman", Font.BOLD, 14));
        panel2.add(enlaces);
    }
    
   
    
    
}
