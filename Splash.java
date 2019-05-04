import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame
    implements ActionListener{
    JButton salir = new JButton("Salir");
    public Splash()
    {
        // initialise instance variables
       //getContentPane().add(etiqueta);
       setLayout(null);
       this.setBounds(10,20,400,250);
       
       JLabel titulo = new JLabel("Sabado en clase");
       titulo.setBounds(10,10,300,20);
       this.add(titulo);
       
       /** Agregar imagen de fondo           */
       ImageIcon imagen = new ImageIcon("splash2.jpg");
       JLabel etiqueta = new JLabel(imagen);
       etiqueta.setBounds(0,0,400,250);
       this.add(etiqueta);
       
       
       
       /** Agregar boton de salir           */
       salir.setBounds(320,220,70,20);
       salir.addActionListener(this);
       this.add(salir);
       
       /** Centrar el splash                */
       Dimension pantalla, cuadro;
       pantalla = Toolkit.getDefaultToolkit().getScreenSize();
       cuadro = this.getSize();
       this.setLocation(((pantalla.width - cuadro.width)/2), (pantalla.height - cuadro.height)/2);
       setResizable(false);
       
       setUndecorated(true) ;
       setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent e) {
        this.hide();
    }

    
}
