package Framesregis;

import conexionbd.Conexion;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/** 
 *
 * @author Omar,Andrea,Alan
 */


public class Tienda extends javax.swing.JFrame {
    
    
    Conexion db= new Conexion();
    
        

    public Tienda() {
        initComponents();
        
        setLocationRelativeTo(null);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgbien = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Jlabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtcontra = new javax.swing.JPasswordField();
        ButEnt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ButSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        bgbien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 241, 241));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Iniciar Sesión");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 51, 276, 51));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Usuario");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, -1, -1));

        txtusuario.setBackground(new java.awt.Color(246, 241, 241));
        txtusuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(102, 102, 102));
        txtusuario.setText("Ingrese usuario");
        txtusuario.setBorder(null);
        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtusuarioMouseClicked(evt);
            }
        });
        jPanel2.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 153, 384, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 179, 384, 10));

        Jlabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        Jlabel2.setForeground(new java.awt.Color(0, 0, 0));
        Jlabel2.setText("Contraseña");
        jPanel2.add(Jlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 216, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 275, 384, 18));

        txtcontra.setBackground(new java.awt.Color(246, 241, 241));
        txtcontra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcontra.setText("jPasswordField1");
        txtcontra.setBorder(null);
        txtcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcontraMouseClicked(evt);
            }
        });
        jPanel2.add(txtcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 249, 384, -1));

        ButEnt.setBackground(new java.awt.Color(25, 167, 206));
        ButEnt.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        ButEnt.setForeground(new java.awt.Color(246, 241, 241));
        ButEnt.setText("Entrar");
        ButEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButEntActionPerformed(evt);
            }
        });
        jPanel2.add(ButEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, 28));

        bgbien.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 380));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hffdfgg-removebg-preview.png"))); // NOI18N
        bgbien.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 290, -1));

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Distribucion");
        bgbien.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 290, 80));

        jLabel4.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(20, 108, 148));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Siempre cerca");
        bgbien.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 290, 70));

        jLabel7.setFont(new java.awt.Font("Britannic Bold", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Vital");
        bgbien.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 300, -1));

        jLabel8.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(20, 108, 148));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("siempre esencial");
        bgbien.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 290, -1));

        ButSalir.setBackground(new java.awt.Color(255, 51, 51));
        ButSalir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButSalir.setForeground(new java.awt.Color(246, 241, 241));
        ButSalir.setText("X");
        ButSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSalirActionPerformed(evt);
            }
        });
        bgbien.add(ButSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/superme.jpg"))); // NOI18N
        bgbien.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 290, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgbien, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgbien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButSalirActionPerformed
    
    public void accesoUsuario(String user,String pass){
        
        String usuariocorrecto=null;
        String passwordcorrecto=null;
        
        try{
            Connection cn =db.conectar();
            PreparedStatement pst= cn.prepareStatement("Select Usuario,Contraseña from usuario");
            ResultSet rs= pst.executeQuery();
            
            if(rs.next()){
                usuariocorrecto=rs.getString(1);
                passwordcorrecto=rs.getString(2);
                
            }
            
            if(user.equals(usuariocorrecto)&& pass.equals(passwordcorrecto)){
                JOptionPane.showMessageDialog(null, "Login correcto: "+user);
                abrirframeprin();
                
                
                
                
            }else if (!user.equals(usuariocorrecto) || !pass.equals(passwordcorrecto)) {
                JOptionPane.showMessageDialog(null, "Usuario o contraseñas incorrectas");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: ");
            System.out.println(e);
        }
        
    }
    
    public void abrirframeprin(){
        FramePrincipal tiendaFrame = new FramePrincipal();
                tiendaFrame.setVisible(true);
                this.setVisible(false);
        
    }
    
    
    private void ButEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButEntActionPerformed
        
        String user= txtusuario.getText();
        String pass= txtcontra.getText();
        accesoUsuario(user,pass);
        
    }//GEN-LAST:event_ButEntActionPerformed

    private void txtusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMouseClicked
        txtusuario.setText("");
        
    }//GEN-LAST:event_txtusuarioMouseClicked

    private void txtcontraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraMouseClicked
        txtcontra.setText("");
    }//GEN-LAST:event_txtcontraMouseClicked

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
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
            new Tienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButEnt;
    private javax.swing.JButton ButSalir;
    private javax.swing.JLabel Jlabel2;
    private javax.swing.JPanel bgbien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

    class imagenfondo extends JPanel{
        private Image imagen;
        
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("imagen1")).getImage();
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }

}