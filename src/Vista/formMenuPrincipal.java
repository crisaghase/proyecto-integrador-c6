package Vista;

import Modelo.DetalleVenta;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Controlador.Conexion;

public class formMenuPrincipal extends javax.swing.JFrame {

    // Variables venta
    String idVentaSeleccionada = "";
    // Lista que almacena los productos seleccionados por vender
    ArrayList<DetalleVenta> listaProductos = new ArrayList<>();

    public formMenuPrincipal() {
        initComponents();
        abrirPanel(null);

        // Cargar Historial
        cargarHistorialVentas();

        // Ventana Productos
        cargarTablaIngredientes();
        cargarTotalProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Botones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVender = new javax.swing.JButton();
        javax.swing.JButton btnIngresos = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Ventanas = new javax.swing.JPanel();
        jPanelVentanaProductos = new javax.swing.JPanel();
        jScrollPaneProductos = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrarProducto4 = new javax.swing.JButton();
        btnNuevaCategoriaProducto = new javax.swing.JButton();
        btnCategoriaProductos = new javax.swing.JButton();
        btnRegistrarProducto = new javax.swing.JButton();
        btnActualizarProducto = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        txtTotalProductos = new javax.swing.JTextField();
        jPanelVentanaHistorial = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPaneHistorial = new javax.swing.JScrollPane();
        tableHistorial = new javax.swing.JTable();
        jScrollDetalleVenta = new javax.swing.JScrollPane();
        tableHistorialDetalle = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVerDetalle = new javax.swing.JButton();
        jPanelVentanaVentas = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        Pastel_1 = new javax.swing.JPanel();
        btnPastelZanahoria = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        Pastel_2 = new javax.swing.JPanel();
        btnPastelMaracuya = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        Pastel_3 = new javax.swing.JPanel();
        btnPastelChocolate = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        btnHistorialVentas = new javax.swing.JButton();
        Pastel_5 = new javax.swing.JPanel();
        btnPastelCentral = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        Pastel_6 = new javax.swing.JPanel();
        btnPastelFresa = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        Pastel_4 = new javax.swing.JPanel();
        btnPastelVelvet = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jPanelVentanaIngresos = new javax.swing.JPanel();
        jScrollPaneProductos4 = new javax.swing.JScrollPane();
        jTableProductos4 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        btnRegistrarIngreso = new javax.swing.JButton();
        btnReporteIngreso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Botones.setBackground(new java.awt.Color(139, 120, 162));
        Botones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sueños");

        btnVender.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnVender.setText("Ventas");
        btnVender.setPreferredSize(new java.awt.Dimension(180, 40));
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnIngresos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnIngresos.setText("Ingresos");
        btnIngresos.setToolTipText("");
        btnIngresos.setPreferredSize(new java.awt.Dimension(180, 40));
        btnIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresosActionPerformed(evt);
            }
        });

        btnProductos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnProductos.setText("Ingrediente");
        btnProductos.setPreferredSize(new java.awt.Dimension(180, 40));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnCerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(180, 40));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" Azucarados");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("de la");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("pastelería");

        javax.swing.GroupLayout BotonesLayout = new javax.swing.GroupLayout(Botones);
        Botones.setLayout(BotonesLayout);
        BotonesLayout.setHorizontalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonesLayout.createSequentialGroup()
                .addGroup(BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BotonesLayout.createSequentialGroup()
                        .addGroup(BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BotonesLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel12))
                            .addGroup(BotonesLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addGroup(BotonesLayout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(16, 16, 16)))))
                            .addGroup(BotonesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonesLayout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addGroup(BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIngresos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        BotonesLayout.setVerticalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(76, 76, 76)
                .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(374, Short.MAX_VALUE))
        );

        Ventanas.setBackground(new java.awt.Color(211, 215, 221));
        Ventanas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanelVentanaProductos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVentanaProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelVentanaProductos.setEnabled(false);

        jTableProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableProductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "STOCK", "COD CAT", "COD PRO", "VENCIMIENTO"
            }
        ));
        jScrollPaneProductos.setViewportView(jTableProductos);
        if (jTableProductos.getColumnModel().getColumnCount() > 0) {
            jTableProductos.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("Ingrediente");

        btnRegistrarProducto4.setBackground(new java.awt.Color(139, 120, 162));
        btnRegistrarProducto4.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        btnRegistrarProducto4.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarProducto4.setText("Reportes");
        btnRegistrarProducto4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarProducto4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarProducto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProducto4ActionPerformed(evt);
            }
        });

        btnNuevaCategoriaProducto.setBackground(new java.awt.Color(139, 120, 162));
        btnNuevaCategoriaProducto.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnNuevaCategoriaProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaCategoriaProducto.setText("Nueva Categoria");
        btnNuevaCategoriaProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevaCategoriaProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevaCategoriaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCategoriaProductoActionPerformed(evt);
            }
        });

        btnCategoriaProductos.setBackground(new java.awt.Color(139, 120, 162));
        btnCategoriaProductos.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnCategoriaProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoriaProductos.setText("Categorias");
        btnCategoriaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCategoriaProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCategoriaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaProductosActionPerformed(evt);
            }
        });

        btnRegistrarProducto.setBackground(new java.awt.Color(139, 120, 162));
        btnRegistrarProducto.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnRegistrarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarProducto.setText("Registrar");
        btnRegistrarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductoActionPerformed(evt);
            }
        });

        btnActualizarProducto.setBackground(new java.awt.Color(139, 120, 162));
        btnActualizarProducto.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnActualizarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarProducto.setText("Actualizar");
        btnActualizarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductoActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel29.setText("Productos:");

        txtTotalProductos.setEditable(false);
        txtTotalProductos.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalProductos.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtTotalProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVentanaProductosLayout = new javax.swing.GroupLayout(jPanelVentanaProductos);
        jPanelVentanaProductos.setLayout(jPanelVentanaProductosLayout);
        jPanelVentanaProductosLayout.setHorizontalGroup(
            jPanelVentanaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaProductosLayout.createSequentialGroup()
                .addComponent(jLabel29)
                .addGap(30, 30, 30)
                .addComponent(txtTotalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentanaProductosLayout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(jPanelVentanaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentanaProductosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(198, 198, 198)
                        .addComponent(btnRegistrarProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentanaProductosLayout.createSequentialGroup()
                        .addComponent(jScrollPaneProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentanaProductosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCategoriaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNuevaCategoriaProducto)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanelVentanaProductosLayout.setVerticalGroup(
            jPanelVentanaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaProductosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelVentanaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(btnRegistrarProducto4))
                .addGap(24, 24, 24)
                .addComponent(jScrollPaneProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelVentanaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtTotalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelVentanaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCategoriaProductos)
                    .addComponent(btnRegistrarProducto)
                    .addComponent(btnActualizarProducto)
                    .addComponent(btnNuevaCategoriaProducto))
                .addGap(33, 33, 33))
        );

        jPanel12.setBackground(new java.awt.Color(36, 121, 121));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Historial de ventas");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tableHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Cliente", "Monto"
            }
        ));
        tableHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHistorialMouseClicked(evt);
            }
        });
        jScrollPaneHistorial.setViewportView(tableHistorial);

        tableHistorialDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N° Detalle", "N° Venta", "Cod Producto", "Cantidad", "Importe"
            }
        ));
        jScrollDetalleVenta.setViewportView(tableHistorialDetalle);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel9.setText("Detalle de Venta");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnVerDetalle.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnVerDetalle.setText("Ver");
        btnVerDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDetalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVerDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVerDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneHistorial)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollDetalleVenta)
                        .addContainerGap())
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(260, 260, 260))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollDetalleVenta)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelVentanaHistorialLayout = new javax.swing.GroupLayout(jPanelVentanaHistorial);
        jPanelVentanaHistorial.setLayout(jPanelVentanaHistorialLayout);
        jPanelVentanaHistorialLayout.setHorizontalGroup(
            jPanelVentanaHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaHistorialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVentanaHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelVentanaHistorialLayout.setVerticalGroup(
            jPanelVentanaHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaHistorialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelVentanaVentas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVentanaVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelVentanaVentas.setEnabled(false);

        jPanel10.setBackground(new java.awt.Color(139, 120, 162));

        btnPastelZanahoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPastelZanahoriaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Pastel de Zanahoria");

        javax.swing.GroupLayout Pastel_1Layout = new javax.swing.GroupLayout(Pastel_1);
        Pastel_1.setLayout(Pastel_1Layout);
        Pastel_1Layout.setHorizontalGroup(
            Pastel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pastel_1Layout.createSequentialGroup()
                .addGroup(Pastel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pastel_1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17))
                    .addGroup(Pastel_1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnPastelZanahoria, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        Pastel_1Layout.setVerticalGroup(
            Pastel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pastel_1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnPastelZanahoria, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        btnPastelMaracuya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPastelMaracuyaActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Pastel de Maracuyá");

        javax.swing.GroupLayout Pastel_2Layout = new javax.swing.GroupLayout(Pastel_2);
        Pastel_2.setLayout(Pastel_2Layout);
        Pastel_2Layout.setHorizontalGroup(
            Pastel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pastel_2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel21)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pastel_2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPastelMaracuya, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        Pastel_2Layout.setVerticalGroup(
            Pastel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pastel_2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnPastelMaracuya, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnPastelChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPastelChocolateActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Pastel de Chocolate");

        javax.swing.GroupLayout Pastel_3Layout = new javax.swing.GroupLayout(Pastel_3);
        Pastel_3.setLayout(Pastel_3Layout);
        Pastel_3Layout.setHorizontalGroup(
            Pastel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pastel_3Layout.createSequentialGroup()
                .addGroup(Pastel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pastel_3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22))
                    .addGroup(Pastel_3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnPastelChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pastel_3Layout.setVerticalGroup(
            Pastel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pastel_3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnPastelChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        titulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Nuestros pasteles");

        btnHistorialVentas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnHistorialVentas.setText("Historial");
        btnHistorialVentas.setToolTipText("");
        btnHistorialVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHistorialVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHistorialVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialVentasActionPerformed(evt);
            }
        });

        btnPastelCentral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPastelCentralActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Pastel Central");

        javax.swing.GroupLayout Pastel_5Layout = new javax.swing.GroupLayout(Pastel_5);
        Pastel_5.setLayout(Pastel_5Layout);
        Pastel_5Layout.setHorizontalGroup(
            Pastel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pastel_5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(Pastel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pastel_5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel24))
                    .addComponent(btnPastelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pastel_5Layout.setVerticalGroup(
            Pastel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pastel_5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnPastelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnPastelFresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPastelFresaActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Pastel de Fresa");

        javax.swing.GroupLayout Pastel_6Layout = new javax.swing.GroupLayout(Pastel_6);
        Pastel_6.setLayout(Pastel_6Layout);
        Pastel_6Layout.setHorizontalGroup(
            Pastel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pastel_6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(Pastel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(btnPastelFresa, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pastel_6Layout.setVerticalGroup(
            Pastel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pastel_6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnPastelFresa, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        btnPastelVelvet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPastelVelvetActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Pastel Velvet");

        javax.swing.GroupLayout Pastel_4Layout = new javax.swing.GroupLayout(Pastel_4);
        Pastel_4.setLayout(Pastel_4Layout);
        Pastel_4Layout.setHorizontalGroup(
            Pastel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pastel_4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(Pastel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pastel_4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel23))
                    .addComponent(btnPastelVelvet, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pastel_4Layout.setVerticalGroup(
            Pastel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pastel_4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnPastelVelvet, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(175, 175, 175))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(btnHistorialVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Pastel_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pastel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pastel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pastel_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Pastel_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pastel_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pastel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pastel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pastel_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pastel_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pastel_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pastel_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(btnHistorialVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanelVentanaVentasLayout = new javax.swing.GroupLayout(jPanelVentanaVentas);
        jPanelVentanaVentas.setLayout(jPanelVentanaVentasLayout);
        jPanelVentanaVentasLayout.setHorizontalGroup(
            jPanelVentanaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelVentanaVentasLayout.setVerticalGroup(
            jPanelVentanaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelVentanaIngresos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVentanaIngresos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelVentanaIngresos.setEnabled(false);

        jTableProductos4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableProductos4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTableProductos4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "DESCRIPCION", "PRECIO", "STOCK", "CATEGORIA"
            }
        ));
        jScrollPaneProductos4.setViewportView(jTableProductos4);
        if (jTableProductos4.getColumnModel().getColumnCount() > 0) {
            jTableProductos4.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel16.setText("Ingresos");

        btnRegistrarIngreso.setBackground(new java.awt.Color(139, 120, 162));
        btnRegistrarIngreso.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnRegistrarIngreso.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarIngreso.setText("Registrar Ingreso");
        btnRegistrarIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarIngreso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarIngresoActionPerformed(evt);
            }
        });

        btnReporteIngreso.setBackground(new java.awt.Color(139, 120, 162));
        btnReporteIngreso.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnReporteIngreso.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteIngreso.setText("Reportes");
        btnReporteIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReporteIngreso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporteIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteIngresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVentanaIngresosLayout = new javax.swing.GroupLayout(jPanelVentanaIngresos);
        jPanelVentanaIngresos.setLayout(jPanelVentanaIngresosLayout);
        jPanelVentanaIngresosLayout.setHorizontalGroup(
            jPanelVentanaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaIngresosLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanelVentanaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentanaIngresosLayout.createSequentialGroup()
                        .addComponent(btnRegistrarIngreso)
                        .addGap(177, 177, 177)
                        .addComponent(btnReporteIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentanaIngresosLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(493, 493, 493))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentanaIngresosLayout.createSequentialGroup()
                        .addComponent(jScrollPaneProductos4, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        jPanelVentanaIngresosLayout.setVerticalGroup(
            jPanelVentanaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaIngresosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneProductos4, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addGap(68, 68, 68)
                .addGroup(jPanelVentanaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporteIngreso)
                    .addComponent(btnRegistrarIngreso))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout VentanasLayout = new javax.swing.GroupLayout(Ventanas);
        Ventanas.setLayout(VentanasLayout);
        VentanasLayout.setHorizontalGroup(
            VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanasLayout.createSequentialGroup()
                    .addContainerGap(49, Short.MAX_VALUE)
                    .addComponent(jPanelVentanaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(93, 93, 93)))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelVentanaHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(66, Short.MAX_VALUE)))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(jPanelVentanaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(294, Short.MAX_VALUE)))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanasLayout.createSequentialGroup()
                    .addContainerGap(11, Short.MAX_VALUE)
                    .addComponent(jPanelVentanaIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(104, 104, 104)))
        );
        VentanasLayout.setVerticalGroup(
            VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1109, Short.MAX_VALUE)
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jPanelVentanaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(243, Short.MAX_VALUE)))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelVentanaHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jPanelVentanaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(277, Short.MAX_VALUE)))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jPanelVentanaIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(81, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ventanas, javax.swing.GroupLayout.PREFERRED_SIZE, 1221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ventanas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
        abrirPanel(jPanelVentanaVentas);
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresosActionPerformed
        // TODO add your handling code here:
        abrirPanel(jPanelVentanaIngresos);
        cargarHistorialDetalleVenta();
    }//GEN-LAST:event_btnIngresosActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
        abrirPanel(jPanelVentanaProductos);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        cerrarSesion();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnCategoriaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaProductosActionPerformed
        // TODO add your handling code here:
        formCategorias categorias = new formCategorias();
        categorias.setVisible(true);
        categorias.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnCategoriaProductosActionPerformed

    private void btnNuevaCategoriaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCategoriaProductoActionPerformed
        // TODO add your handling code here:
        formNuevaCategoria nuevaCategoria = new formNuevaCategoria();
        nuevaCategoria.setVisible(true);
        nuevaCategoria.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnNuevaCategoriaProductoActionPerformed

    private void btnActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProductoActionPerformed
        // TODO add your handling code here:
        formActualizarIngrediente actualizarProducto = new formActualizarIngrediente();
        actualizarProducto.setVisible(true);
        actualizarProducto.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                cargarTablaIngredientes();
            }
        });
    }//GEN-LAST:event_btnActualizarProductoActionPerformed

    private void btnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductoActionPerformed
        formRegistrarIngrediente registrarProducto = new formRegistrarIngrediente();
        registrarProducto.setVisible(true);
        registrarProducto.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        registrarProducto.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                cargarTablaIngredientes();
            }
        });
    }//GEN-LAST:event_btnRegistrarProductoActionPerformed

    private void btnVerDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDetalleActionPerformed
        // TODO add your handling code here:
        if (idVentaSeleccionada.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecciona una venta.");
        } else {
            cargarHistorialDetalleVenta();
        }
    }//GEN-LAST:event_btnVerDetalleActionPerformed

    private void tableHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHistorialMouseClicked
        // TODO add your handling code here:
        seleccionarVenta();
    }//GEN-LAST:event_tableHistorialMouseClicked

    private void btnRegistrarProducto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProducto4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarProducto4ActionPerformed

    private void txtTotalProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalProductosActionPerformed

    private void btnRegistrarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarIngresoActionPerformed

    private void btnReporteIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteIngresoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnReporteIngresoActionPerformed

    private void btnHistorialVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialVentasActionPerformed
        // TODO add your handling code here:
        abrirPanel(jPanelVentanaHistorial);
    }//GEN-LAST:event_btnHistorialVentasActionPerformed

    private void btnPastelZanahoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPastelZanahoriaActionPerformed
        // TODO add your handling code here:
        if (false) {
            JOptionPane.showMessageDialog(rootPane, "Consumo registrado.");
        }else{
            JOptionPane.showMessageDialog(rootPane, "No cuenta con los ingredientes suficientes.");
        }
    }//GEN-LAST:event_btnPastelZanahoriaActionPerformed

    private void btnPastelMaracuyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPastelMaracuyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPastelMaracuyaActionPerformed

    private void btnPastelChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPastelChocolateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPastelChocolateActionPerformed

    private void btnPastelVelvetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPastelVelvetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPastelVelvetActionPerformed

    private void btnPastelCentralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPastelCentralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPastelCentralActionPerformed

    private void btnPastelFresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPastelFresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPastelFresaActionPerformed

    // Permite activar SOLO el panel seleccionado
    private void abrirPanel(JPanel panel) {
        jPanelVentanaVentas.setVisible(false);
        jPanelVentanaProductos.setVisible(false);
        jPanelVentanaIngresos.setVisible(false);
        jPanelVentanaHistorial.setVisible(false);
        if (panel != null) {
            panel.setVisible(true);
        }
    }
    
