/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LBS;

/**
 *
 * @author Acer
 */
public class Management extends javax.swing.JFrame {

    /**
     * Creates new form Management
     */
    public Management() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));
        setMaximumSize(new java.awt.Dimension(1017, 700));
        setMinimumSize(new java.awt.Dimension(1017, 700));
        setPreferredSize(new java.awt.Dimension(1017, 700));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel2.setText("Welcome To Library Of\n");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 30, 450, 50);

        jLabel4.setFont(jLabel2.getFont());
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Dept. Of Computer Science & Engineering");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 90, 770, 30);

        jLabel5.setFont(jLabel2.getFont());
        jLabel5.setText("Jahangirnagar University");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 140, 520, 48);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("\"The journey of a lifetime starts with the turning of a page.\" ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 230, 720, 30);

        jLabel3.setFont(jLabel1.getFont());
        jLabel3.setForeground(jLabel1.getForeground());
        jLabel3.setText("- By Rachel Anders");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(630, 270, 210, 14);

        jButton1.setBackground(new java.awt.Color(255, 0, 102));
        jButton1.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jButton1.setText("Log in as memeber");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(390, 360, 220, 70);

        jButton2.setBackground(new java.awt.Color(204, 0, 204));
        jButton2.setFont(jButton1.getFont());
        jButton2.setText("Log in as librarian");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(390, 480, 220, 70);

        jButton3.setBackground(new java.awt.Color(255, 153, 255));
        jButton3.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 51));
        jButton3.setText("Exit");
        jButton3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(470, 590, 75, 40);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Books/book1.jpg"))); // NOI18N
        Background.setText("Background");
        Background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Background.setMaximumSize(new java.awt.Dimension(1017, 700));
        Background.setMinimumSize(new java.awt.Dimension(1017, 700));
        Background.setPreferredSize(new java.awt.Dimension(1017, 700));
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1017, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new Librarian().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new Member().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
