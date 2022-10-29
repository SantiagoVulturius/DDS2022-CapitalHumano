package app;

import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class App {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setTitle("Menu Principal - Consultor");
        
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setSize(570, 700);
        ventana.setContentPane(new Menu(ventana));
        ventana.setVisible(true);

        
        
    }
     /*private void formWindowClosing(java.awt.event.WindowEvent evt) {
 cerrar();
 }
          public void cerrar(){
            int result = JOptionPane.showConfirmDialog(ventana, "¿Desea cerrar la aplicacion? No se guardaran los cambios realizados.", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
    if (result == JOptionPane.YES_OPTION){
        System.exit(0); } 
          }*/
}
