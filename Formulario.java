import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Formulario extends JFrame
    implements ActionListener{
     private JMenuBar mb;
     private JMenu menu1, menu2;
     private JMenuItem mi1, mi2,mi3, miAcerca, miFormulario;
     public Registro r;
     public Formulario() {
             setLayout(null);
             this.setBounds(10,20,300,200);
             /** Se inicializa la barra de menu 
              */
             mb=new JMenuBar();
             setJMenuBar(mb);
             /** Se inicializa el menu 
              */
             menu1=new JMenu("Opciones");
             mb.add(menu1);
             menu2=new JMenu("Ayuda");
             mb.add(menu2);
             /** Se inicializan las opciones del menu 
              */
             mi1=new JMenuItem("Rojo");
             mi1.addActionListener(this);
             menu1.add(mi1);
             mi2=new JMenuItem("Rojo");
             mi2.addActionListener(this);
             menu1.add(mi2);
             mi3=new JMenuItem("Azul");
             mi3.addActionListener(this);
             menu1.add(mi3); 
             
             miFormulario=new JMenuItem("Llamar formulario");
             miFormulario.addActionListener(this);
             miFormulario.setToolTipText("Llama a un formulario adicional...");
             menu2.add(miFormulario); 
             miAcerca=new JMenuItem("Acerca de");
             miAcerca.addActionListener(this);
             miAcerca.setToolTipText("Muestra un Dialogo Acerca de...");
             menu2.add(miAcerca); 
             
             
             setVisible(true);
        }
        
        public void actionPerformed(ActionEvent e) {
            Container f=this.getContentPane();
            if (e.getSource()==mi2) {
                f.setBackground(new Color(0,255,0));
            }
            if (e.getSource()==mi1) {
                f.setBackground(new Color(255,0,0));
            }

            if (e.getSource()==mi3) {
                f.setBackground(new Color(0,0,255));
            }
            if (e.getSource()==miAcerca) {
                f.setBackground(new Color(0,0,0));

                Splash s = new Splash();
                s.titulo.setText(r.texto.getText());
        
            }
            
            if (e.getSource()==miFormulario) {
                
        r = new Registro();
        r.texto.setText("Datos desde el menu");
            }
        }

}
