package Framesregis;



import Clases.Registro_Gerente;
import javax.swing.JOptionPane;





/**
 *
 * @author OmarTc
 */
public class RegistroGere extends javax.swing.JFrame {
    
    
    /**
     * Creates new form RegistroUsu
     */
    public RegistroGere() {
        initComponents();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnuevoApellido = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Jlabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtcontra = new javax.swing.JPasswordField();
        ButEnt = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtnuevoUsuario = new javax.swing.JTextField();
        txtnuevoDNI = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtnuevoNombre = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        ButEnt1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ButSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 241, 241));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("rEGISTRAR Gerente");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 470, 51));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DNI:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtnuevoApellido.setBackground(new java.awt.Color(246, 241, 241));
        txtnuevoApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnuevoApellido.setForeground(new java.awt.Color(102, 102, 102));
        txtnuevoApellido.setText("Ingrese Apellido");
        txtnuevoApellido.setBorder(null);
        txtnuevoApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnuevoApellidoMouseClicked(evt);
            }
        });
        jPanel2.add(txtnuevoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 170, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 384, 10));

        Jlabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        Jlabel2.setForeground(new java.awt.Color(0, 0, 0));
        Jlabel2.setText("Contraseña");
        jPanel2.add(Jlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 384, 18));

        txtcontra.setBackground(new java.awt.Color(246, 241, 241));
        txtcontra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcontra.setText("jPasswordField1");
        txtcontra.setBorder(null);
        txtcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcontraMouseClicked(evt);
            }
        });
        jPanel2.add(txtcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 384, -1));

        ButEnt.setBackground(new java.awt.Color(25, 167, 206));
        ButEnt.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        ButEnt.setForeground(new java.awt.Color(246, 241, 241));
        ButEnt.setText("Registrar");
        ButEnt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButEntActionPerformed(evt);
            }
        });
        jPanel2.add(ButEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, 28));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Usuario");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 70, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Apellido");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 100, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 384, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 170, 10));

        txtnuevoUsuario.setBackground(new java.awt.Color(246, 241, 241));
        txtnuevoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnuevoUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtnuevoUsuario.setText("Ingrese usuario");
        txtnuevoUsuario.setBorder(null);
        txtnuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnuevoUsuarioMouseClicked(evt);
            }
        });
        txtnuevoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnuevoUsuarioKeyPressed(evt);
            }
        });
        jPanel2.add(txtnuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 384, -1));

        txtnuevoDNI.setBackground(new java.awt.Color(246, 241, 241));
        txtnuevoDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnuevoDNI.setForeground(new java.awt.Color(102, 102, 102));
        txtnuevoDNI.setText("Ingrese DNI");
        txtnuevoDNI.setBorder(null);
        txtnuevoDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnuevoDNIMouseClicked(evt);
            }
        });
        txtnuevoDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnuevoDNIActionPerformed(evt);
            }
        });
        txtnuevoDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnuevoDNIKeyTyped(evt);
            }
        });
        jPanel2.add(txtnuevoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 384, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nombre");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 100, -1));

        txtnuevoNombre.setBackground(new java.awt.Color(246, 241, 241));
        txtnuevoNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnuevoNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtnuevoNombre.setText("Ingrese usuario");
        txtnuevoNombre.setBorder(null);
        txtnuevoNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnuevoNombreMouseClicked(evt);
            }
        });
        txtnuevoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnuevoNombreKeyPressed(evt);
            }
        });
        jPanel2.add(txtnuevoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 170, 20));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 170, 10));

        ButEnt1.setBackground(new java.awt.Color(25, 167, 206));
        ButEnt1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        ButEnt1.setForeground(new java.awt.Color(246, 241, 241));
        ButEnt1.setText("login");
        ButEnt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButEnt1ActionPerformed(evt);
            }
        });
        jPanel2.add(ButEnt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, 28));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 390));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hffdfgg-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 290, -1));

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Distribucion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 290, 80));

        jLabel4.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(20, 108, 148));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Siempre cerca");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 290, 70));

        jLabel7.setFont(new java.awt.Font("Britannic Bold", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Vital");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 300, -1));

        jLabel8.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(20, 108, 148));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("siempre esencial");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 290, -1));

        ButSalir.setBackground(new java.awt.Color(255, 51, 51));
        ButSalir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButSalir.setForeground(new java.awt.Color(246, 241, 241));
        ButSalir.setText("X");
        ButSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSalirActionPerformed(evt);
            }
        });
        getContentPane().add(ButSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/superme.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 0, 300, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static boolean validarLetras(String datos){
        return datos.matches("[a-zA-Z. ]*");
    }
    
    public static boolean validarNumeros(String num){
        return num.matches("[0-9]*");
    }
    
    private void ButEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButEntActionPerformed
        
        boolean datosValidos = true;
       
        if (txtcontra.getText().isEmpty()||txtnuevoUsuario.getText().isEmpty()||txtnuevoApellido.getText().isEmpty()||txtnuevoNombre.getText().isEmpty()||
            txtnuevoDNI.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Existen campos incompletos", "Campos incompletos", JOptionPane.ERROR_MESSAGE);
            datosValidos = false;}
        else{
        Registro_Gerente reg = new Registro_Gerente();
        
        String Nombre= txtnuevoNombre.getText();
        if (!validarLetras(txtnuevoNombre.getText())) 
        {JOptionPane.showMessageDialog(null, "Error al ingresar dato NOMBRE");
        datosValidos = false;}
        
        String Apellido= txtnuevoApellido.getText();
        if (!validarLetras(txtnuevoApellido.getText())) 
        {JOptionPane.showMessageDialog(null, "Error al ingresar dato APELLIDO");
        datosValidos = false;}
        
        String Usuario= txtnuevoUsuario.getText();
        
        
        String dni = txtnuevoDNI.getText();
        if (!validarNumeros(txtnuevoDNI.getText())) 
        {JOptionPane.showMessageDialog(null, "Error al ingresar dato DNI");
        datosValidos = false;}
        
        String contraseña=txtcontra.getText();
       
            if (datosValidos) {
                reg.guardarusuario(dni, Nombre, Apellido, Usuario, contraseña);
            }

        }
    }//GEN-LAST:event_ButEntActionPerformed

    private void ButSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButSalirActionPerformed

    private void txtnuevoApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnuevoApellidoMouseClicked
        txtnuevoApellido.setText("");
    }//GEN-LAST:event_txtnuevoApellidoMouseClicked

    private void txtcontraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraMouseClicked
        txtcontra.setText("");
    }//GEN-LAST:event_txtcontraMouseClicked

    private void txtnuevoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnuevoUsuarioMouseClicked
        txtnuevoUsuario.setText("");
    }//GEN-LAST:event_txtnuevoUsuarioMouseClicked

    private void txtnuevoDNIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnuevoDNIMouseClicked
        txtnuevoDNI.setText("");
    }//GEN-LAST:event_txtnuevoDNIMouseClicked

    private void txtnuevoDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnuevoDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnuevoDNIActionPerformed

    private void txtnuevoNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnuevoNombreMouseClicked
        txtnuevoNombre.setText("");
    }//GEN-LAST:event_txtnuevoNombreMouseClicked

    private void txtnuevoUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnuevoUsuarioKeyPressed
        
    }//GEN-LAST:event_txtnuevoUsuarioKeyPressed

    private void txtnuevoNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnuevoNombreKeyPressed
        
    }//GEN-LAST:event_txtnuevoNombreKeyPressed

    private void ButEnt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButEnt1ActionPerformed
        Tienda ti= new Tienda();
        ti.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ButEnt1ActionPerformed

    private void txtnuevoDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnuevoDNIKeyTyped
        if (txtnuevoDNI.getText().length()>=8)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtnuevoDNIKeyTyped
        
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
            java.util.logging.Logger.getLogger(RegistroGere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroGere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroGere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroGere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroGere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButEnt;
    private javax.swing.JButton ButEnt1;
    private javax.swing.JButton ButSalir;
    private javax.swing.JLabel Jlabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JTextField txtnuevoApellido;
    private javax.swing.JTextField txtnuevoDNI;
    private javax.swing.JTextField txtnuevoNombre;
    private javax.swing.JTextField txtnuevoUsuario;
    // End of variables declaration//GEN-END:variables
}
