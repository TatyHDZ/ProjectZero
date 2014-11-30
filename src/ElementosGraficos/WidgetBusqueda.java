
package ElementosGraficos;

import Datos.InfoArticulo;
import Datos.SQL;
import java.util.ArrayList;
import javax.swing.BoxLayout;


public class WidgetBusqueda extends javax.swing.JPanel {
            
SQL db;
    public WidgetBusqueda(SQL db) {
                
        this.db = db;
        initComponents();
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        busqueda = new javax.swing.JTextField();
        iconoBusqueda = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenedor = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(268, 471));

        busqueda.setText("Busqueda");
        busqueda.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        busqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busquedaMouseClicked(evt);
            }
        });
        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });

        iconoBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/62.png"))); // NOI18N

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setMaximumSize(new java.awt.Dimension(400, 32767));
        contenedor.setPreferredSize(new java.awt.Dimension(300, 463));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(contenedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iconoBusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconoBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(busqueda))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
      ArrayList <InfoArticulo> listaArticulos;
      listaArticulos = db.getBusqueda(busqueda);
      
      contenedor.removeAll();
      for(  int x=0;  x<listaArticulos.size()  ;x++  ){
          contenedor.add(  new Articulo( listaArticulos.get(x) )  );
          System.out.println(  listaArticulos.get(x).getDescripcion()  );
      }
      this.updateUI();
      
        //ResultSet rs = db.resultado("select * from 'Articulo' where 'descripcion' like '%"+busqueda.getText()+"%';");
     //   ResultSet rs = db.resultado("select * from Articulo where descripcion like '"+busqueda.getText()+"%' and idAlmacen = 1;");
        

          
    }//GEN-LAST:event_busquedaActionPerformed

    private void busquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busquedaMouseClicked
       busqueda.setText("");
    }//GEN-LAST:event_busquedaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField busqueda;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel iconoBusqueda;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
