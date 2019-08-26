package LBS;

import java.sql.*;
import javax.swing.JOptionPane;

public class RegisterForm extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    public RegisterForm() {
        super("Registration Form");
        initComponents();
        conn = JavaConnection.ConnecrDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1017, 700));
        setMinimumSize(new java.awt.Dimension(1017, 700));
        setPreferredSize(new java.awt.Dimension(1017, 700));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Registration Form\n");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(480, 30, 368, 39);

        jLabel1.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 310, 164, 31);

        jLabel3.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 380, 164, 32);

        jLabel6.setFont(jLabel1.getFont());
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Year");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 240, 80, 30);

        jTextField1.setBackground(new java.awt.Color(255, 204, 255));
        jTextField1.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 0, 51));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(430, 310, 332, 31);

        jComboBox1.setBackground(new java.awt.Color(255, 153, 153));
        jComboBox1.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 0, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st Year", "2nd Year", "3rd Year", "4th Year" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(430, 240, 140, 24);

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 0));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 590, 90, 30);

        jLabel4.setFont(jLabel1.getFont());
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Security Question");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 450, 150, 30);

        jLabel5.setFont(jLabel1.getFont());
        jLabel5.setForeground(jLabel3.getForeground());
        jLabel5.setText("Answer");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 510, 140, 30);

        jComboBox2.setBackground(new java.awt.Color(153, 153, 255));
        jComboBox2.setFont(jComboBox1.getFont());
        jComboBox2.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your favorite color?", "What is your hobby?", "Where is your hometown?", "What is your first school name?", " " }));
        jComboBox2.setBorder(jComboBox1.getBorder());
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(430, 450, 190, 30);

        jTextField3.setBackground(jTextField2.getBackground());
        jTextField3.setFont(jTextField2.getFont());
        getContentPane().add(jTextField3);
        jTextField3.setBounds(430, 510, 332, 31);

        jButton2.setBackground(new java.awt.Color(153, 255, 204));
        jButton2.setFont(jButton1.getFont());
        jButton2.setForeground(new java.awt.Color(51, 0, 51));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(640, 590, 90, 30);

        jLabel7.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel7.setForeground(jLabel6.getForeground());
        jLabel7.setText("Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(280, 108, 70, 30);

        jTextField4.setBackground(new java.awt.Color(204, 255, 204));
        jTextField4.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 51, 0));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(430, 110, 332, 31);

        jTextField5.setBackground(new java.awt.Color(255, 204, 255));
        jTextField5.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(51, 0, 51));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(430, 170, 332, 31);

        jLabel8.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 204));
        jLabel8.setText("Student ID");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(280, 180, 90, 18);

        jTextField2.setBackground(new java.awt.Color(204, 255, 204));
        jTextField2.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 51, 0));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(440, 380, 332, 31);

        jButton8.setBackground(new java.awt.Color(255, 153, 102));
        jButton8.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 0, 0));
        jButton8.setText("Exit");
        jButton8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(830, 590, 90, 30);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Books/book9.jpg"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(1017, 700));
        Background.setMinimumSize(new java.awt.Dimension(1017, 700));
        Background.setPreferredSize(new java.awt.Dimension(1017, 700));
        getContentPane().add(Background);
        Background.setBounds(20, 0, 1020, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed


    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String sql = "Insert into MemberAccount (Username,Password,Sec_Q,Answer,Name,Std_ID,Year) values (?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField1.getText());
            pst.setString(2, jTextField2.getText());           
            pst.setString(3, (String) jComboBox2.getSelectedItem());
            pst.setString(4, jTextField3.getText());
            pst.setString(5, jTextField4.getText());
            pst.setString(6, jTextField5.getText());
             pst.setString(7, (String) jComboBox1.getSelectedItem());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registration Successful.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        setVisible(false);
        new Member().setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new Member().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
