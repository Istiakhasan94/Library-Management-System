package LBS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class MemberLogin extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    public MemberLogin() {
       
        super("Login");
        initComponents();
         conn = JavaConnection.ConnecrDB();
 ;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton8 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1017, 700));
        setMinimumSize(new java.awt.Dimension(1017, 700));
        setPreferredSize(new java.awt.Dimension(1017, 700));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Username :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 180, 120, 40);

        jLabel3.setFont(jLabel2.getFont());
        jLabel3.setForeground(new java.awt.Color(255, 204, 204));
        jLabel3.setText("Password :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 290, 100, 40);

        jTextField1.setBackground(new java.awt.Color(153, 255, 255));
        jTextField1.setFont(jLabel2.getFont());
        jTextField1.setForeground(new java.awt.Color(0, 51, 51));
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(380, 180, 300, 40);

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(jLabel2.getFont());
        jButton1.setForeground(new java.awt.Color(0, 0, 51));
        jButton1.setText("Log In");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 380, 120, 31);

        jLabel1.setFont(jLabel2.getFont());
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("Trouble Log In !");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 490, 160, 23);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setText("Forgot Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 480, 220, 40);

        jPasswordField1.setBackground(new java.awt.Color(255, 153, 153));
        jPasswordField1.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(51, 0, 0));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(380, 290, 300, 40);

        jButton8.setBackground(new java.awt.Color(255, 153, 102));
        jButton8.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 0, 0));
        jButton8.setText("Exit");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(480, 570, 90, 40);

        Background.setForeground(new java.awt.Color(255, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Books/7.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1020, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sql = "select * from MemberAccount where Username = ? and Password = ? ";
       
        try{
            
             pst = conn.prepareStatement(sql);
             pst.setString(1,jTextField1.getText());
              pst.setString(2,jPasswordField1.getText());
              rs = pst.executeQuery();
              if(rs.next()){
                rs.close();
                pst.close(); 
                setVisible(false);
                new MembersAction().setVisible(true);
                
            }
              else{
                  JOptionPane.showMessageDialog(null,"Incorrect Username and Password!!");
              }
        }
       catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
       finally{
            try{
                rs.close();
                pst.close(); 
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       setVisible(false);
        new ForgotPassword().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
