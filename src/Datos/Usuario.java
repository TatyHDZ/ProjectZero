
package Datos;

public class Usuario {
    int idEmpleado, idSucursal;
    String nombre, cargo, PIN;
    double sueldo;

    public Usuario(int idEmpleado, int idSucursal, String nombre, String cargo, String PIN, double sueldo) {
        this.idEmpleado = idEmpleado;
        this.idSucursal = idSucursal;
        this.nombre = nombre;
        this.cargo = cargo;
        this.PIN = PIN;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
