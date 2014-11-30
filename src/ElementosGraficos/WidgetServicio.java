
package ElementosGraficos;

import javax.swing.BoxLayout;


public class WidgetServicio extends javax.swing.JPanel {


    public WidgetServicio() {
     
        initComponents();
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        concepto = new javax.swing.JButton();
        equipo = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        concepto.setBackground(new java.awt.Color(255, 255, 255));
        concepto.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        concepto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/09.png"))); // NOI18N
        concepto.setText("Concepto");
        concepto.setBorder(null);
        concepto.setContentAreaFilled(false);
        concepto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        concepto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        concepto.setIconTextGap(12);
        concepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conceptoActionPerformed(evt);
            }
        });

        equipo.setBackground(new java.awt.Color(255, 255, 255));
        equipo.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        equipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/99.png"))); // NOI18N
        equipo.setText("Equipo");
        equipo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(0, 0, 0)));
        equipo.setContentAreaFilled(false);
        equipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equipo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        equipo.setIconTextGap(12);
        equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipoActionPerformed(evt);
            }
        });

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        contenedor.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                contenedorComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(concepto, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(concepto)
                    .addComponent(equipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void conceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conceptoActionPerformed
        // TODO add your handling code here:
        
        contenedor.removeAll(); 
        contenedor.add( new WServicioConcepto() );
        this.updateUI();

    }//GEN-LAST:event_conceptoActionPerformed

    private void equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoActionPerformed

        contenedor.removeAll();
        contenedor.add( new WServicioEquipo() );
         this.updateUI();
       //contenedor.add( new WServicioConcepto() );
    }//GEN-LAST:event_equipoActionPerformed


    private void contenedorComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_contenedorComponentAdded
        // TODO add your handling code here:
        System.out.println("Componente Agregado");
        this.updateUI();
        
    }//GEN-LAST:event_contenedorComponentAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton concepto;
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton equipo;
    // End of variables declaration//GEN-END:variables
}
