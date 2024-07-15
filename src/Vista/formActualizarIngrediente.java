package Vista;

import Modelo.Ingrediente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Controlador.C_Ingrediente;
import Controlador.Conexion;

public class formActualizarIngrediente extends javax.swing.JFrame {

    String codigoIngrediente = "";

    public formActualizarIngrediente() {
        initComponents();
        cargarProductos();
        cargarCategorias();
        cargarProveedores();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxProductos = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        cbxProveedor = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        cbxTiempo = new javax.swing.JComboBox<>();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(139, 120, 162));

        jPanel1.setBackground(new java.awt.Color(139, 120, 162));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualizar ingrediente");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Producto:");

        cbxProductos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProductosActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Categoría :");

        cbxCategoria.setEditable(true);
        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Proveedor :");

        cbxProveedor.setEditable(true);
        cbxProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProveedorActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tiempo de vencimiento :");

        txtTiempo.setText("      ");

        cbxTiempo.setEditable(true);
        cbxTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "Mes" }));

        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(30, 30, 30)
                                        .addComponent(cbxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(19, 19, 19)))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxTiempo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        actualizarIngrediente();
        obtenerCodigoIngrediente();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void cbxProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProductosActionPerformed
        actualizarCategorias();
        actualizarProveedor();
        actualizarTiempo();
    }//GEN-LAST:event_cbxProductosActionPerformed

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCategoriaActionPerformed

    private void cbxProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProveedorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formActualizarIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formActualizarIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formActualizarIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formActualizarIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formActualizarIngrediente().setVisible(true);
            }
        });
    }

    private void cargarProductos() {
        Connection c = Conexion.Conectar();
        String query = "select * from ingrediente";
        Statement st;
        try {
            st = c.createStatement();
            ResultSet rs = st.executeQuery(query);
            cbxProductos.removeAllItems();
            cbxProductos.addItem("Seleccionar Producto:");
            while (rs.next()) {
                cbxProductos.addItem(rs.getString("Nombre"));
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("No se pudo cargar los productos " + e.getMessage());
        }
    }

    private void cargarCategorias() {
        Connection c = Conexion.Conectar();
        String sql = "select * from categoriaingrediente ";
        Statement st;
        try {
            st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            cbxCategoria.removeAllItems();
            cbxCategoria.addItem("Seleccione Categoria:");
            while (rs.next()) {
                cbxCategoria.addItem(rs.getString("nombre"));
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar categorias" + e.getMessage());
        }
    }

    private void cargarProveedores() {
        Connection c = Conexion.Conectar();
        String sql = "select * from Proveedor";
        Statement st;
        try {
            st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            cbxProveedor.removeAllItems();
            cbxProveedor.addItem("Seleccione Proveedor:");
            while (rs.next()) {
                cbxProveedor.addItem(rs.getString("nombre"));
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar categorias" + e.getMessage());
        }
    }

    //obtener el codigo de categoria segun el ingre
    private String obtenerCodigoCategoriaProveedorProducto(String palabra) {
        String query = "select * from ingrediente where nombre = '" + (String) cbxProductos.getSelectedItem() + "'";
        Statement st;
        String cod = "";
        try {
            Connection c = Conexion.Conectar();
            st = c.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                cod = rs.getString(palabra);
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener codigo de ingrediente");
        }

        return cod;
    }

    private void obtenerCodigoIngrediente() {
        String query = "select * from ingrediente where nombre = '" + cbxProductos.getSelectedItem() + "'";
        Statement st;
        try {
            Connection c = Conexion.Conectar();
            st = c.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                codigoIngrediente = rs.getString("codigo");
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener codigo de ingrediente");
        }
    }

    private String obtenerCodigoCategoria() {
        String query = "select * from categoriaingrediente where nombre = '" + cbxCategoria.getSelectedItem() + "'";
        Statement st;
        String cod = "";
        try {
            Connection c = Conexion.Conectar();
            st = c.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                cod = rs.getString("codigo");
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener codigo de categoriaingrediente");
        }

        return cod;
    }

    private String obtenerCodigoProveedor() {
        String query = "select * from proveedor where nombre = '" + cbxProveedor.getSelectedItem() + "'";
        Statement st;
        String codigoProveedor = "";
        try {
            Connection c = Conexion.Conectar();
            st = c.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                codigoProveedor = rs.getString("codigo");
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener codigo de categoriaingrediente");
        }
        return codigoProveedor;
    }

    private void actualizarIngrediente() {
        if (cbxProductos.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Error: Elegir producto.");
        } else {
            if (cbxCategoria.getSelectedIndex() == 0 ) {
                JOptionPane.showMessageDialog(null, "Error: Elegir la categoría.");
            } else {
                if (cbxProveedor.getSelectedIndex() == 0 ) {
                    JOptionPane.showMessageDialog(null, "Error: Elegir el proveedor.");
                } else {
                    if (txtTiempo.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Error: Elegir el tiempo.");
                    } else {
                        Ingrediente ingre = new Ingrediente();
                        C_Ingrediente c_ingre = new C_Ingrediente();
                        ingre.setCodCategoria(obtenerCodigoCategoria());
                        ingre.setCodProveedor(obtenerCodigoProveedor());
                        if (cbxTiempo.getSelectedIndex() == 1) {
                            int n = Integer.parseInt(txtTiempo.getText()) * 30;
                            ingre.setVencimiento(n);
                        } else {
                            ingre.setVencimiento(Integer.parseInt(txtTiempo.getText()));
                        }
                        if (c_ingre.actualizarIngrediente(ingre, codigoIngrediente)) {
                            JOptionPane.showMessageDialog(null, "Los datos del ingrediente ha sido actualizado.");
                            cbxProductos.setSelectedIndex(0);
                            cbxCategoria.setSelectedIndex(0);
                            cbxProveedor.setSelectedIndex(0);
                            txtTiempo.setText("");
                            cbxTiempo.setSelectedIndex(0);
                            cbxProductos.requestFocus();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al actualizar producto.");
                        }
                    }
                }
            }
        }
    }
    

    private void actualizarCategorias() {
        Connection c = Conexion.Conectar();
        String sql = "select * from categoriaingrediente ";
        int i = 1;
        Statement st;
        try {
            st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString(1).equals(obtenerCodigoCategoriaProveedorProducto("codigoCat"))) {
                    cbxCategoria.setSelectedIndex(i);
                }
                i++;
            }

            c.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar categorias" + e.getMessage());
        }
    }

    private void actualizarProveedor() {
        Connection c = Conexion.Conectar();
        String sql = "select * from Proveedor ";
        int i = 1;
        Statement st;
        try {
            st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString(1).equals(obtenerCodigoCategoriaProveedorProducto("codigoPro"))) {
                    cbxProveedor.setSelectedIndex(i);
                }
                i++;
            }

            c.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar categorias" + e.getMessage());
        }
    }

    private void actualizarTiempo() {
        Connection c = Conexion.Conectar();
        obtenerCodigoIngrediente();
        String sql = "select * from ingrediente where codigo='" + codigoIngrediente + "'";
        Statement st;
        try {
            st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            cbxTiempo.setSelectedIndex(0);
            txtTiempo.setText(rs.getString("vencimiento"));
            c.close();
        } catch (SQLException e) {
            System.out.println("Error o no owo " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JComboBox<String> cbxProductos;
    private javax.swing.JComboBox<String> cbxProveedor;
    private javax.swing.JComboBox<String> cbxTiempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables

    void addWindowListener() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
