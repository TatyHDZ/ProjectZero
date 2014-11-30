
package ElementosGraficos;


public class AccionProducto extends javax.swing.JPanel {
    int ID, almacen, cantidad;
    double precio;
    String descripcion;

    public AccionProducto() {
        initComponents();
    }
    
    /*
    Inicio de metodos de funcionamiento
    Requerimientos:
        Puntero
    
    
    */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guardar = new javax.swing.JButton();
        producto = new javax.swing.JTextField();
        numProducto = new javax.swing.JTextField();
        editarInfo = new javax.swing.JLabel();
        precioProducto = new javax.swing.JTextField();
        precioLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        guardar.setBackground(new java.awt.Color(255, 255, 255));
        guardar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/22.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(0, 0, 0)));
        guardar.setContentAreaFilled(false);
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        guardar.setIconTextGap(12);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        producto.setText("Producto");
        producto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        numProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numProducto.setText("1");
        numProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        editarInfo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        editarInfo.setText("Editar Información del Producto");

        precioProducto.setText("400.00");
        precioProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        precioLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        precioLabel.setText("Precio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(producto))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(precioLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(precioProducto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(guardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editarInfo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editarInfo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numProducto)
                    .addComponent(producto))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioLabel)
                    .addComponent(precioProducto))
                .addGap(255, 255, 255)
                .addComponent(guardar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel editarInfo;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField numProducto;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JTextField precioProducto;
    private javax.swing.JTextField producto;
    // End of variables declaration//GEN-END:variables
}
