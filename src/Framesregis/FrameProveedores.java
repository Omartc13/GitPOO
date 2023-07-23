package Framesregis;

import ArrayList.CAPExternoArray;
import ArrayList.CAPInternoArray;
import Clases.CAPExterno;
import Clases.CAPInterno;
import conexionbd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author alan
 */
public class FrameProveedores extends javax.swing.JFrame {
    DefaultTableModel tinterno = new DefaultTableModel();
    DefaultTableModel texterno = new DefaultTableModel();
    CAPExternoArray capea = new CAPExternoArray();
    CAPInternoArray capia= new CAPInternoArray() ;
    Conexion db= new Conexion();
    Connection cn=  db.conectar();
    
    public FrameProveedores() {
        initComponents();
        setLocationRelativeTo(null);
        db.conectar();
        mostrartabinet();
        mostrartabExterno();
       }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        TXTnomPI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXTDNIPI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CMBarea = new javax.swing.JComboBox<>();
        BTNguardarPI = new javax.swing.JButton();
        BTNvolverPI = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInterno = new javax.swing.JTable();
        BTNLimpiarPI = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TXTnomPE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TXTruc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TXTañoPE = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TXTtelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TXTcorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TXTdirec = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TXTencar = new javax.swing.JTextField();
        BTNguardarPE = new javax.swing.JButton();
        BTNvolverPE = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblExterno = new javax.swing.JTable();
        BTNLimpiarPE = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(187, 187, 187));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 217, 234));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTnomPI.setBackground(new java.awt.Color(246, 241, 241));
        TXTnomPI.setName(""); // NOI18N
        TXTnomPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTnomPIActionPerformed(evt);
            }
        });
        TXTnomPI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTnomPIKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTnomPIKeyTyped(evt);
            }
        });
        jPanel2.add(TXTnomPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 143, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("NOMBRE DEL ENCARGADO:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("DNI:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, 24));

        TXTDNIPI.setBackground(new java.awt.Color(246, 241, 241));
        TXTDNIPI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTDNIPIKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTDNIPIKeyTyped(evt);
            }
        });
        jPanel2.add(TXTDNIPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 91, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("ÁREA:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, -1, 25));

        CMBarea.setBackground(new java.awt.Color(246, 241, 241));
        CMBarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Dirección", "Recursos Humanos", "Finanzas", "Marketing", "Tecnología" }));
        CMBarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMBareaActionPerformed(evt);
            }
        });
        CMBarea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CMBareaKeyPressed(evt);
            }
        });
        jPanel2.add(CMBarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 160, -1));

        BTNguardarPI.setBackground(new java.awt.Color(0, 153, 253));
        BTNguardarPI.setText("AGREGAR");
        BTNguardarPI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNguardarPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNguardarPIActionPerformed(evt);
            }
        });
        jPanel2.add(BTNguardarPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 90, 30));

        BTNvolverPI.setBackground(new java.awt.Color(255, 0, 0));
        BTNvolverPI.setText("VOLVER");
        BTNvolverPI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNvolverPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNvolverPIActionPerformed(evt);
            }
        });
        jPanel2.add(BTNvolverPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 92, 30));

        tblInterno.setBackground(new java.awt.Color(246, 241, 241));
        tblInterno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "DNI", "Area", "Sueldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblInterno);
        if (tblInterno.getColumnModel().getColumnCount() > 0) {
            tblInterno.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblInterno.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblInterno.getColumnModel().getColumn(2).setPreferredWidth(60);
            tblInterno.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 810, 290));

        BTNLimpiarPI.setBackground(new java.awt.Color(255, 255, 255));
        BTNLimpiarPI.setText("LIMPIAR");
        BTNLimpiarPI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNLimpiarPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLimpiarPIActionPerformed(evt);
            }
        });
        jPanel2.add(BTNLimpiarPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 80, 30));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(7, 62, 91));
        jTextField1.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(246, 241, 241));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("REGISTROS DE PROVEEDORES INTERNOS");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 932, 69));

        jTabbedPane1.addTab("Proveedor interno", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 217, 234));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("NOMBRE DE LA EMPRESA:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 190, 24));

        TXTnomPE.setBackground(new java.awt.Color(246, 241, 241));
        TXTnomPE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTnomPEKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTnomPEKeyTyped(evt);
            }
        });
        jPanel3.add(TXTnomPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 120, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RUC DE LA EMPRESA:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 200, 20));

        TXTruc.setBackground(new java.awt.Color(246, 241, 241));
        TXTruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTrucActionPerformed(evt);
            }
        });
        TXTruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTrucKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTrucKeyTyped(evt);
            }
        });
        jPanel3.add(TXTruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 200, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("AÑO DE COLABORACIÓN:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, 20));

        TXTañoPE.setBackground(new java.awt.Color(246, 241, 241));
        TXTañoPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTañoPEActionPerformed(evt);
            }
        });
        TXTañoPE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTañoPEKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTañoPEKeyTyped(evt);
            }
        });
        jPanel3.add(TXTañoPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 120, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("TELÉFONO DE LA EMPRESA:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, 20));

        TXTtelefono.setBackground(new java.awt.Color(246, 241, 241));
        TXTtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTtelefonoActionPerformed(evt);
            }
        });
        TXTtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTtelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTtelefonoKeyTyped(evt);
            }
        });
        jPanel3.add(TXTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 120, 30));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CORREO:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 200, 20));

        TXTcorreo.setBackground(new java.awt.Color(246, 241, 241));
        TXTcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTcorreoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXTcorreoKeyReleased(evt);
            }
        });
        jPanel3.add(TXTcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 200, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DIRECCIÓN DE LA EMPRESA:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 24));

        TXTdirec.setBackground(new java.awt.Color(246, 241, 241));
        TXTdirec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTdirecActionPerformed(evt);
            }
        });
        TXTdirec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTdirecKeyPressed(evt);
            }
        });
        jPanel3.add(TXTdirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 200, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("GERENTE GENERAL:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 190, -1));

        TXTencar.setBackground(new java.awt.Color(246, 241, 241));
        TXTencar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTencarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTencarKeyTyped(evt);
            }
        });
        jPanel3.add(TXTencar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 200, -1));

        BTNguardarPE.setBackground(new java.awt.Color(0, 153, 255));
        BTNguardarPE.setText("AGREGAR");
        BTNguardarPE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNguardarPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNguardarPEActionPerformed(evt);
            }
        });
        jPanel3.add(BTNguardarPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, 30));

        BTNvolverPE.setBackground(new java.awt.Color(255, 0, 0));
        BTNvolverPE.setText("VOLVER");
        BTNvolverPE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNvolverPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNvolverPEActionPerformed(evt);
            }
        });
        jPanel3.add(BTNvolverPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 100, 30));

        tblExterno.setBackground(new java.awt.Color(246, 241, 241));
        tblExterno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "RUC", "Año", "Teléfono", "Correo", "Dirección", "Encargado", "Demora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblExterno);
        if (tblExterno.getColumnModel().getColumnCount() > 0) {
            tblExterno.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblExterno.getColumnModel().getColumn(1).setPreferredWidth(30);
            tblExterno.getColumnModel().getColumn(2).setPreferredWidth(5);
            tblExterno.getColumnModel().getColumn(3).setPreferredWidth(30);
            tblExterno.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblExterno.getColumnModel().getColumn(5).setPreferredWidth(90);
            tblExterno.getColumnModel().getColumn(6).setPreferredWidth(30);
            tblExterno.getColumnModel().getColumn(7).setPreferredWidth(10);
        }

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 860, 220));

        BTNLimpiarPE.setBackground(new java.awt.Color(255, 255, 255));
        BTNLimpiarPE.setText("LIMPIAR");
        BTNLimpiarPE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNLimpiarPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLimpiarPEActionPerformed(evt);
            }
        });
        jPanel3.add(BTNLimpiarPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 490, 113, 33));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(7, 62, 91));
        jTextField2.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(246, 241, 241));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("REGISTROS DE PROVEEDORES EXTERNOS");
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 932, 70));

        jTabbedPane1.addTab("Proveedor externo", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 571));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void mostrartabinet(){
        tinterno = new DefaultTableModel();
       tinterno.addColumn("Nombre");
       tinterno.addColumn("DNI");
       tinterno.addColumn("Area");
       tinterno.addColumn("Sueldo");
       tblInterno.setModel(tinterno);
       
       String sql="Select * From provedorint";
        String datos []= new String [4];
        Statement st;
        
        try{
            st= cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                
                String area=rs.getNString("Area");
                
                CAPInterno inte= new CAPInterno(area);
                double sueldoi=inte.getSueldo();
                
                
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=String.valueOf(sueldoi);
                tinterno.addRow(datos);
            }
            tblInterno.setModel(tinterno);
        }catch(SQLException ex){
            Logger.getLogger(FrameProductos.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        
    }
    private void TXTrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTrucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTrucActionPerformed

    private void TXTañoPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTañoPEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTañoPEActionPerformed

    private void TXTtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTtelefonoActionPerformed

    private void TXTdirecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTdirecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTdirecActionPerformed
    
    public void mostrartabExterno(){
       texterno = new DefaultTableModel();
       texterno.addColumn("Nombre Empresa");
       texterno.addColumn("RUC");
       texterno.addColumn("Telèfono");
       texterno.addColumn("Direcciòn");
       texterno.addColumn("Correo");
       texterno.addColumn("Año de colaboraciòn");
       texterno.addColumn("Gerente General");
       texterno.addColumn("Demora");
       tblExterno.setModel(texterno);
       
       String sql="Select * From provedorext";
        String datos []= new String [8];
        Statement st;
        
        try{
            st= cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                
                int anio=Integer.parseInt(rs.getString("AnioColab"));
                
                CAPExterno ext= new CAPExterno(anio);
                String tiempod=ext.tiempoProveedor();
                
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]= tiempod;
                
                texterno.addRow(datos);
            }
            tblExterno.setModel(texterno);
        }catch(SQLException ex){
            Logger.getLogger(FrameProductos.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
    private void BTNguardarPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNguardarPEActionPerformed
    long ruc=0L;
    int anio=0;
    int tele=0;
    boolean datosValidos = true;
    
        if(TXTnomPE.getText().trim().isEmpty() || TXTruc.getText().trim().trim().isEmpty()|| TXTañoPE.getText().trim().isEmpty()|| TXTtelefono.getText().trim().isEmpty()|| TXTcorreo.getText().trim().isEmpty()|| TXTdirec.getText().trim().isEmpty()|| TXTencar.getText().trim().isEmpty())     {
        JOptionPane.showMessageDialog(null, "Complete los campos");
        datosValidos = false;}
        else{
        
        String nom = TXTnomPE.getText();
        if (!validarLetras(TXTnomPE.getText())) 
        {JOptionPane.showMessageDialog(null, "Error al ingresar dato NOMBRE DE LA EMPRESA");
        datosValidos = false;}
        
        String enca = TXTencar.getText();
        if (!validarLetras(TXTencar.getText())) 
        {JOptionPane.showMessageDialog(null, "Error al ingresar dato NOMBRE DEL ENCARGADO");
        datosValidos = false;}
        
        try {
        ruc = Long.parseLong(TXTruc.getText());
        if (String.valueOf(ruc).length() != 11) {
        JOptionPane.showMessageDialog(null, "El RUC debe tener 11 dígitos");
        datosValidos = false; // Marcar los datos como no válidos
        }
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Ingrese un número válido para el RUC");
        datosValidos = false; // Marcar los datos como no válidos
        }


        try {
        tele = Integer.parseInt(TXTtelefono.getText());
        if (String.valueOf(tele).length() != 9) {
        JOptionPane.showMessageDialog(null, "El teléfono debe tener 9 dígitos");
        datosValidos = false; // Marcar los datos como no válidos
        }
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Ingrese un número válido para el teléfono");
        datosValidos = false;}
        
        try {
        anio = Integer.parseInt(TXTañoPE.getText());
        if (String.valueOf(anio).length() > 2) {
        JOptionPane.showMessageDialog(null, "El año debe tener 2 dígitos");
        datosValidos = false; // Marcar los datos como no válidos
        }
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Ingrese un número válido para el año");
        datosValidos = false; } 
          

        String cor = TXTcorreo.getText();
        String dir = TXTdirec.getText();    
    //Creacion del objeto en un array para la tabla
    
        if (datosValidos) {
        CAPExterno cape= new CAPExterno(ruc, dir, tele, cor, enca, nom, anio);
        capea.agregarEmpleado(cape);
            for (int i = 0; i < capea.tamañoArreglo(); i++) {
              Object[] fila={
            capea.obtener(i).getNombreProveedor(),
            capea.obtener(i).getRUC(),
            capea.obtener(i).getTelefono(),
            capea.obtener(i).getDireccion(),
            capea.obtener(i).getCorreo(),
            capea.obtener(i).getAñoIngreso(),
            capea.obtener(i).getEncargado(),
            cape.tiempoProveedor()
              };
            texterno.addRow(fila);
            }
            //agregar datos a la BDD
            try {
                PreparedStatement pps=  cn.prepareStatement("INSERT INTO provedorext(NombreEmp,RUC,Telefono,Direccion,Correo,AnioColab,GerenteGe) VALUES(?,?,?,?,?,?,?)");
                pps.setString(1, nom);
                pps.setLong(2, ruc);
                pps.setInt(3, tele);
                pps.setString(4, dir);
                pps.setString(5, cor);
                pps.setInt(6, anio);
                pps.setString(7, enca);
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Provedor Ext. Agregado");
            } catch (SQLException ex) {
                Logger.getLogger(FrameProductos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
        
        
    } 
    }//GEN-LAST:event_BTNguardarPEActionPerformed
    public static boolean validarLetras(String datos){
        return datos.matches("[a-zA-Z .]*");
    }
    private void BTNLimpiarPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLimpiarPEActionPerformed
        TXTnomPE.setText("");
        TXTruc.setText("");
        TXTañoPE.setText("");
        TXTtelefono.setText("");
        TXTdirec.setText("");
        TXTcorreo.setText("");
        TXTencar.setText("");
    }//GEN-LAST:event_BTNLimpiarPEActionPerformed

    private void TXTnomPEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTnomPEKeyTyped

    }//GEN-LAST:event_TXTnomPEKeyTyped

    private void TXTañoPEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTañoPEKeyTyped

        if (TXTañoPE.getText().length()>=4)
        {
            evt.consume();
        }
        
    }//GEN-LAST:event_TXTañoPEKeyTyped

    private void TXTtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTtelefonoKeyTyped

        if (TXTtelefono.getText().length()>=9)
        {
            evt.consume();
        }
        
    }//GEN-LAST:event_TXTtelefonoKeyTyped

    private void TXTrucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTrucKeyTyped

        
        if (TXTruc.getText().length()>=11)
        {
            evt.consume();
        }
        
    }//GEN-LAST:event_TXTrucKeyTyped

    private void TXTencarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTencarKeyTyped

    }//GEN-LAST:event_TXTencarKeyTyped

    private void TXTcorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTcorreoKeyReleased
       
    }//GEN-LAST:event_TXTcorreoKeyReleased

    private void TXTnomPEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTnomPEKeyPressed
       
    }//GEN-LAST:event_TXTnomPEKeyPressed

    private void TXTrucKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTrucKeyPressed
       
    }//GEN-LAST:event_TXTrucKeyPressed

    private void TXTencarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTencarKeyPressed
       
    }//GEN-LAST:event_TXTencarKeyPressed

    private void TXTañoPEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTañoPEKeyPressed
      
    }//GEN-LAST:event_TXTañoPEKeyPressed

    private void TXTtelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTtelefonoKeyPressed
      
    }//GEN-LAST:event_TXTtelefonoKeyPressed

    private void TXTcorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTcorreoKeyPressed

    }//GEN-LAST:event_TXTcorreoKeyPressed

    private void TXTdirecKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTdirecKeyPressed
     
    }//GEN-LAST:event_TXTdirecKeyPressed

    private void BTNvolverPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNvolverPEActionPerformed
    FramePrincipal vol= new FramePrincipal();
    vol.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_BTNvolverPEActionPerformed

    private void BTNLimpiarPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLimpiarPIActionPerformed

        TXTDNIPI.setText("");
        TXTnomPI.setText("");
        TXTDNIPI.setText("");
        CMBarea.setSelectedIndex(0);

    }//GEN-LAST:event_BTNLimpiarPIActionPerformed

    private void BTNvolverPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNvolverPIActionPerformed
        FramePrincipal abrir = new FramePrincipal();
   abrir.setVisible(true);
   this.setVisible(false);               
    }//GEN-LAST:event_BTNvolverPIActionPerformed

    private void BTNguardarPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNguardarPIActionPerformed
        int dni=0;
        int anio=0;
        boolean datosValidos = true;

        if(TXTDNIPI.getText().trim().isEmpty() || TXTnomPI.getText().trim().trim().isEmpty()|| CMBarea.getSelectedIndex()==0)     {
            JOptionPane.showMessageDialog(null, "Complete los campos");
            datosValidos = false;}
        else{
            String nom = TXTnomPI.getText();
            if (!validarLetras(TXTnomPI.getText()))
            {JOptionPane.showMessageDialog(null, "Error al ingresar dato NOMBRE");
                datosValidos = false;}

            String area = CMBarea.getSelectedItem().toString();

            try {
                dni = Integer.parseInt(TXTDNIPI.getText());
                if (String.valueOf(dni).length() != 8) {
                    JOptionPane.showMessageDialog(null, "El DNI debe tener 8 dígitos");
                    datosValidos = false; // Marcar los datos como no válidos
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido para el DNI");
                datosValidos = false; // Marcar los datos como no válidos
            }

            
            
            
            // Creacion del objeto en un array para la tabla
            if (datosValidos) {
              CAPInterno inte = new CAPInterno(area, dni, nom);
              double sueld= inte.getSueldo();
              capia.agregarEmpleado(inte);
                for (int i = 0; i < capia.tamañoArreglo(); i++) {
                     Object[] fila={
                    capia.obtener(i).getNombreProveedor(),
                    capia.obtener(i).getDni(),
                    capia.obtener(i).getArea(),
                    sueld,
            };
            tinterno.addRow(fila);
                }
                
                //agregar datos a la BDD
                try {
                PreparedStatement pps=  cn.prepareStatement("INSERT INTO provedorint(Nombre,DNI,Area) VALUES(?,?,?)");
                pps.setString(1, nom);
                pps.setInt(2, dni);
                pps.setString(3, area);
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Provedor Int. Agregado");
            } catch (SQLException ex) {
                Logger.getLogger(FrameProductos.class.getName()).log(Level.SEVERE, null, ex);
            }   
            }
        }
    }//GEN-LAST:event_BTNguardarPIActionPerformed

    private void CMBareaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CMBareaKeyPressed

    }//GEN-LAST:event_CMBareaKeyPressed

    private void CMBareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMBareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CMBareaActionPerformed

    private void TXTDNIPIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTDNIPIKeyTyped

        if (TXTDNIPI.getText().length()>=8)
        {
            evt.consume();
        }

    }//GEN-LAST:event_TXTDNIPIKeyTyped

    private void TXTDNIPIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTDNIPIKeyPressed

    }//GEN-LAST:event_TXTDNIPIKeyPressed

    private void TXTnomPIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTnomPIKeyTyped

    }//GEN-LAST:event_TXTnomPIKeyTyped

    private void TXTnomPIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTnomPIKeyPressed

    }//GEN-LAST:event_TXTnomPIKeyPressed

    private void TXTnomPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTnomPIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTnomPIActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    public boolean verificar_email(String correo){
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        +"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{3,})$");
        Matcher mat = patron.matcher(correo);
        return mat.find();
    }
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
            java.util.logging.Logger.getLogger(FrameProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNLimpiarPE;
    private javax.swing.JButton BTNLimpiarPI;
    private javax.swing.JButton BTNguardarPE;
    private javax.swing.JButton BTNguardarPI;
    private javax.swing.JButton BTNvolverPE;
    private javax.swing.JButton BTNvolverPI;
    private javax.swing.JComboBox<String> CMBarea;
    private javax.swing.JTextField TXTDNIPI;
    private javax.swing.JTextField TXTañoPE;
    private javax.swing.JTextField TXTcorreo;
    private javax.swing.JTextField TXTdirec;
    private javax.swing.JTextField TXTencar;
    private javax.swing.JTextField TXTnomPE;
    private javax.swing.JTextField TXTnomPI;
    private javax.swing.JTextField TXTruc;
    private javax.swing.JTextField TXTtelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblExterno;
    private javax.swing.JTable tblInterno;
    // End of variables declaration//GEN-END:variables
}
