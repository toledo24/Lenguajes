/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntos1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author meguel
 */
public class Graf {
     private JButton botonsi;
    
    private JLabel impri;
    private JFrame ventana;
    private JTextField A;
    private JTextField B;
    private JLabel A1;
    private JLabel A2;
    
    public void iniciar (){
   int tA;
   int tB;
   JFrame ventana = new JFrame();
   JPanel panel = new JPanel();
   panel.setLayout(null);
   panel.setBackground(Color.ORANGE);
     A = new JTextField();  
     A.addKeyListener(new KeyAdapter() {
public void keyTyped(KeyEvent e) {
char c = e.getKeyChar();
if (!((Character.isDigit(c) ||
(c == KeyEvent.VK_BACK_SPACE) ||
(c == KeyEvent.VK_DELETE)))){;
e.consume();
}
}
});
     
     
    B = new JTextField();
    
     B.addKeyListener(new KeyAdapter() {
public void keyTyped(KeyEvent e) {
char c = e.getKeyChar();
if (!((Character.isDigit(c) ||
(c == KeyEvent.VK_BACK_SPACE) ||
(c == KeyEvent.VK_DELETE)))){;
e.consume();
}
}
});
    
    
    A2= new JLabel ("Arreglo B");
    A1= new JLabel ("Arreglo A");
    impri= new JLabel ("Unión :");
    botonsi = new JButton ("Ingresar");
    
    impri.setBounds(400, 100, 200, 200);
    botonsi.setBounds(700, 400, 100, 50);
     A.setBounds(200, 100, 100, 50);
      B.setBounds(200, 200, 100, 50);
       A1.setBounds(50, 100, 100, 50);
      A2.setBounds(50, 200, 100, 50);
    
   panel.add(A);
    panel.add(B);
     panel.add(A1);
      panel.add(A2);
      panel.add(botonsi);
   
  
    
    botonsi.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
           String ca = null;
           String cb = null;
           int tA = Integer.parseInt(A.getText());
           int tB = Integer.parseInt(B.getText());
            char []A = new char [tA];
        char []B = new char [tB];
           //System.out.println("Ingrese elementos de A");
        for (int i =0; i < A.length; i++){
            //A[i] = (char)System.in.read();
            
            A[i]  =  JOptionPane.showInputDialog(
        null,"Introduzca contenido",
        "Arreglo A",
        JOptionPane.QUESTION_MESSAGE).charAt(0);
           
        }
         for (int i =0; i < B.length; i++){
            //A[i] = (char)System.in.read();
            
            B[i] = JOptionPane.showInputDialog(
        null,"Introduzca contenido",
        "Arreglo B",
        JOptionPane.QUESTION_MESSAGE).charAt(0);
           
        }
        
         
         
        char []uni = Union.union(A, B);
        char []inter = Interseccion.interseccion(A, B);
        char []dif = Diferencia.diferencia(A, B);
        char []simetricaA=DiferenciaSime.diferenciaA(A, B);
        char []simetricaB=DiferenciaSime.diferenciaB(B, A);
        
        
        //Union
        String un1 = "";
        for (int i=0; i< uni.length; i++){
        System.out.println("Unión" + uni[i]);
        un1+=uni[i]; 
//        JOptionPane.showMessageDialog(null, "\nElemento: "+ uni[i]);
    }
          JOptionPane.showMessageDialog(
        null,"Unión: " + un1,
        "Unión",
        JOptionPane.INFORMATION_MESSAGE);
           
        //interseccion   
          String un2 = "";
            for (int i=0; i< inter.length;i++){
            System.out.println("Intersección " + inter[i]);
            un2+=inter[i];
        }
             JOptionPane.showMessageDialog(
        null,"Intersección: " + un2,
        "Intersección",
        JOptionPane.INFORMATION_MESSAGE);
        
         //diferencia
             String un3 ="";
              for (int i=0; i< dif.length;i++){
            System.out.println("Diferencia " + dif[i]);
            un3+=dif[i];
        }
              JOptionPane.showMessageDialog(
        null,"Diferencia: " + un3,
        "Diferencia",
        JOptionPane.INFORMATION_MESSAGE);
         
        //diferencia simetrica
              String un4="";
              String un5="";
              for (int i=0; i< dif.length;i++){
                  un4+= simetricaA[i];
                  System.out.println("Diferencia A " + simetricaA[i]);
         
        }
               for (int i=0; i< dif.length;i++){
                   System.out.println("Diferencia B " + simetricaB[i]);
                  un5+= simetricaB[i];
                  
         
        }
              JOptionPane.showMessageDialog(
        null,"Diferencia simetrica de A: " + un4,
        "Diferencia simetrica",
        JOptionPane.INFORMATION_MESSAGE);
              JOptionPane.showMessageDialog(
        null,"Diferencia simetrica de B: " + un5,
        "Diferencia simetrica",
        JOptionPane.INFORMATION_MESSAGE);
           
           
           }
     
        }); 

     
    
    
   
   ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setSize(900,500);
        ventana.setTitle("Operaciones con Conjuntos");
        ventana.add(panel);
        
    }
}
