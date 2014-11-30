
package ElementosGraficos;

public class MenuAdmin extends javax.swing.JPanel {

    public MenuAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsuarioImagen = new javax.swing.JLabel();
        reportes = new javax.swing.JButton();
        caja = new javax.swing.JButton();
        mensajes = new javax.swing.JButton();
        Usuario = new javax.swing.JLabel();
        configuración = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        UsuarioImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsuarioImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/user_circle.png"))); // NOI18N

        reportes.setBackground(new java.awt.Color(255, 255, 255));
        reportes.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/133.png"))); // NOI18N
        reportes.setText("Reportes");
        reportes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 0, 0)));
        reportes.setContentAreaFilled(false);
        reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reportes.setIconTextGap(12);
        reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesActionPerformed(evt);
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

        configuración.setBackground(new java.awt.Color(255, 255, 255));
        configuración.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        configuración.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/40.png"))); // NOI18N
        configuración.setText("Configuración");
        configuración.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 0, 0)));
        configuración.setContentAreaFilled(false);
        configuración.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        configuración.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        configuración.setIconTextGap(12);
        configuración.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuraciónActionPerformed(evt);
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
                            .addComponent(configuración, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mensajes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(caja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(reportes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensajes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(configuración)
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportesActionPerformed

    private void mensajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mensajesActionPerformed

    private void configuraciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuraciónActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_configuraciónActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel UsuarioImagen;
    private javax.swing.JButton caja;
    private javax.swing.JButton configuración;
    private javax.swing.JButton mensajes;
    private javax.swing.JButton reportes;
    // End of variables declaration//GEN-END:variables
}
