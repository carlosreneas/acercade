import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registro extends JFrame implements ActionListener
{

    /**
     * Constructor for objects of class Registro
     */
    
    public JTextField texto = new JTextField();
    public JButton boton = new JButton("Pasar");
    
    public Registro()
    {
        this.setSize(300,80);
        this.getContentPane().setLayout(new GridLayout(1,2));
        this.getContentPane().add(texto);
        this.getContentPane().add(boton);
        this.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){ 
        
    }


}
