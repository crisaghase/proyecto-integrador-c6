package Vista;

import java.sql.*;
import javax.swing.*;
import Controlador.*;
import Modelo.Ingrediente;
import Modelo.Plantilla;
import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class formReporteIngrediente extends javax.swing.JFrame {

    C_Ingrediente ci = new C_Ingrediente();
    List<Ingrediente> lista;
    String fec;
    String titulo = "Lista de Ingredientes";
    int i = 1;

    public formReporteIngrediente() {
        initComponents();
        cargarTablaIngredientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPaneIngredientes = new javax.swing.JScrollPane();
        tbIngredientes = new javax.swing.JTable();
        txtBuscarProv = new javax.swing.JTextField();
        txtBuscarIng = new javax.swing.JTextField();
        txtBuscarCat = new javax.swing.JTextField();
        btnBuscarIng = new javax.swing.JButton();
        btnBuscarCat = new javax.swing.JButton();
        btnBuscarPro = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btnAbrirPDF = new javax.swing.JButton();
        btnExpPDF = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();
        btnBuscarFec = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(139, 120, 162));

        jPanel1.setBackground(new java.awt.Color(139, 120, 162));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reporte de Ingredientes");

        tbIngredientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbIngredientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "CODIGO", "NOMBRE", "STOCK", "COD CAT", "COD PRO", "VENCIMIENTO"
            }
        ));
        jScrollPaneIngredientes.setViewportView(tbIngredientes);

        txtBuscarProv.setToolTipText("");
        txtBuscarProv.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtBuscarProvActionPerformed(evt);
            }
        });

        txtBuscarIng.setToolTipText("");
        txtBuscarIng.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtBuscarIngActionPerformed(evt);
            }
        });

        txtBuscarCat.setToolTipText("");
        txtBuscarCat.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtBuscarCatActionPerformed(evt);
            }
        });

        btnBuscarIng.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscarIng.setText("Buscar");
        btnBuscarIng.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarIngActionPerformed(evt);
            }
        });

        btnBuscarCat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscarCat.setText("Buscar");
        btnBuscarCat.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarCatActionPerformed(evt);
            }
        });

        btnBuscarPro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscarPro.setText("Buscar");
        btnBuscarPro.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarProActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Ingrediente:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Cod. del Proveedor:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Cod. de la Categoria:");

        btnAbrirPDF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAbrirPDF.setText("Abrir PDF");
        btnAbrirPDF.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAbrirPDFActionPerformed(evt);
            }
        });

        btnExpPDF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExpPDF.setText("Exportar PDF");
        btnExpPDF.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExpPDFActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Fecha de Vencimiento: ");

        DateChooser.setDateFormatString("yyyy-MM-dd");

        btnBuscarFec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscarFec.setText("Buscar");
        btnBuscarFec.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBuscarFecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel29)
                                .addComponent(jLabel31)
                                .addComponent(jLabel32)
                                .addComponent(jLabel30))
                            .addGap(58, 58, 58)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtBuscarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBuscarPro))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtBuscarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBuscarCat))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(DateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtBuscarIng, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBuscarIng)
                                        .addComponent(btnBuscarFec))))
                            .addContainerGap(170, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(170, 170, 170)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPaneIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(btnAbrirPDF)
                .addGap(88, 88, 88)
                .addComponent(btnExpPDF)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30)
                    .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarFec))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscarIng, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29))
                    .addComponent(btnBuscarIng))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPro)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCat)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrirPDF)
                    .addComponent(btnExpPDF))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarProvActionPerformed

    private void txtBuscarIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarIngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarIngActionPerformed

    private void txtBuscarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCatActionPerformed

    private void btnBuscarIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIngActionPerformed
        lista = ci.buscarIngrediente(txtBuscarIng.getText(), "nombre");
        BuscarCodIngrediente(lista);
        titulo = "Lista de Ingredientes segun el Nombre";
    }//GEN-LAST:event_btnBuscarIngActionPerformed

    private void btnBuscarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCatActionPerformed
        lista = ci.buscarIngrediente(txtBuscarCat.getText(), "codigoCat");
        BuscarCodIngrediente(lista);
        titulo = "Lista de Ingredientes segun el Codigo Categoría";
    }//GEN-LAST:event_btnBuscarCatActionPerformed

    private void btnBuscarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProActionPerformed
        lista = ci.buscarIngrediente(txtBuscarProv.getText(), "codigoPro");
        BuscarCodIngrediente(lista);
         titulo = "Lista de Ingredientes segun el Codigo Proveedor";
    }//GEN-LAST:event_btnBuscarProActionPerformed

    private void btnAbrirPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirPDFActionPerformed
        abrir();
    }//GEN-LAST:event_btnAbrirPDFActionPerformed

    private void btnExpPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpPDFActionPerformed
        Plantilla plantilla = new Plantilla(titulo);
        plantilla.crearPlantilla("lista"+i,titulo,lista);
        i++;
    }//GEN-LAST:event_btnExpPDFActionPerformed

    private void btnBuscarFecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFecActionPerformed
        fec = ((JTextField) DateChooser.getDateEditor().getUiComponent()).getText();
        Date fecha = Date.valueOf(fec);
        lista = ci.buscarFecha(fecha);
        BuscarCodIngrediente(lista);
        titulo = "Lista de Ingredientes Segun la Fecha de Vencimiento";
    }//GEN-LAST:event_btnBuscarFecActionPerformed

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
            java.util.logging.Logger.getLogger(formReporteIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formReporteIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formReporteIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formReporteIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formReporteIngrediente().setVisible(true);
            }
        });
    }

    private void cargarTablaIngredientes() {
        Connection c = Conexion.Conectar();
        lista= ci.getListaIngredientes();
        DefaultTableModel model = new DefaultTableModel();
        String query = "select * from Ingrediente";
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(query);
            tbIngredientes = new JTable(model);
            jScrollPaneIngredientes.setViewportView(tbIngredientes);
            model.addColumn("Codigo");
            model.addColumn("Nombre");
            model.addColumn("Stock");
            model.addColumn("Cod Categoria");
            model.addColumn("Cod Proveedor");
            model.addColumn("Vencimiento");
            while (rs.next()) {
                Object[] data = new Object[6];
                
                for (int i = 0; i < 6; i++) {
                    data[i] = rs.getObject(i + 1);
                }

                model.addRow(data);
            }

            c.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar los ingredientes a la tabla.");
        }
    }

    private void BuscarCodIngrediente(List<Ingrediente> lista) {
        DefaultTableModel model = new DefaultTableModel();
        tbIngredientes = new JTable(model);
        jScrollPaneIngredientes.setViewportView(tbIngredientes);
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Stock");
        model.addColumn("Cod Categoria");
        model.addColumn("Cod Proveedor");
        model.addColumn("Vencimiento");
        for (Ingrediente x : lista) {
            Object[] data = new Object[6];
            data[0] = (Object) x.getCodigo();
            data[1] = (Object) x.getNombre();
            data[2] = (Object) x.getStock();
            data[3] = (Object) x.getCodCategoria();
            data[4] = (Object) x.getCodProveedor();
            data[5] = (Object) x.getVencimiento();
            model.addRow(data);
        }
       
    }
    
     public void abrir(){
         int cont = i-1;   
         try {
                File path = new File("lista"+cont+".pdf");
                Desktop.getDesktop().open(path);
         } catch (Exception e) {
             System.out.println("Error al abrir el documento."+e.getMessage());
         }
        }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JButton btnAbrirPDF;
    private javax.swing.JButton btnBuscarCat;
    private javax.swing.JButton btnBuscarFec;
    private javax.swing.JButton btnBuscarIng;
    private javax.swing.JButton btnBuscarPro;
    private javax.swing.JButton btnExpPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneIngredientes;
    private javax.swing.JTable tbIngredientes;
    private javax.swing.JTextField txtBuscarCat;
    private javax.swing.JTextField txtBuscarIng;
    private javax.swing.JTextField txtBuscarProv;
    // End of variables declaration//GEN-END:variables
}
