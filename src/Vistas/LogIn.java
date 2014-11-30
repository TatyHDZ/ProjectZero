
package Vistas;

import Datos.SQL;
import ElementosGraficos.*;

public class LogIn {
    Ventana ventana;
    SQL db;

    public LogIn(Ventana ventana, SQL db) {
        this.ventana = ventana;
        this.db = db;
        
      //  ventana.panelContenido.add(new BaseLogIn(db) );
    }
    
    
}
