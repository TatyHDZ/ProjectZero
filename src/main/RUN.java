
package main;

import ElementosGraficos.Ventana;

public class RUN {

    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
        
    }
    
}
