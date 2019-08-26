/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LBS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author Srabony
 */
public class NewBook extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    public NewBook() {
        super("New Book");
        initComponents();
        conn = JavaConnection.ConnecrDB();
        Random();
    }

    public void Random() {
        Random rd = new Random();
        jTextField1.setText("" + rd.nextInt(1000 + 1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1017, 700));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 0));
        jLabel1.setText("Book ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 150, 62, 20);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 255, 204));
        jTextField1.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 140, 204, 35);

        jLabel2.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 0));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 210, 57, 18);

        jTextField2.setBackground(new java.awt.Color(204, 255, 204));
        jTextField2.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(140, 200, 204, 35);

        jLabel3.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 0));
        jLabel3.setText("Edition");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 280, 54, 18);

        jButton1.setBackground(new java.awt.Color(0, 51, 0));
        jButton1.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 255, 204));
        jButton1.setText("Add");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 490, 88, 40);

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 204, 255));
        jButton2.setText("Exit");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(530, 590, 75, 40);

        jTextField3.setBackground(new java.awt.Color(204, 255, 204));
        jTextField3.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(140, 270, 204, 35);

        jLabel5.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 0));
        jLabel5.setText("Publisher");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 350, 69, 18);

        jTextField4.setBackground(new java.awt.Color(204, 255, 204));
        jTextField4.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(140, 340, 204, 35);

        jLabel6.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Book ID");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(560, 270, 62, 20);

        jTextField5.setBackground(new java.awt.Color(172, 229, 254));
        jTextField5.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 51));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(690, 250, 204, 35);

        jTextField6.setBackground(new java.awt.Color(172, 229, 254));
        jTextField6.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(jTextField6);
        jTextField6.setBounds(690, 140, 204, 40);

        jLabel7.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(560, 150, 57, 18);

        jLabel8.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Edition");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(560, 340, 54, 18);

        jTextField7.setBackground(new java.awt.Color(172, 229, 254));
        jTextField7.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(jTextField7);
        jTextField7.setBounds(690, 330, 204, 35);

        jTextField8.setBackground(new java.awt.Color(172, 229, 254));
        jTextField8.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 0, 51));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(690, 400, 204, 35);

        jLabel9.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Publisher");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(560, 410, 69, 18);

        jButton3.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setText("Remove");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(760, 470, 88, 40);

        jButton4.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Search.PNG"))); // NOI18N
        jButton4.setText("Search ");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(750, 200, 100, 30);

        jButton5.setBackground(new java.awt.Color(204, 255, 204));
        jButton5.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 0));
        jButton5.setText("Back");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(360, 590, 75, 40);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Books/32.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1020, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       try {
            String sql = "Insert into BookInfo(Book_ID,Name,Edition,Publisher) values (?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField1.getText());
            pst.setString(2, jTextField2.getText());           
            pst.setString(3, jTextField3.getText());
            pst.setString(4, jTextField4.getText());          
            //pst.setString(5, (String) jComboBox1.getSelectedItem());
            pst.execute();
            JOptionPane.showMessageDialog(null, "New Book Added.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      String sql = "delete from BookInfo where Name = ?";

        try {

            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField6.getText());           
            pst.execute();
             JOptionPane.showMessageDialog(null, "Removed Sucessfully.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Book ID Not Found!!!");
         
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String sql = "select * from BookInfo where Name = ?";

        try {

            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField6.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                jTextField5.setText(rs.getString(1));
                jTextField7.setText(rs.getString(3));
                jTextField8.setText(rs.getString(4));
                

                rs.close();
                pst.close();

            } else {
                JOptionPane.showMessageDialog(null, "Book ID Not Found !!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       setVisible(false);
       new LibrarianActivity().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}