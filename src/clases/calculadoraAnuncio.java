package clases;

import java.awt.Color;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class calculadoraAnuncio extends javax.swing.JFrame {
    
    //instanciando las clases
    Anuncio anuncio = new Anuncio();
    AnuncioTradicional tradicional = new AnuncioTradicional();
    AnuncioImagen conImagen = new AnuncioImagen();
    AnuncioClienteFrecuente  frecuente = new AnuncioClienteFrecuente();
      
    DecimalFormat format = new DecimalFormat(".00");
    DecimalFormat format2 = new DecimalFormat();

    //mover frame 
    int mouseX;
    int mouseY;   
    
    Icon icon = new javax.swing.ImageIcon(getClass().getResource("/images/error.png"));
   
    public calculadoraAnuncio() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/images/thumbnail.png")).getImage());//thumbnail
        
        btnFlecha.setVisible(false);
        bannerTipoAnuncio.setVisible(false);
       
        txtTitulo.setBorder(null);
        txtTitulo.setBackground(new Color(0,0,0,200));
        txtDescripcion.setBorder(null);
        txtDescripcion.setBackground(new Color(0,0,0,120));
        txtvalor.setBackground(new Color(0,0,0,120));
  
        txtvalor.setVisible(false);
        labelNuevosDatos.setVisible(false);
        labelSimbolo.setVisible(false);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        hidePanel = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnFlecha = new javax.swing.JButton();
        bannerTipoAnuncio = new javax.swing.JLabel();
        ventanas = new javax.swing.JTabbedPane();
        panelInicio = new javax.swing.JPanel();
        btnIngresarDatos = new javax.swing.JButton();
        btnImagen = new javax.swing.JToggleButton();
        btnFrecuente = new javax.swing.JToggleButton();
        btnTradicional = new javax.swing.JToggleButton();
        fondoPanelInicio = new javax.swing.JLabel();
        panelRegistro = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JTextField();
        btnGenerarReporte = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        labelSeccion = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        ComboSecciones = new javax.swing.JComboBox<>();
        jDate = new com.toedter.calendar.JDateChooser();
        labelNuevosDatos = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        labelSimbolo = new javax.swing.JLabel();
        validacion = new javax.swing.JLabel();
        fondoRegistro = new javax.swing.JLabel();
        panelResultados = new javax.swing.JPanel();
        SeccionResultado = new javax.swing.JLabel();
        fechaResultado = new javax.swing.JLabel();
        descripcionResultado = new javax.swing.JLabel();
        datoExtra = new javax.swing.JLabel();
        costoResultado = new javax.swing.JLabel();
        costoIvaResultado = new javax.swing.JLabel();
        tituloResultado = new javax.swing.JLabel();
        btnNuevoReporte = new javax.swing.JButton();
        fondoResultados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hidePanel.setBackground(new java.awt.Color(17, 22, 27));
        hidePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                hidePanelMouseDragged(evt);
            }
        });
        hidePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hidePanelMousePressed(evt);
            }
        });
        hidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimizar.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimizar.png"))); // NOI18N
        btnMinimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimizarHover.png"))); // NOI18N
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        hidePanel.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 40, 20));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrarHover.png"))); // NOI18N
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        hidePanel.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 40, 20));

        btnFlecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atras..png"))); // NOI18N
        btnFlecha.setBorder(null);
        btnFlecha.setBorderPainted(false);
        btnFlecha.setContentAreaFilled(false);
        btnFlecha.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atras..png"))); // NOI18N
        btnFlecha.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atrasHover.png"))); // NOI18N
        btnFlecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlechaActionPerformed(evt);
            }
        });
        hidePanel.add(btnFlecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        bannerTipoAnuncio.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        bannerTipoAnuncio.setForeground(new java.awt.Color(255, 255, 255));
        bannerTipoAnuncio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bannerTipoAnuncio.setText("tipo de anuncio");
        bannerTipoAnuncio.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bannerTipoAnuncio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        hidePanel.add(bannerTipoAnuncio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 230, 30));

        getContentPane().add(hidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 40));

        panelInicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelInicioMouseDragged(evt);
            }
        });
        panelInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelInicioMousePressed(evt);
            }
        });
        panelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIngresarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ingresarDatos.png"))); // NOI18N
        btnIngresarDatos.setBorder(null);
        btnIngresarDatos.setContentAreaFilled(false);
        btnIngresarDatos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ingresarDatos.png"))); // NOI18N
        btnIngresarDatos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ingDatosHover.png"))); // NOI18N
        btnIngresarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarDatosMouseClicked(evt);
            }
        });
        panelInicio.add(btnIngresarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, -1, -1));

        grupoBotones.add(btnImagen);
        btnImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Imagen.png"))); // NOI18N
        btnImagen.setBorder(null);
        btnImagen.setBorderPainted(false);
        btnImagen.setContentAreaFilled(false);
        btnImagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImagen.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Imagen.png"))); // NOI18N
        btnImagen.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Imagen.png"))); // NOI18N
        btnImagen.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ImagenHover.png"))); // NOI18N
        panelInicio.add(btnImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 160, 50));

        grupoBotones.add(btnFrecuente);
        btnFrecuente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/frecuente.png"))); // NOI18N
        btnFrecuente.setBorder(null);
        btnFrecuente.setContentAreaFilled(false);
        btnFrecuente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFrecuente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/frecuente.png"))); // NOI18N
        btnFrecuente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/frecuente.png"))); // NOI18N
        btnFrecuente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/frecuenteHover.png"))); // NOI18N
        panelInicio.add(btnFrecuente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 160, 50));

        grupoBotones.add(btnTradicional);
        btnTradicional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tradi.png"))); // NOI18N
        btnTradicional.setBorder(null);
        btnTradicional.setBorderPainted(false);
        btnTradicional.setContentAreaFilled(false);
        btnTradicional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTradicional.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tradi.png"))); // NOI18N
        btnTradicional.setRequestFocusEnabled(false);
        btnTradicional.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tradi.png"))); // NOI18N
        btnTradicional.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tradiHover.png"))); // NOI18N
        panelInicio.add(btnTradicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 160, 50));

        fondoPanelInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoInicio.png"))); // NOI18N
        fondoPanelInicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondoPanelInicioMouseDragged(evt);
            }
        });
        fondoPanelInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fondoPanelInicioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fondoPanelInicioMousePressed(evt);
            }
        });
        panelInicio.add(fondoPanelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 720));

        ventanas.addTab("tab1", panelInicio);

        panelRegistro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelRegistroMouseDragged(evt);
            }
        });
        panelRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelRegistroMousePressed(evt);
            }
        });
        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 141, 0));
        txtTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTitulo.setOpaque(false);
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 340, 50));

        btnGenerarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generarReporteHover.png"))); // NOI18N
        btnGenerarReporte.setBorder(null);
        btnGenerarReporte.setContentAreaFilled(false);
        btnGenerarReporte.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generarReporteHover.png"))); // NOI18N
        btnGenerarReporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generarReporte.png"))); // NOI18N
        btnGenerarReporte.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generarReporteHover.png"))); // NOI18N
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 210, 60));

        labelTitulo.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(203, 203, 203));
        labelTitulo.setText("Titulo");
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        labelSeccion.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        labelSeccion.setForeground(new java.awt.Color(203, 203, 203));
        labelSeccion.setText("Sección");
        jPanel1.add(labelSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        labelDescripcion.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        labelDescripcion.setForeground(new java.awt.Color(203, 203, 203));
        labelDescripcion.setText("Descripcion");
        jPanel1.add(labelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        labelFecha.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(203, 203, 203));
        labelFecha.setText("Fecha de publicación");
        jPanel1.add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        txtDescripcion.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 141, 0));
        txtDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescripcion.setOpaque(false);
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 470, 90));

        ComboSecciones.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        ComboSecciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacionales", "Internacionales", "Deportes", "Culturales", "Económicos" }));
        ComboSecciones.setOpaque(false);
        jPanel1.add(ComboSecciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 100, 20));

        jDate.setBackground(new java.awt.Color(17, 22, 27));
        jDate.setForeground(new java.awt.Color(0, 204, 255));
        jDate.setFont(new java.awt.Font("Bahnschrift", 0, 10)); // NOI18N
        jPanel1.add(jDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 140, 20));

        labelNuevosDatos.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        labelNuevosDatos.setForeground(new java.awt.Color(203, 203, 203));
        labelNuevosDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNuevosDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelNuevosDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 200, 30));

        txtvalor.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        txtvalor.setForeground(new java.awt.Color(255, 141, 0));
        txtvalor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtvalor.setBorder(null);
        txtvalor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtvalorKeyPressed(evt);
            }
        });
        jPanel1.add(txtvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 70, 30));

        labelSimbolo.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        labelSimbolo.setForeground(new java.awt.Color(203, 203, 203));
        labelSimbolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSimbolo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelSimbolo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(labelSimbolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 30, 30));

        validacion.setForeground(new java.awt.Color(255, 51, 51));
        validacion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(validacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 130, 20));

        fondoRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fondoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoBlack.png"))); // NOI18N
        fondoRegistro.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(fondoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 570, 680));

        panelRegistro.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 720));

        ventanas.addTab("tab2", panelRegistro);

        panelResultados.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelResultadosMouseDragged(evt);
            }
        });
        panelResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelResultadosMousePressed(evt);
            }
        });
        panelResultados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SeccionResultado.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        SeccionResultado.setForeground(new java.awt.Color(144, 143, 143));
        SeccionResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SeccionResultado.setText("seccion");
        SeccionResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelResultados.add(SeccionResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 220, 40));

        fechaResultado.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        fechaResultado.setForeground(new java.awt.Color(144, 143, 143));
        fechaResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechaResultado.setText("fecha");
        fechaResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelResultados.add(fechaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 220, 30));

        descripcionResultado.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        descripcionResultado.setForeground(new java.awt.Color(144, 143, 143));
        descripcionResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionResultado.setText("descripcion");
        descripcionResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelResultados.add(descripcionResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 520, 30));

        datoExtra.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        datoExtra.setForeground(new java.awt.Color(144, 143, 143));
        datoExtra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datoExtra.setText("dato extra");
        datoExtra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelResultados.add(datoExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 300, 40));

        costoResultado.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        costoResultado.setForeground(new java.awt.Color(216, 216, 216));
        costoResultado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        costoResultado.setText("costo");
        costoResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelResultados.add(costoResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 250, 40));

        costoIvaResultado.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        costoIvaResultado.setForeground(new java.awt.Color(216, 216, 216));
        costoIvaResultado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        costoIvaResultado.setText("costoIva");
        costoIvaResultado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelResultados.add(costoIvaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 250, 40));

        tituloResultado.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        tituloResultado.setForeground(new java.awt.Color(144, 143, 143));
        tituloResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloResultado.setText("titulo");
        tituloResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelResultados.add(tituloResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 220, 40));

        btnNuevoReporte.setForeground(new java.awt.Color(204, 204, 204));
        btnNuevoReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevoReporte.png"))); // NOI18N
        btnNuevoReporte.setBorder(null);
        btnNuevoReporte.setBorderPainted(false);
        btnNuevoReporte.setContentAreaFilled(false);
        btnNuevoReporte.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevoReporte.png"))); // NOI18N
        btnNuevoReporte.setRolloverEnabled(true);
        btnNuevoReporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevoReporteHover.png"))); // NOI18N
        btnNuevoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoReporteActionPerformed(evt);
            }
        });
        panelResultados.add(btnNuevoReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 170, 50));

        fondoResultados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fondoResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoResultados.jpg"))); // NOI18N
        fondoResultados.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelResultados.add(fondoResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 570, 680));

        ventanas.addTab("tab3", panelResultados);

        getContentPane().add(ventanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 570, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //activa ciertos componentes cuando se selecciona el anuncio con imagen o de cliente frecuente
    private void activarComponentes(String nuevosDatos, String simbolo){       
            labelNuevosDatos.setVisible(true);
            txtvalor.setVisible(true);
            labelSimbolo.setVisible(true);
            labelNuevosDatos.setText(nuevosDatos);
            labelSimbolo.setText(simbolo);  
    }
 
    private void btnIngresarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarDatosMouseClicked
        
        boolean pasarDePanel = true;

        try{

            grupoBotones.getSelection();
      
            if(grupoBotones.getSelection() == null){

                pasarDePanel = false;
                throw new NullPointerException();        
            }
            
        }catch(NullPointerException ex){

            JOptionPane.showMessageDialog(null,"Por favor, elija el tipo de anuncio", "Datos incompletos",0, icon);
        }
        
        
        if(pasarDePanel){
            hidePanel.setBackground(Color.decode("0x06759F"));
            ventanas.setSelectedIndex(1); //pasamos a la siguiente tab
            bannerTipoAnuncio.setVisible(true);//activamos el banner que muestra en texto cual tipo de anuncio se seleccionó
            btnFlecha.setVisible(true);
            txtvalor.setText("");
            
            if(btnTradicional.isSelected()){
                
                bannerTipoAnuncio.setText("Anuncio tradicional");
                txtvalor.setVisible(false);
                labelNuevosDatos.setVisible(false);
                labelSimbolo.setVisible(false);
            }else if(btnFrecuente.isSelected()){
                
                bannerTipoAnuncio.setText("Anuncio de cliente frecuente");
                activarComponentes("Digite el descuento deseado","%");

            }else if(btnImagen.isSelected()){
                
                bannerTipoAnuncio.setText("Anuncio con imagen");
                activarComponentes("Milimetros de la imagen", "mm");
            }
        }
        
    }//GEN-LAST:event_btnIngresarDatosMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setState(calculadoraAnuncio.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void fondoPanelInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanelInicioMouseClicked
        grupoBotones.clearSelection();
    }//GEN-LAST:event_fondoPanelInicioMouseClicked
   
    private boolean datosValidos(){
        
        boolean enviar = true;
        
        SimpleDateFormat fechaFormat = new SimpleDateFormat("dd-MMMM-yyyy");

        try{
            anuncio.setTitulo(txtTitulo.getText());
            anuncio.setDescripcion(txtDescripcion.getText());
            anuncio.setFecha(fechaFormat.format(jDate.getDate()));
            anuncio.setSeccion(ComboSecciones.getSelectedItem().toString());
            anuncio.setCosto(anuncio.costo(ComboSecciones));
            anuncio.setCostoIva(anuncio.costoIva(ComboSecciones));
                       
            if(txtTitulo.getText().length() > 15 ){ //este error se muestra hasta que todos los demás datos se hayan introducido

                JOptionPane.showMessageDialog(null,"El titulo no debe contener mas de 15 caracteres", "Titulo invalido",0,icon); 
                enviar = false;   
            }

            if(txtTitulo.getText().trim().equals("") || txtDescripcion.getText().trim().equals("")){
                throw new NullPointerException();
            }
                 
            if(btnFrecuente.isSelected() || btnImagen.isSelected()){
 
                try{

                    if(btnFrecuente.isSelected()){
                          frecuente.setDescuentoUsuario(Double.parseDouble(txtvalor.getText()));

                    }else if(btnImagen.isSelected()){
                          conImagen.setMilimetros(Double.parseDouble(txtvalor.getText()));
                    }

                    validacion.setText("");

                }catch(NumberFormatException e){
                        enviar = false;
                        validacion.setText("Numero invalido");
                }
            }
 
        }catch(NullPointerException ex){
            enviar = false;
            JOptionPane.showMessageDialog(null,"Por favor, rellene todos los campos", "Datos incompletos",0, icon);
        
        }
       
        return enviar;  
    }

    private void calculoAnuncioTradicional(){
             
       if(anuncio.descripcion.length() <15){//sin descuento

            String costoFormat = format.format(anuncio.getCosto());
            String costoIvaFormat = format.format(anuncio.getCostoIva());
 
            costoResultado.setText("Costo: ₡" + String.valueOf(costoFormat));
            costoIvaResultado.setText("Costo con IVA: ₡" + String.valueOf(costoIvaFormat));
            datoExtra.setText(String.valueOf("Descripción de "+ anuncio.descripcion.length()) + " caracteres (sin descuento)");

        }else if(anuncio.descripcion.length() >=15){//con descuento
             
            tradicional.setCosto(tradicional.costo(anuncio.costo, anuncio.descripcion));
            tradicional.setCostoIva(tradicional.costoIva());
                      
            String costoFormatDescuento = format.format(tradicional.getCosto());
            String costoIvaFormatDescuento = format.format(tradicional.getCostoIva());
                      
            //le damos valores para mostrar a los fields de resultados
            costoResultado.setText("Costo con descuento: ₡" + String.valueOf(costoFormatDescuento));
            costoIvaResultado.setText("Costo con descuento e IVA: ₡" + String.valueOf(costoIvaFormatDescuento));
            datoExtra.setText("Descripción de "+ String.valueOf(anuncio.descripcion.length()) + " caracteres (descuento aplicable)");     
        }
    }

    private void calculoAnuncioFrecuente(){
        
        frecuente.setCosto(frecuente.costo(anuncio.costo, frecuente.getDescuentoUsuario()));
        frecuente.setCostoIva(frecuente.costoIva(anuncio.costo, frecuente.getCosto()));
   
        String valorDescuento = format2.format(frecuente.getDescuentoUsuario());

        datoExtra.setText("Descuento de:  " + valorDescuento + "%");
        
        String costoFormat = format.format(frecuente.getCosto());
        String costoIvaFormat = format.format(frecuente.getCostoIva());
 
        costoResultado.setText("Costo con descuento: ₡" + String.valueOf(costoFormat));
        costoIvaResultado.setText("Costo con descuento e IVA: ₡" + String.valueOf(costoIvaFormat));  
    }
  
    private void calculoAnuncioImagen(){
      
        conImagen.costo(anuncio.costo, conImagen.getMilimetros());
        conImagen.costoIva(conImagen.getCosto(), conImagen.getMilimetros());
        
        String costoFormat = format.format(conImagen.getCosto());
        String costoIvaFormat = format.format(conImagen.getCostoIva());
        
        costoResultado.setText("Costo: ₡" + String.valueOf(costoFormat));
        costoIvaResultado.setText("Costo con IVA: ₡" + String.valueOf(costoIvaFormat));
        
        String milimetros = format2.format(conImagen.getMilimetros());
        String costoxmilimetro = format2.format(conImagen.getMilimetros()* 25);

        datoExtra.setText( milimetros + " milimetros   (₡" + costoxmilimetro + " extra)");

    }
 
    private void mostrarDatos(){
    
        tituloResultado.setText("Titulo:    " + anuncio.titulo.toUpperCase());
        SeccionResultado.setText("Sección:    " + anuncio.seccion.toUpperCase());
        fechaResultado.setText("Fecha:    " +anuncio.fecha.toUpperCase());
        descripcionResultado.setText("Descripción:   " +anuncio.descripcion.toUpperCase());
    }
   
    private void txtvalorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalorKeyPressed

        char input = evt.getKeyChar();

        try{
                       
            if(btnFrecuente.isSelected()){
                frecuente.setDescuentoUsuario(Double.parseDouble(txtvalor.getText()+input));

            }else if(btnImagen.isSelected()){
                conImagen.setMilimetros(Double.parseDouble(txtvalor.getText()+input));

            }
 
            validacion.setText("");

        }catch(NumberFormatException e){

            validacion.setText("Numero invalido");

        }
    }//GEN-LAST:event_txtvalorKeyPressed
 
    private void btnFlechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlechaActionPerformed
        
        if(ventanas.getSelectedIndex() == 2){
            hidePanel.setBackground(Color.decode("0x06759F"));

            ventanas.setSelectedIndex(1);
  
        } else if(ventanas.getSelectedIndex() == 1){
        
            ventanas.setSelectedIndex(0);
              
            hidePanel.setBackground(Color.decode("0x11161B"));
            grupoBotones.clearSelection();
            btnFlecha.setVisible(false);
            bannerTipoAnuncio.setVisible(false);
            txtvalor.setVisible(false);
            labelNuevosDatos.setVisible(false);
            labelSimbolo.setVisible(false);
            validacion.setText("");
        }

    }//GEN-LAST:event_btnFlechaActionPerformed

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed

            if(datosValidos()){
                
                ventanas.setSelectedIndex(2);
                
                hidePanel.setBackground(Color.decode("0xD90034"));

                
                if(btnTradicional.isSelected()){
                    
                    calculoAnuncioTradicional();
                    
                }else if(btnFrecuente.isSelected()){
                
                    calculoAnuncioFrecuente();
                    
                }else if(btnImagen.isSelected()){
                    
                    calculoAnuncioImagen();
                
                }
          
                mostrarDatos();          
                
            }
    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    private void btnNuevoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoReporteActionPerformed
        btnFlecha.setVisible(false);
        hidePanel.setBackground(Color.decode("0x11161B"));
        ventanas.setSelectedIndex(0);
        bannerTipoAnuncio.setVisible(false);
        grupoBotones.clearSelection();
        txtTitulo.setText("");
        txtDescripcion.setText("");
        ComboSecciones.setSelectedIndex(0);

    }//GEN-LAST:event_btnNuevoReporteActionPerformed

    //extras
    private void panelInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelInicioMousePressed
         mouseX = evt.getX();
       mouseY = evt.getY();
    }//GEN-LAST:event_panelInicioMousePressed

    private void panelInicioMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelInicioMouseDragged
       int coorX = evt.getXOnScreen();
        int coorY = evt.getYOnScreen();
        
        this.setLocation(coorX-mouseX, coorY-mouseY);
    }//GEN-LAST:event_panelInicioMouseDragged

    private void hidePanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePanelMouseDragged
        int coorX = evt.getXOnScreen();
        int coorY = evt.getYOnScreen();
        
        this.setLocation(coorX-mouseX, coorY-mouseY);
    }//GEN-LAST:event_hidePanelMouseDragged

    private void hidePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePanelMousePressed
        mouseX = evt.getX();
       mouseY = evt.getY();
    }//GEN-LAST:event_hidePanelMousePressed

    private void panelRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistroMousePressed
        mouseX = evt.getX();
       mouseY = evt.getY();
    }//GEN-LAST:event_panelRegistroMousePressed

    private void panelRegistroMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistroMouseDragged
       int coorX = evt.getXOnScreen();
        int coorY = evt.getYOnScreen();
        
        this.setLocation(coorX-mouseX, coorY-mouseY); 
    }//GEN-LAST:event_panelRegistroMouseDragged

    private void panelResultadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelResultadosMousePressed
        mouseX = evt.getX();
       mouseY = evt.getY();
    }//GEN-LAST:event_panelResultadosMousePressed

    private void panelResultadosMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelResultadosMouseDragged
        int coorX = evt.getXOnScreen();
        int coorY = evt.getYOnScreen();
        
        this.setLocation(coorX-mouseX, coorY-mouseY);
    }//GEN-LAST:event_panelResultadosMouseDragged

    private void fondoPanelInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanelInicioMousePressed
        mouseX = evt.getX();
       mouseY = evt.getY();
    }//GEN-LAST:event_fondoPanelInicioMousePressed

    private void fondoPanelInicioMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPanelInicioMouseDragged
        int coorX = evt.getXOnScreen();
        int coorY = evt.getYOnScreen();
        
        this.setLocation(coorX-mouseX, coorY-mouseY);
    }//GEN-LAST:event_fondoPanelInicioMouseDragged
