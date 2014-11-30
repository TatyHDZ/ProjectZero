
package main;
import Datos.*;


public class MuereteJAVA {
    
    public static void main(String [] args){
    SQL db = new SQL();
    db.conectar();
        System.out.println(db.confirmarUsuario("Aurora Zambrano", "8985"));
        System.out.println(db.getEmpleado().getNombre());
    }
}