//    // Registra una venta con todos los productos de la tabla
//    private void registrarVenta() {
//        Venta venta = new Venta();
//        DetalleVenta detalle = new DetalleVenta();
//        C_Ventas cv = new C_Ventas();
//        C_Cliente cc = new C_Cliente();
//
//        if (listaProductos.size() <= 0) {
//            JOptionPane.showMessageDialog(null, "Error: Llenar los campos.");
//        } else {
//            venta.setCodigo(txtBoleta.getText().trim());
//            venta.setCodigoCliente(cc.obtenerCodigoCliente(codigoClienteVenta));
//            venta.setImporte(Double.parseDouble(txtTotal.getText()));
//            // Intentamos registrar la venta en la BBDD
//            if (cv.registrarVenta(venta)) {
//                JOptionPane.showMessageDialog(null, "Venta registrada.");
//                // Registramos cada detalle de venta a la BBDD
//                System.out.println("Tamaño: " + listaProductos.size());
//                for (int i = 0; i < listaProductos.size(); i++) {
//                    detalle.setCodigoVenta(listaProductos.get(i).getCodigoVenta());
//                    detalle.setCodigoDetalleVenta(listaProductos.get(i).getCodigoDetalleVenta());
//                    detalle.setCodigoProducto(listaProductos.get(i).getCodigoProducto());
//                    detalle.setCantidad(listaProductos.get(i).getCantidad());
//                    detalle.setPrecio(listaProductos.get(i).getPrecio());
//                    detalle.setImporte(listaProductos.get(i).getImporte());
//                    if (cv.registrarDetalleVenta(detalle)) {
//                        cargarProductosParaVenta();
//                        txtSubtotal.setText("0.00");
//                        txtIGV.setText("0.00");
//                        txtTotal.setText("0.00");
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Error al registrar detalle de venta.....");
//                    }
//                }
//
//                colocarCodigoBoletaVenta();
//                actualizarProductosPostVenta();
//                cancelarVenta();
//                cargarHistorialVentas();
//
//            } else {
//                JOptionPane.showMessageDialog(null, "Error al registrar venta.");
//            }
//        }
//    }

    // Redondea los montos
    private double redondear(double n) {
        return (Math.round(n) * 100) / 100;
    }

    // <editor-fold defaultstate="collapsed" desc="Ventana Historial">
    // Carga en la tabla todas las ventas realizadas
    private void cargarHistorialVentas() {
        Connection c = Conexion.Conectar();
        DefaultTableModel model = new DefaultTableModel();
        String query = "select * from TB_Venta";
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(query);
            jScrollPaneHistorial.setViewportView(tableHistorial);
            model.addColumn("N° Boleta");
            model.addColumn("Monto");
            model.addColumn("Cliente");
            tableHistorial.setModel(model);
            while (rs.next()) {
                Object[] data = new Object[3];

                for (int i = 0; i < 3; i++) {
                    data[i] = rs.getObject(i + 1);
                }

                model.addRow(data);
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar el historial de ventas.");
        }
    }

    // Carga en la tabla todos los detalles de la venta seleccionada
    private void cargarHistorialDetalleVenta() {
        Connection c = Conexion.Conectar();
        DefaultTableModel model = new DefaultTableModel();
        String query = "select * from TB_DetalleVenta where codigo_ven = '" + idVentaSeleccionada + "'";
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(query);
            jScrollDetalleVenta.setViewportView(tableHistorialDetalle);
            model.addColumn("N° Detalle");
            model.addColumn("N° Venta");
            model.addColumn("Cod Producto");
            model.addColumn("Cantidad");
            model.addColumn("Importe");
            tableHistorialDetalle.setModel(model);
            while (rs.next()) {
                Object[] data = new Object[5];

                for (int i = 0; i < 5; i++) {
                    data[i] = rs.getObject(i + 1);
                }

                model.addRow(data);
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar el detalle de ventas.");
        }
    }

    // Obtiene el ID de la venta que estamos tocando en la tabla
    private void seleccionarVenta() {
        int fila = tableHistorial.getSelectedRow();
        idVentaSeleccionada = tableHistorial.getValueAt(fila, 0).toString().trim();
    }

    // Carga los productos de la BBDD a la tabla de Productos
    private void cargarTablaIngredientes() {
        Connection c = Conexion.Conectar();
        DefaultTableModel model = new DefaultTableModel();
        String query = "select * from Ingrediente";
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(query);
            jTableProductos = new JTable(model);
            jScrollPaneProductos.setViewportView(jTableProductos);
            model.addColumn("CODIGO");
            model.addColumn("NOMBRE");
            model.addColumn("STOCK");
            model.addColumn("COD CAT");
            model.addColumn("COD PRO");
            model.addColumn("VENCIMIENTO");
            while (rs.next()) {
                Object[] data = new Object[6];

                for (int i = 0; i < 6; i++) {
                    data[i] = rs.getObject(i + 1);
                }

                model.addRow(data);
            }

            c.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar los productos a la tabla.");
        }
    }
  
    private void cargarTotalProductos() {
        int i = 0;
        for (int j = 0; j < jTableProductos.getRowCount(); j++) {
            i++;
        }
        txtTotalProductos.setText(String.valueOf(i));

    }

    // <editor-fold defaultstate="collapsed" desc="Extras">
    private void cerrarSesion() {
        formLogin login = new formLogin();
        login.setVisible(true);
        this.dispose();
    }

    // </editor-fold> 
    
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
            java.util.logging.Logger.getLogger(formMenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formMenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formMenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formMenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formMenuPrincipal().setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botones;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Pastel_1;
    private javax.swing.JPanel Pastel_2;
    private javax.swing.JPanel Pastel_3;
    private javax.swing.JPanel Pastel_4;
    private javax.swing.JPanel Pastel_5;
    private javax.swing.JPanel Pastel_6;
    private javax.swing.JPanel Ventanas;
    private javax.swing.JButton btnActualizarProducto;
    private javax.swing.JButton btnCategoriaProductos;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnHistorialVentas;
    private javax.swing.JButton btnNuevaCategoriaProducto;
    private javax.swing.JButton btnPastelCentral;
    private javax.swing.JButton btnPastelChocolate;
    private javax.swing.JButton btnPastelFresa;
    private javax.swing.JButton btnPastelMaracuya;
    private javax.swing.JButton btnPastelVelvet;
    private javax.swing.JButton btnPastelZanahoria;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnRegistrarIngreso;
    private javax.swing.JButton btnRegistrarProducto;
    private javax.swing.JButton btnRegistrarProducto4;
    private javax.swing.JButton btnReporteIngreso;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVerDetalle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelVentanaHistorial;
    private javax.swing.JPanel jPanelVentanaIngresos;
    private javax.swing.JPanel jPanelVentanaProductos;
    private javax.swing.JPanel jPanelVentanaVentas;
    private javax.swing.JScrollPane jScrollDetalleVenta;
    private javax.swing.JScrollPane jScrollPaneHistorial;
    private javax.swing.JScrollPane jScrollPaneProductos;
    private javax.swing.JScrollPane jScrollPaneProductos4;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTable jTableProductos4;
    private javax.swing.JTable tableHistorial;
    private javax.swing.JTable tableHistorialDetalle;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtTotalProductos;
    // End of variables declaration//GEN-END:variables

    // </editor-fold> 
}
