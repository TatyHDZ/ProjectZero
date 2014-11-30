
package ElementosGraficos;

import Datos.SQL;
import Vistas.Venta;


public class BaseLogIn extends javax.swing.JPanel {
    SQL db;
    public boolean sepudo;
    Ventana ventana;
    
    public BaseLogIn() { 
        initComponents();
       
    }
public void setDependencias(SQL db, Ventana ventana){
    this.db = db; 
    this.ventana = ventana;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iniciar = new javax.swing.JButton();
        usuario = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iniciar.setBackground(null);
        iniciar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        iniciar.setForeground(new java.awt.Color(255, 255, 255));
        iniciar.setBorder(null);
        iniciar.setBorderPainted(false);
        iniciar.setContentAreaFilled(false);
        iniciar.setMaximumSize(new java.awt.Dimension(85, 35));
        iniciar.setMinimumSize(new java.awt.Dimension(85, 35));
        iniciar.setPreferredSize(new java.awt.Dimension(85, 35));
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        add(iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 290, 70));

        usuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        usuario.setBorder(null);
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 240, 40));

        pass.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        pass.setBorder(null);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 240, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/Login.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 380, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
       
    }//GEN-LAST:event_usuarioActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        accion();
    }//GEN-LAST:event_passActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        accion();
    }//GEN-LAST:event_iniciarActionPerformed
 public void accion(){
     System.out.println("Puché el botón de inicio de sesión");
     
     sepudo = db.confirmarUsuario(   usuario.getText(), pass.getText() );
     if( sepudo ){
         ventana.panelContenido.removeAll();
         ventana.venta = new Venta(ventana, db);
         ventana.panelContenido.updateUI();
         System.out.println("Ya entré al codigo");
    }
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
