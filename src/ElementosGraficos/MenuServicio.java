
package ElementosGraficos;

public class MenuServicio extends javax.swing.JPanel {

    public MenuServicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsuarioImagen = new javax.swing.JLabel();
        servicio = new javax.swing.JButton();
        caja = new javax.swing.JButton();
        mensajes = new javax.swing.JButton();
        Usuario = new javax.swing.JLabel();
        configuracion = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        UsuarioImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsuarioImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/user_circle.png"))); // NOI18N

        servicio.setBackground(new java.awt.Color(255, 255, 255));
        servicio.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        servicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/99.png"))); // NOI18N
        servicio.setText("Servicio");
        servicio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 0, 0)));
        servicio.setContentAreaFilled(false);
        servicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        servicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        servicio.setIconTextGap(12);
        servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicioActionPerformed(evt);
            }
        });

        caja.setBackground(new java.awt.Color(255, 255, 255));
        caja.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        caja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/110.png"))); // NOI18N
        caja.setText("Caja");
        caja.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 0, 0)));
        caja.setContentAreaFilled(false);
        caja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        caja.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        caja.setIconTextGap(12);

        mensajes.setBackground(new java.awt.Color(255, 255, 255));
        mensajes.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        mensajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/05.png"))); // NOI18N
        mensajes.setText("Mensajes");
        mensajes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 0, 0)));
        mensajes.setContentAreaFilled(false);
        mensajes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mensajes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mensajes.setIconTextGap(12);
        mensajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensajesActionPerformed(evt);
            }
        });

        Usuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/82.png"))); // NOI18N
        Usuario.setText("Funalo de Tal");

        configuracion.setBackground(new java.awt.Color(255, 255, 255));
        configuracion.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/40.png"))); // NOI18N
        configuracion.setText("Configuración");
        configuracion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 0, 0)));
        configuracion.setContentAreaFilled(false);
        configuracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        configuracion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        configuracion.setIconTextGap(12);
        configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Usuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(configuracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mensajes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(caja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(servicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UsuarioImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(UsuarioImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(servicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensajes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(configuracion)
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_servicioActionPerformed

    private void mensajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mensajesActionPerformed

    private void configuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_configuracionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel UsuarioImagen;
    private javax.swing.JButton caja;
    private javax.swing.JButton configuracion;
    private javax.swing.JButton mensajes;
    private javax.swing.JButton servicio;
    // End of variables declaration//GEN-END:variables
}
