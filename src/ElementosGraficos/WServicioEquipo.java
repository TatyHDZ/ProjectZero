
package ElementosGraficos;

import Datos.SQL;


public class WServicioEquipo extends javax.swing.JPanel {
    int ID, almacen, cantidad;
    double precio;
    String tipo, marca, modelo, descripcion, observaciones;
    String sentencia;
    SQL db;
    public WServicioEquipo() {
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
        titulo = new javax.swing.JLabel();
        producto1 = new javax.swing.JTextField();
        producto2 = new javax.swing.JTextField();
        producto3 = new javax.swing.JTextField();
        producto4 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        guardar.setBackground(new java.awt.Color(255, 255, 255));
        guardar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/22.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.setBorder(null);
        guardar.setContentAreaFilled(false);
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        guardar.setIconTextGap(12);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        producto.setText("Tipo");
        producto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productoMouseClicked(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Información del Equipo");

        producto1.setText("Marca");
        producto1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        producto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                producto1MouseClicked(evt);
            }
        });

        producto2.setText("Modelo");
        producto2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        producto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                producto2MouseClicked(evt);
            }
        });
        producto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producto2ActionPerformed(evt);
            }
        });

        producto3.setText("Descripcion");
        producto3.setToolTipText("");
        producto3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        producto3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                producto3MouseClicked(evt);
            }
        });

        producto4.setColumns(2);
        producto4.setText("Observaciones");
        producto4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        producto4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                producto4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(producto1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(producto)
                    .addComponent(producto2)
                    .addComponent(producto3)
                    .addComponent(producto4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(producto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(producto2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(producto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(producto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void Informacion(){
//        tipo = producto.getText();
        marca = producto1.getText();
        modelo = producto2.getText();
        descripcion = producto3.getText();
        observaciones = producto4.getText();       
        
        sentencia = "insert into equipo values("+tipo+","+marca+","+modelo+","+descripcion+","+observaciones+");";
        
        db.llamada(sentencia);
    }
    
    
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
       
    }//GEN-LAST:event_guardarActionPerformed

    private void producto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_producto2ActionPerformed

    private void productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productoMouseClicked
       producto.setText(null);
    }//GEN-LAST:event_productoMouseClicked

    private void producto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producto1MouseClicked
        producto1.setText(null);
    }//GEN-LAST:event_producto1MouseClicked

    private void producto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producto2MouseClicked
        producto2.setText(null);
    }//GEN-LAST:event_producto2MouseClicked

    private void producto3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producto3MouseClicked
        producto3.setText(null);
    }//GEN-LAST:event_producto3MouseClicked

    private void producto4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producto4MouseClicked
        producto4.setText(null);
    }//GEN-LAST:event_producto4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guardar;
    private javax.swing.JTextField producto;
    private javax.swing.JTextField producto1;
    private javax.swing.JTextField producto2;
    private javax.swing.JTextField producto3;
    private javax.swing.JTextField producto4;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
