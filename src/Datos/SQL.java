/*
 * Inicializacion y Mantenimiento de la conneccion de mySQL
 *  Metodos:
 *  conectar(url, db, usuario, password) - crea una sesion de usuario en mySQL
 *  cerrarConexion() - cierra la conexion
 *  llamada() returns bool - se pudo o nel
 *  resultado(query) returns resultSet
 */

package Datos;
import ElementosGraficos.WidgetBusqueda;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQL {

public String bd = "dbtaller";
public String login = "taty";
public String password = "tatiana";

//Comentario para mi amiga andy, si ves ésto
//significa que se están ejecutando los cambios correctamente

public String url = "jdbc:mysql://TATYS-PC:3306/"+bd;  
Connection conn = null;
Statement s = null;
ResultSet rs = null;

ArrayList <InfoArticulo> articulos;
Usuario empleado;
Sucursal sucursal;

public void conectar() {

try {
    
    Class.forName("org.gjt.mm.mysql.Driver");
    conn = DriverManager.getConnection(url, login, password);
    s = conn.createStatement(); 
    rs = s.executeQuery ("select * from articulo"); //QUERY CONEXION BASE DE DATOS

            System.out.println("Connexion a base de datos "+url+" ... Ok");

         }
        catch(SQLException | ClassNotFoundException ex) {
        System.out.println( ex);
        
        }
        catch(NullPointerException e) {
        
        }
        
   }
public void cerrar(){
    try {
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
    }
}
public ResultSet resultado(String query){
      rs= null;     
    try {
       rs= s.executeQuery(query);
    } catch (SQLException ex) {
        Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
    }
 return rs;
 
}
public void llamada(String query){
    
    System.out.println(query);
    try {
        s.execute(query);
    } catch (SQLException ex) {
        Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
    }
}        
public ArrayList <InfoArticulo> getBusqueda( javax.swing.JTextField nombreArticulo){
  
     rs = this.resultado("select * from Articulo where descripcion like '%"+nombreArticulo.getText()+"%' and idSucursal = "+sucursal.getIdSucursal()+"");
  
    
    try {
        while ( rs.next() )
        { 
           
            articulos.add ( 
                new InfoArticulo(
                    rs.getString("descripcion"),
                    rs.getFloat("precio"),  
                    rs.getInt("existencia"),
                    rs.getInt("idArticulo"),
                    rs.getString("codigo"),
                    rs.getInt("idAlmacen") 
            ));
    
        }
    } catch (SQLException ex) {
        Logger.getLogger(WidgetBusqueda.class.getName()).log(Level.SEVERE, null, ex);
        
    }
    
    return articulos;


}
public boolean confirmarUsuario(String nombre, String PIN){
    System.out.println("confirmarUsuario: "+nombre+" " +PIN);
    
 //rs = this.resultado("select * from empleado where nombre = ' "+nombre+" ' and PIN = ' "+PIN+" '  ");
    rs = this.resultado("select * from empleado where nombre=' "+nombre+" ' and PIN=' "+PIN+" ' ");
    
    System.out.println("Select de empleado realizado correctamente");
    try {
        while ( rs.next() ) {
            System.out.println("Entré al while de confirmar usuario");
             empleado =  new Usuario ( 
                    rs.getInt("idEmpleado"),
                    rs.getInt("idSucursal"),  
                    rs.getString("nombre"),
                    rs.getString("cargo"),
                    rs.getString("PIN"),
                    rs.getDouble("sueldo") 
            );
    
        }
    } catch (SQLException ex) {
        Logger.getLogger(WidgetBusqueda.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("Error");
    }
    
    if( empleado == null ){
        return false;
    }else{
        return true;
    }
}
public Sucursal getSucursal(int idSucursal){
    rs = this.resultado("select * from sucursal where idSucursal = ' "+idSucursal+" ' ");
    try{
        while(rs.next()){
//            int idSucursal, String nombre, String direccion, String ciudad, String telefono
            sucursal = new Sucursal(rs.getInt("idSucursal"),
                                                        rs.getString("nombre"),
                                                        rs.getString("direccion"),
                                                        rs.getString("ciudad"),
                                                        rs.getString("telefono"));
        }
    }catch(SQLException ex){
      Logger.getLogger(WidgetBusqueda.class.getName()).log(Level.SEVERE, null, ex);
    }
    
return sucursal;
}
public Usuario getEmpleado() {
        return empleado;
    }


}



 



