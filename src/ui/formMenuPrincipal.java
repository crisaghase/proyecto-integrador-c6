package ui;

import code.Cliente;
import code.DetalleVenta;
import code.Producto;
import code.Usuario;
import code.Venta;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sql.C_Cliente;
import sql.C_Producto;
import sql.C_Usuario;
import sql.C_Ventas;
import sql.Conexion;

public class formMenuPrincipal extends javax.swing.JFrame {

    // Variables venta
    DefaultTableModel ventaModel = new DefaultTableModel();
    String codigoClienteVenta = "";
    String codigoProductoVenta = "";
    String nombreProductoVenta = "";
    String idVentaSeleccionada = "";
    double precioProductoVenta = 0; // Guarda el precio actual del producto seleccionado
    int stockProductoBBDDVenta = 0; // Guarda el stock actual del producto seleccionado
    // Lista que almacena los productos seleccionados por vender
    ArrayList<DetalleVenta> listaProductos = new ArrayList<>();

    public formMenuPrincipal() {
        initComponents();
        abrirPanel(null);

//        // Ventana Ventas
//        iniciarTablaVentas();
//        cargarProductosParaVenta();
//        colocarCodigoBoletaVenta();
//
//        // Cargar Historial
//        cargarHistorialVentas();
//
//        // Ventana Productos
//        cargarTablaProductos();
//        cargarTotalProductos();
//        
//        // Tabla Usuarios
//        cargarTablaUsuarios();
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
        jPanelVentanaVender = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        cbxBuscarProductoVenta = new javax.swing.JComboBox<>();
        txtCantidadVender = new javax.swing.JTextField();
        txtClienteDNI = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtBoleta = new javax.swing.JTextField();
        btnAñadirProducto = new javax.swing.JButton();
        txtClienteDatosVenta = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtIGV = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        btnCancelarVenta = new javax.swing.JButton();
        btnGenerarVenta = new javax.swing.JButton();
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
        jLabel15 = new javax.swing.JLabel();
        btnHistorialVentas = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnPastel4 = new javax.swing.JButton();
        btnPastel1 = new javax.swing.JButton();
        btnPastel2 = new javax.swing.JButton();
        btnPastel3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
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
        btnIngresos.setActionCommand("Ingresos");
        btnIngresos.setPreferredSize(new java.awt.Dimension(180, 40));
        btnIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresosActionPerformed(evt);
            }
        });

        btnProductos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnProductos.setText("Productos");
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
                .addContainerGap(176, Short.MAX_VALUE))
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
                "CODIGO", "NOMBRE", "DESCRIPCION", "PRECIO", "STOCK", "CATEGORIA"
            }
        ));
        jScrollPaneProductos.setViewportView(jTableProductos);
        if (jTableProductos.getColumnModel().getColumnCount() > 0) {
            jTableProductos.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("Productos");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelVentanaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentanaProductosLayout.createSequentialGroup()
                        .addGroup(jPanelVentanaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelVentanaProductosLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(30, 30, 30)
                                .addComponent(txtTotalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelVentanaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPaneProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelVentanaProductosLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(198, 198, 198)
                                    .addComponent(btnRegistrarProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21))))
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentanaProductosLayout.createSequentialGroup()
                        .addComponent(btnCategoriaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevaCategoriaProducto)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
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
                .addGap(26, 26, 26)
                .addGroup(jPanelVentanaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCategoriaProductos)
                    .addComponent(btnRegistrarProducto)
                    .addComponent(btnActualizarProducto)
                    .addComponent(btnNuevaCategoriaProducto))
                .addGap(25, 25, 25))
        );

        jPanelVentanaVender.setMaximumSize(new java.awt.Dimension(1000, 1000));

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel10.setText("Facturación");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(501, 501, 501))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel10)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Boleta:");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Cantidad:");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Producto:");

        cbxBuscarProductoVenta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbxBuscarProductoVenta.setForeground(new java.awt.Color(255, 255, 255));
        cbxBuscarProductoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar producto:", "Item 2", "Item 3", "Item 4" }));

        txtCantidadVender.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        txtClienteDNI.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        btnBuscarCliente.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cliente:");

        txtBoleta.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        btnAñadirProducto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAñadirProducto.setText("Añadir Producto");
        btnAñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirProductoActionPerformed(evt);
            }
        });

        txtClienteDatosVenta.setEditable(false);
        txtClienteDatosVenta.setBackground(new java.awt.Color(153, 153, 153));
        txtClienteDatosVenta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtClienteDatosVenta.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxBuscarProductoVenta, 0, 210, Short.MAX_VALUE)
                    .addComponent(txtClienteDatosVenta))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidadVender))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtClienteDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarCliente)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAñadirProducto)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txtClienteDNI)
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClienteDatosVenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxBuscarProductoVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCantidadVender)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAñadirProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(33, 33, 33))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Codigo", "Nombre", "Cantidad", "P. Unitario", "Total", "Editar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVenta.getTableHeader().setReorderingAllowed(false);
        tablaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVenta);
        if (tablaVenta.getColumnModel().getColumnCount() > 0) {
            tablaVenta.getColumnModel().getColumn(0).setResizable(false);
            tablaVenta.getColumnModel().getColumn(1).setResizable(false);
            tablaVenta.getColumnModel().getColumn(2).setResizable(false);
            tablaVenta.getColumnModel().getColumn(3).setResizable(false);
            tablaVenta.getColumnModel().getColumn(4).setResizable(false);
            tablaVenta.getColumnModel().getColumn(5).setResizable(false);
            tablaVenta.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Subtotal:");

        txtSubtotal.setEditable(false);
        txtSubtotal.setBackground(new java.awt.Color(153, 153, 153));
        txtSubtotal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("IGV:");

        txtIGV.setEditable(false);
        txtIGV.setBackground(new java.awt.Color(153, 153, 153));
        txtIGV.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Total");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(153, 153, 153));
        txtTotal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSubtotal))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIGV)
                            .addComponent(txtTotal))))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSubtotal)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIGV)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotal)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCancelarVenta.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnCancelarVenta.setText("Cancelar");
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });

        btnGenerarVenta.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnGenerarVenta.setText("Generar Venta");
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCancelarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelVentanaVenderLayout = new javax.swing.GroupLayout(jPanelVentanaVender);
        jPanelVentanaVender.setLayout(jPanelVentanaVenderLayout);
        jPanelVentanaVenderLayout.setHorizontalGroup(
            jPanelVentanaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelVentanaVenderLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(jPanelVentanaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelVentanaVenderLayout.setVerticalGroup(
            jPanelVentanaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaVenderLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelVentanaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelVentanaVenderLayout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nuestros pasteles");

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

        btnPastel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christina\\Desktop\\UTP\\Integrador\\proyecto-integrador-c6\\src\\imagenes\\cheescake_maracuya.png")); // NOI18N

        btnPastel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christina\\Desktop\\UTP\\Integrador\\proyecto-integrador-c6\\src\\imagenes\\carrot_cake.png")); // NOI18N

        btnPastel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christina\\Desktop\\UTP\\Integrador\\proyecto-integrador-c6\\src\\imagenes\\red_velvet.png")); // NOI18N

        btnPastel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christina\\Desktop\\UTP\\Integrador\\proyecto-integrador-c6\\src\\imagenes\\pastel_chocolate.png")); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Pastel de Zanahoria");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Pastel Red Vevet");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cheescake de Maracuya");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Pastel de Chocolate");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 114, Short.MAX_VALUE)
                .addComponent(btnPastel3)
                .addGap(49, 49, 49)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPastel4)
                    .addComponent(btnPastel2))
                .addGap(55, 55, 55))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(jLabel14))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHistorialVentas)
                .addGap(352, 352, 352))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(93, 93, 93))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(btnPastel1)
                    .addContainerGap(458, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(50, 50, 50)
                .addComponent(btnPastel2)
                .addGap(7, 7, 7)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(31, 31, 31)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPastel3)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnPastel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHistorialVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(btnPastel1)
                    .addContainerGap(492, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanelVentanaVentasLayout = new javax.swing.GroupLayout(jPanelVentanaVentas);
        jPanelVentanaVentas.setLayout(jPanelVentanaVentasLayout);
        jPanelVentanaVentasLayout.setHorizontalGroup(
            jPanelVentanaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelVentanaVentasLayout.setVerticalGroup(
            jPanelVentanaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaVentasLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            .addGroup(VentanasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelVentanaVender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanasLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelVentanaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 1059, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(203, 203, 203)))
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
            .addGroup(VentanasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelVentanaVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jPanelVentanaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(45, Short.MAX_VALUE)))
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
    }//GEN-LAST:event_btnIngresosActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
        abrirPanel(jPanelVentanaProductos);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        cerrarSesion();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
        if (buscarClienteVentas()) {
            cargarClienteVentas();
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no existe en BD.");
            txtClienteDNI.setText(null);
            txtClienteDNI.requestFocus();
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

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
        formActualizarProducto actualizarProducto = new formActualizarProducto();
        actualizarProducto.setVisible(true);
        actualizarProducto.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                cargarTablaProductos();
            }
        });
    }//GEN-LAST:event_btnActualizarProductoActionPerformed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
        // TODO add your handling code here:
        cancelarVenta();
    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    private void btnAñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirProductoActionPerformed
        // TODO add your handling code here:
        agregarProductoParaVenta();
    }//GEN-LAST:event_btnAñadirProductoActionPerformed

    private void tablaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentaMouseClicked
        // TODO add your handling code here:
        seleccionarProductoTablaVenta(evt);
    }//GEN-LAST:event_tablaVentaMouseClicked

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        // TODO add your handling code here:
        registrarVenta();
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    private void btnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductoActionPerformed
        formRegistrarProducto registrarProducto = new formRegistrarProducto();
        registrarProducto.setVisible(true);
        registrarProducto.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        registrarProducto.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                cargarTablaProductos();
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

    private void btnHistorialVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHistorialVentasActionPerformed

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

    // Permite activar SOLO el panel seleccionado
    private void abrirPanel(JPanel panel) {
        jPanelVentanaVentas.setVisible(false);
        jPanelVentanaProductos.setVisible(false);
        jPanelVentanaIngresos.setVisible(false);
        jPanelVentanaHistorial.setVisible(false);
        jPanelVentanaVender.setVisible(false);
        if (panel != null) {
            panel.setVisible(true);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Ventana Ventas">
    private void iniciarTablaVentas() {
        ventaModel.addColumn("N");
        ventaModel.addColumn("Codigo");
        ventaModel.addColumn("Nombre");
        ventaModel.addColumn("Cantidad");
        ventaModel.addColumn("P. Unitario");
        ventaModel.addColumn("Importe");
        ventaModel.addColumn("Editar");
        tablaVenta.setModel(ventaModel);

        txtSubtotal.setText("0.00");
        txtIGV.setText("0.00");
        txtTotal.setText("0.00");
    }

    private void colocarCodigoBoletaVenta(){
        C_Ventas cv = new C_Ventas();
        String boleta = cv.generarCodigo();
        txtBoleta.setText(boleta);
    }
    
    // Permite seleccionar una fila de la tabla para eleminar el Producto
    private void seleccionarProductoTablaVenta(MouseEvent evt) {
        System.out.println("Hola venta");
        int fila = tablaVenta.rowAtPoint(evt.getPoint());
        int columna = 0;
        int id = 0;
        if (fila > -1) {
            id = (int) ventaModel.getValueAt(fila, columna);
        }

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el producto?");
        switch (opcion) {
            case 0:
                listaProductos.remove(id - 1);
                agregarProductoATabla();
                calcularImporteVenta();
                break;
            case 1:
                break;
            default:
                throw new AssertionError();
        }
    }

    // Registra una venta con todos los productos de la tabla
    private void registrarVenta() {
        Venta venta = new Venta();
        DetalleVenta detalle = new DetalleVenta();
        C_Ventas cv = new C_Ventas();
        C_Cliente cc = new C_Cliente();

        if (listaProductos.size() <= 0) {
            JOptionPane.showMessageDialog(null, "Error: Llenar los campos.");
        } else {
            venta.setCodigo(txtBoleta.getText().trim());
            venta.setCodigoCliente(cc.obtenerCodigoCliente(codigoClienteVenta));
            venta.setImporte(Double.parseDouble(txtTotal.getText()));
            // Intentamos registrar la venta en la BBDD
            if (cv.registrarVenta(venta)) {
                JOptionPane.showMessageDialog(null, "Venta registrada.");
                // Registramos cada detalle de venta a la BBDD
                System.out.println("Tamaño: " + listaProductos.size());
                for (int i = 0; i < listaProductos.size(); i++) {
                    detalle.setCodigoVenta(listaProductos.get(i).getCodigoVenta());
                    detalle.setCodigoDetalleVenta(listaProductos.get(i).getCodigoDetalleVenta());
                    detalle.setCodigoProducto(listaProductos.get(i).getCodigoProducto());
                    detalle.setCantidad(listaProductos.get(i).getCantidad());
                    detalle.setPrecio(listaProductos.get(i).getPrecio());
                    detalle.setImporte(listaProductos.get(i).getImporte());
                    if (cv.registrarDetalleVenta(detalle)) {
                        cargarProductosParaVenta();
                        txtSubtotal.setText("0.00");
                        txtIGV.setText("0.00");
                        txtTotal.setText("0.00");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al registrar detalle de venta.....");
                    }
                }

                colocarCodigoBoletaVenta();
                actualizarProductosPostVenta();
                cancelarVenta();
                cargarHistorialVentas();

            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar venta.");
            }
        }
    }

    private void actualizarProductosPostVenta() {
        try {
            for (int i = 0; i < listaProductos.size(); i++) {
                String codProducto = listaProductos.get(i).getCodigoProducto().trim();
                System.out.println("Codigo postVenta: " + codProducto);
                int cantidadPorVender = listaProductos.get(i).getCantidad();
                System.out.println("Cantidad postVenta: " + cantidadPorVender);
                String query = "select * from Producto where codigo = '" + codProducto + "'";
                System.out.println("Query postVenta: " + query);
                int stockActual = 0;

                Connection c = Conexion.Conectar();
                Statement st = c.createStatement();
                ResultSet rs = st.executeQuery(query);
                if (rs.next()) {
                    stockActual = rs.getInt("stock");
                }

                Producto producto = new Producto();
                C_Producto cp = new C_Producto();

                int nuevoStock = stockActual - cantidadPorVender;
                producto.setStock(nuevoStock);
                if (cp.actualizarStock(producto, codProducto)) {
                    System.out.println("Stock Actualizado -> " + i);
                    cargarTablaProductos();
                } else {
                    System.out.println("No se pudo actualizar poo se st venta");
                }

            }
        } catch (SQLException e) {
            System.out.println("SQL Error: No se pudo actualizar el stock post venta.");
        }

    }

    // Obtiene los datos del producto seleccionado del Cbx
    private void obtenerDatosProductoParaVenta() {
        String query = "select * from Producto where nombre = '" + cbxBuscarProductoVenta.getSelectedItem() + "'";
        try {
            Connection c = Conexion.Conectar();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                codigoProductoVenta = rs.getString("codigo");
                nombreProductoVenta = rs.getString("nombre");
                precioProductoVenta = rs.getDouble("precio");
                stockProductoBBDDVenta = rs.getInt("stock");
                System.out.println(codigoProductoVenta);
                System.out.println(nombreProductoVenta);
                System.out.println(precioProductoVenta);
                System.out.println(stockProductoBBDDVenta);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener datos del producto" + e.getMessage());
        }
    }

    // Permite obtener los valores de un producto y agregarlo a la tabla
    private void agregarProductoParaVenta() {
        String productoSeleccionado = cbxBuscarProductoVenta.getSelectedItem().toString();
        if (productoSeleccionado.equals("Seleccionar producto:")) {
            JOptionPane.showMessageDialog(null, "Error: Seleccionar un producto válido.");
        } else if (txtClienteDatosVenta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: Ingresar Cliente.");
        } else {
            if (txtCantidadVender.getText().isEmpty() || Integer.parseInt(txtCantidadVender.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "Error: Ingresar cantidad.");
            } else {
                int cantidadVenta = Integer.parseInt(txtCantidadVender.getText()) + obtenerCantidadProductoAñadidoEnVenta();
                obtenerDatosProductoParaVenta();
                if (stockProductoBBDDVenta >= cantidadVenta) {
                    double importe = redondear(cantidadVenta * precioProductoVenta);
                    System.out.println(codigoClienteVenta + codigoProductoVenta.trim() + txtBoleta.getText());
                    DetalleVenta producto = new DetalleVenta(codigoClienteVenta + codigoProductoVenta.trim() + txtBoleta.getText().trim(),
                            txtBoleta.getText(),
                            codigoProductoVenta, nombreProductoVenta, Integer.parseInt(txtCantidadVender.getText()), precioProductoVenta, importe);
                    listaProductos.add(producto);
                    agregarProductoATabla();
                    cargarProductosParaVenta();
                    calcularImporteVenta();

                    JOptionPane.showMessageDialog(null, "Producto agregado.");
                    txtCantidadVender.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Cantidad supera el stock\nStock restante: "
                            + (stockProductoBBDDVenta - obtenerCantidadProductoAñadidoEnVenta()));
                }
            }
        }
    }

    // Agrega un producto a la tabla de ventas
    private void agregarProductoATabla() {
        ventaModel.setRowCount(listaProductos.size());
        for (int i = 0; i < listaProductos.size(); i++) {
            ventaModel.setValueAt(i + 1, i, 0);
            ventaModel.setValueAt(listaProductos.get(i).getCodigoProducto(), i, 1);
            ventaModel.setValueAt(listaProductos.get(i).getNombre(), i, 2);
            ventaModel.setValueAt(listaProductos.get(i).getCantidad(), i, 3);
            ventaModel.setValueAt(listaProductos.get(i).getPrecio(), i, 4);
            ventaModel.setValueAt(listaProductos.get(i).getImporte(), i, 5);
            ventaModel.setValueAt("Eliminar", i, 6);
        }
        tablaVenta.setModel(ventaModel);
    }

    // Regresa la cantidad de un producto en la tabla de ventas
    // Nos ayuda a evaluar el no pasarnos del stock
    private int obtenerCantidadProductoAñadidoEnVenta() {
        int cantidadProductoPorVender = 0;
        for (int i = 0; i < tablaVenta.getRowCount(); i++) {
            String codigo = (String) ventaModel.getValueAt(i, 1);
            if (codigoProductoVenta.equals(codigo)) {
                cantidadProductoPorVender += (int) ventaModel.getValueAt(i, 3);

            }
        }
        System.out.println("Total ahora: " + cantidadProductoPorVender);
        return cantidadProductoPorVender;
    }

    // Calcula el importe total de la venta
    private void calcularImporteVenta() {
        double total = 0;
        for (DetalleVenta producto : listaProductos) {
            total += producto.getImporte();
        }

        double IGV = redondear(total * 0.18);
        double importeSubTotal = total - IGV;
        txtSubtotal.setText(String.valueOf(importeSubTotal));
        txtIGV.setText(String.valueOf(IGV));
        txtTotal.setText(String.valueOf(total));

    }

    private boolean buscarClienteVentas() {
        C_Cliente cliente = new C_Cliente();
        boolean existe = cliente.existeCliente(txtClienteDNI.getText());
        return existe;
    }

    private void cargarClienteVentas() {
        C_Cliente cliente = new C_Cliente();
        String nombre = cliente.obtenerNombreCliente(txtClienteDNI.getText());
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "DNI no existe en la BD.");
        } else {
            txtClienteDatosVenta.setText(nombre);
            codigoClienteVenta = txtClienteDNI.getText();
            txtClienteDNI.setEditable(false);
            txtClienteDNI.setText(null);
        }
    }

    // Cargar los productos en el combo box de la ventana Venta
    private void cargarProductosParaVenta() {
        Connection c = Conexion.Conectar();
        String query = "select * from Producto";
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(query);
            cbxBuscarProductoVenta.removeAllItems();
            cbxBuscarProductoVenta.addItem("Seleccionar producto:");
            while (rs.next()) {
                cbxBuscarProductoVenta.addItem(rs.getString("Nombre"));
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar productos " + e.getMessage());
        }
    }

    // Reinicia la ventana
    private void cancelarVenta() {
        txtClienteDatosVenta.setText(null);
        txtClienteDNI.setEditable(true);
        txtClienteDNI.requestFocus();
        listaProductos.clear();
        txtSubtotal.setText("0.00");
        txtIGV.setText("0.00");
        txtTotal.setText("0.00");
        agregarProductoATabla();
    }

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

    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Ventana Productos">
    // Carga los productos de la BBDD a la tabla de Productos
    private void cargarTablaProductos() {
        Connection c = Conexion.Conectar();
        DefaultTableModel model = new DefaultTableModel();
        String query = "select * from Producto";
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(query);
            jTableProductos = new JTable(model);
            jScrollPaneProductos.setViewportView(jTableProductos);
            model.addColumn("Codigo");
            model.addColumn("Nombre");
            model.addColumn("Descripcion");
            model.addColumn("Stock");
            model.addColumn("Precio");
            model.addColumn("Categoria");
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

//    // </editor-fold> 
//    // <editor-fold defaultstate="collapsed" desc="Ventana Usuarios">
//    private void seleccionarUsuarioDeTabla() {
//        try {
//            int fila = tblUsuarios.getSelectedRow();
//            String id = tblUsuarios.getValueAt(fila, 0).toString().trim();
//            PreparedStatement ps;
//            ResultSet rs;
//
//            Connection c = Conexion.Conectar();
//            ps = c.prepareStatement("select codigo, usuario, contraseña, telefono from Usuario where codigo=?");
//            ps.setString(1, id);
//            rs = ps.executeQuery();
//
//            while (rs.next()) {
//                // txtUsuarioCodigo.setText(String.valueOf(id));
//                txtUsuarioCodigo.setText(rs.getString("codigo"));
//                txtUsuarioUser.setText(rs.getString("usuario"));
//                txtUsuarioContra.setText(rs.getString("contraseña"));
//                txtUsuarioTelefono.setText(rs.getString("telefono"));
//
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error al cargar Usuarios");
//        }
//    }
//
//    private void actualizarUsuario() {
//        if (txtUsuarioCodigo.getText().isEmpty() || txtUsuarioUser.getText().isEmpty()
//                || txtUsuarioContra.getText().isEmpty() || txtUsuarioTelefono.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Error: Llenar el stock por agregar.");
//        } else {
//            if (txtUsuarioCodigo.getText().isEmpty() == false) {
//                Usuario usuario = new Usuario();
//                C_Usuario cu = new C_Usuario();
//
//                String CodigoActual = txtUsuarioCodigo.getText().trim();
//                String UsuarioActual = txtUsuarioUser.getText();
//                String ContraActual = txtUsuarioContra.getText();
//                String TelefonoActual = txtUsuarioTelefono.getText();
//                usuario.setCodigo(CodigoActual);
//                usuario.setUsuario(UsuarioActual);
//                usuario.setContraseña(ContraActual);
//                usuario.setTelefono(TelefonoActual);
//                if (cu.actualizarUsuario(usuario, CodigoActual)) {
//                    JOptionPane.showMessageDialog(null, "Usuario actualizado.");
//
//                    txtUsuarioCodigo.setText(null);
//                    txtUsuarioUser.setText(null);
//                    txtUsuarioContra.setText(null);
//                    txtUsuarioTelefono.setText(null);
//                } else {
//                    JOptionPane.showMessageDialog(null, "Error al actualizar Usuario");
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "Error");
//            }
//        }
//    }
//
//    private void cargarTablaUsuarios() {
//        Connection c = Conexion.Conectar();
//        DefaultTableModel model = new DefaultTableModel();
//        String query = "select * from Usuario";
//        Statement st;
//        try {
//            st = c.createStatement();
//            ResultSet rs = st.executeQuery(query);
//            // tblUsuarios = new JTable(model);
//            jScrollPaneUsuarios.setViewportView(tblUsuarios);
//            model.addColumn("codigo");
//            model.addColumn("nombre");
//            model.addColumn("apellido");
//            model.addColumn("usuario");
//            model.addColumn("contraseña");
//            model.addColumn("telefono");
//            model.addColumn("edad");
//            model.addColumn("sexo");
//            tblUsuarios.setModel(model);
//            while (rs.next()) {
//                Object[] data = new Object[8];
//                for (int i = 0; i < 8; i++) {
//                    data[i] = rs.getObject(i + 1);
//                }
//
//                model.addRow(data);
//            }
//            c.close();
//        } catch (SQLException e) {
//            System.out.println("Error al cargar las categorías.");
//        }
//    }
//
//    private void eliminarUsuario() {
//        Usuario usuario = new Usuario();
//        C_Usuario cu = new C_Usuario();
//        String CodigoActualUsuario = txtUsuarioCodigo.getText().trim();
//        usuario.setCodigo(CodigoActualUsuario);
//        while (cu.eliminarUsuario(usuario, CodigoActualUsuario)) {
//            JOptionPane.showMessageDialog(null, "Usuario Eliminado Correctamente");
//        }
//    }
//
//    // Limpiar Datos usuario
//    private void limpiarUsuario() {
//        txtUsuarioCodigo.setText("");
//        txtUsuarioUser.setText("");
//        txtUsuarioContra.setText("");
//        txtUsuarioTelefono.setText("");
//    }

    // </editor-fold> 
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
    private javax.swing.JPanel Ventanas;
    private javax.swing.JButton btnActualizarProducto;
    private javax.swing.JButton btnActualizarProducto1;
    private javax.swing.JButton btnActualizarProducto2;
    private javax.swing.JButton btnAñadirProducto;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnCategoriaProductos;
    private javax.swing.JButton btnCategoriaProductos1;
    private javax.swing.JButton btnCategoriaProductos2;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JButton btnHistorialVentas;
    private javax.swing.JButton btnNuevaCategoriaProducto;
    private javax.swing.JButton btnNuevaCategoriaProducto1;
    private javax.swing.JButton btnNuevaCategoriaProducto2;
    private javax.swing.JButton btnPastel1;
    private javax.swing.JButton btnPastel2;
    private javax.swing.JButton btnPastel3;
    private javax.swing.JButton btnPastel4;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnRegistrarIngreso;
    private javax.swing.JButton btnRegistrarProducto;
    private javax.swing.JButton btnRegistrarProducto1;
    private javax.swing.JButton btnRegistrarProducto2;
    private javax.swing.JButton btnRegistrarProducto4;
    private javax.swing.JButton btnReporteIngreso;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVerDetalle;
    private javax.swing.JComboBox<String> cbxBuscarProductoVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelVentanaHistorial;
    private javax.swing.JPanel jPanelVentanaIngresos;
    private javax.swing.JPanel jPanelVentanaProductos;
    private javax.swing.JPanel jPanelVentanaProductos1;
    private javax.swing.JPanel jPanelVentanaProductos2;
    private javax.swing.JPanel jPanelVentanaVender;
    private javax.swing.JPanel jPanelVentanaVentas;
    private javax.swing.JScrollPane jScrollDetalleVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneHistorial;
    private javax.swing.JScrollPane jScrollPaneProductos;
    private javax.swing.JScrollPane jScrollPaneProductos1;
    private javax.swing.JScrollPane jScrollPaneProductos2;
    private javax.swing.JScrollPane jScrollPaneProductos4;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTable jTableProductos1;
    private javax.swing.JTable jTableProductos2;
    private javax.swing.JTable jTableProductos4;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTable tableHistorial;
    private javax.swing.JTable tableHistorialDetalle;
    private javax.swing.JTextField txtBoleta;
    private javax.swing.JTextField txtCantidadVender;
    private javax.swing.JTextField txtClienteDNI;
    private javax.swing.JTextField txtClienteDatosVenta;
    private javax.swing.JTextField txtIGV;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalProductos;
    private javax.swing.JTextField txtTotalProductos1;
    private javax.swing.JTextField txtTotalProductos2;
    // End of variables declaration//GEN-END:variables

    // </editor-fold> 
}
