

package Vistas;
import Datos.SQL;
import ElementosGraficos.*;

public class Venta {
MenuVentas menu;
CuerpoVentas cuerpo;
AccionProducto widget;
Ventana ventana;
SQL db;

    public Venta(Ventana ventana, SQL db) {
        this.ventana = ventana;
        this.db = db;
        
       menu = new MenuVentas();
       cuerpo = new CuerpoVentas(ventana,db);
       widget = new  AccionProducto();
        
       ventana.panelAccion.add( widget );
       ventana.panelContenido.add( cuerpo );
       ventana.panelLateral.add( menu );
    }
    public MenuVentas getMenu() {
        return menu;
    }
    public CuerpoVentas getCuerpo() {
        return cuerpo;
    }
    public AccionProducto getWidget() {
        return widget;
    }
    
}
