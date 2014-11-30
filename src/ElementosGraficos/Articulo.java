

package ElementosGraficos;

import Datos.InfoArticulo;

public class Articulo extends javax.swing.JPanel {
    
String descripcion;
float precio;
int cantidad;
//------------------
int idArticulo;
String codigo;
int idAlmacen;

InfoArticulo articulo;

    public Articulo(InfoArticulo articulo) {
        this.articulo = articulo;
         
        descripcion = articulo.getDescripcion();
        precio = articulo.getPrecio();
        cantidad = articulo.getIdArticulo();
        idArticulo = articulo.getIdArticulo();
        codigo = articulo.getCodigo();
        idAlmacen = articulo.getIdAlmacen();
                
        initComponents();
        precioArticulo.setText("$ "+precio);
        nombreArticulo.setText(descripcion);
        numArticulo.setText(""+cantidad);    
    }



    public Articulo(String descripcion, float precio, int cantidad, int idArticulo, String codigo, int idAlmacen ) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.idArticulo = idArticulo;
        this.codigo =  codigo;
        this.idAlmacen = idAlmacen;
        
        initComponents();
        precioArticulo.setText(""+precio);
        nombreArticulo.setText(descripcion);
        numArticulo.setText(""+cantidad);        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        numArticulo = new javax.swing.JLabel();
        nombreArticulo = new javax.swing.JLabel();
        precioArticulo = new javax.swing.JLabel();
        iconArticulo = new javax.swing.JLabel();

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        numArticulo.setText("1");

        nombreArticulo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        nombreArticulo.setText("Disco Duro Externo 500GB");

        precioArticulo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        precioArticulo.setText("$200");

        iconArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/56.png"))); // NOI18N

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(precioArticulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconArticulo)
                .addContainerGap())
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(precioArticulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconArticulo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel iconArticulo;
    private javax.swing.JLabel nombreArticulo;
    private javax.swing.JLabel numArticulo;
    private javax.swing.JLabel precioArticulo;
    // End of variables declaration//GEN-END:variables
}
