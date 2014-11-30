package Datos;

public class InfoArticulo {
    
    String descripcion;
    float precio;
    int cantidad;
    //------------------
    int idArticulo;
    String codigo;
    int idAlmacen;

    public InfoArticulo(String descripcion, float precio, int cantidad, int idArticulo, String codigo, int idAlmacen) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.idArticulo = idArticulo;
        this.codigo = codigo;
        this.idAlmacen = idAlmacen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }


}