//-----------------------------------------------------------------------------------
    
    //main
    public static void main(String args[]) {      
        try {           
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculadoraAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadoraAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadoraAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadoraAnuncio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadoraAnuncio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JComboBox<String> ComboSecciones;
    protected javax.swing.JLabel SeccionResultado;
    protected javax.swing.JLabel bannerTipoAnuncio;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnFlecha;
    protected javax.swing.JToggleButton btnFrecuente;
    private javax.swing.JButton btnGenerarReporte;
    protected javax.swing.JToggleButton btnImagen;
    private javax.swing.JButton btnIngresarDatos;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnNuevoReporte;
    protected javax.swing.JToggleButton btnTradicional;
    protected javax.swing.JLabel costoIvaResultado;
    protected javax.swing.JLabel costoResultado;
    protected javax.swing.JLabel datoExtra;
    protected javax.swing.JLabel descripcionResultado;
    protected javax.swing.JLabel fechaResultado;
    private javax.swing.JLabel fondoPanelInicio;
    private javax.swing.JLabel fondoRegistro;
    private javax.swing.JLabel fondoResultados;
    protected javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JPanel hidePanel;
    protected com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelFecha;
    protected javax.swing.JLabel labelNuevosDatos;
    private javax.swing.JLabel labelSeccion;
    protected javax.swing.JLabel labelSimbolo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JPanel panelResultados;
    protected javax.swing.JLabel tituloResultado;
    protected javax.swing.JTextField txtDescripcion;
    protected javax.swing.JTextField txtTitulo;
    protected javax.swing.JTextField txtvalor;
    protected javax.swing.JLabel validacion;
    private javax.swing.JTabbedPane ventanas;
    // End of variables declaration//GEN-END:variables
}