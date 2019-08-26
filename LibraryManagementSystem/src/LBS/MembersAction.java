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
import javax.swing.JTextField;

/**
 *
 * @author Acer
 */
public class MembersAction extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    public MembersAction() {
        super("Search and Borrow Books");
        initComponents();
        conn = JavaConnection.ConnecrDB();
    }

    public void Delete() {
        String sql = "Delete  from IssuedBook where Std_ID = ? and Year = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField14.getText());
            pst.setString(2, jTextField13.getText());
            pst.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void ReturnUpdate() {
        String sql = "Insert into Return  (Std_ID,Std_Name,Year,B_Name,B_ID,Edition,Publisher,DOI,DOR) values (?,?,?,?,?,?,?,?,?)";

        try {

            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField14.getText());
            pst.setString(2, jTextField12.getText());
            pst.setString(3, jTextField13.getText());
            pst.setString(4, jTextField8.getText());
            pst.setString(5, jTextField9.getText());
            pst.setString(6, jTextField10.getText());
            pst.setString(7, jTextField11.getText());
            pst.setString(8, ((JTextField) jDateChooser4.getDateEditor().getUiComponent()).getText());
            pst.setString(9, ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Return complete.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Background = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setMinimumSize(new java.awt.Dimension(1017, 700));
        getContentPane().setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(153, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(51, 0, 51));
        jTabbedPane1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(1017, 700));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1017, 700));
        jTabbedPane1.setName(""); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1017, 700));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1017, 700));
        jPanel1.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel21.setText("1.Library Access Control System");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(270, 190, 330, 23);

        jLabel22.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel22.setText("2.Newly Arrived Journals / Magazines and Newspapers,");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(270, 240, 502, 23);

        jLabel23.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel23.setText("3.Online Journals / Resources,");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(270, 290, 282, 23);

        jLabel24.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel24.setText("4.Computers in the Library,");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(270, 330, 253, 23);

        jLabel25.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel25.setText("5.Role of the Library Staff in Helping Users,");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(270, 370, 398, 23);

        jLabel26.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel26.setText("6.Photocopying");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(270, 420, 140, 23);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Books/27.jpg"))); // NOI18N
        jPanel1.add(jLabel20);
        jLabel20.setBounds(0, 0, 1000, 660);

        jTabbedPane1.addTab("                     Facility                     ", jPanel1);

        jPanel2.setLayout(null);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(204, 255, 255));
        jTextField2.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(jTextField2);
        jTextField2.setBounds(140, 240, 274, 30);

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(204, 255, 255));
        jTextField3.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(jTextField3);
        jTextField3.setBounds(140, 320, 274, 30);

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(204, 255, 255));
        jTextField4.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(jTextField4);
        jTextField4.setBounds(140, 410, 274, 30);

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Search.PNG"))); // NOI18N
        jButton1.setText("Search");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(220, 180, 90, 30);

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 0));
        jButton2.setText("Issue");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(770, 480, 128, 30);

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 51));
        jButton3.setText("Back");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(340, 550, 110, 30);

        jLabel1.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(16, 245, 229));
        jLabel1.setText("Book Name");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 130, 110, 30);

        jTextField5.setBackground(new java.awt.Color(204, 255, 255));
        jTextField5.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(jTextField5);
        jTextField5.setBounds(140, 130, 274, 30);

        jLabel2.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel2.setForeground(jLabel1.getForeground());
        jLabel2.setText("Book ID");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 240, 120, 30);

        jLabel3.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel3.setForeground(jLabel1.getForeground());
        jLabel3.setText("Edition");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 320, 128, 30);

        jLabel4.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel4.setForeground(jLabel1.getForeground());
        jLabel4.setText("Publisher");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 410, 128, 30);

        jLabel5.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Date Of Issue");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(550, 410, 130, 30);

        jLabel6.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Student Name");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(550, 330, 140, 30);

        jLabel7.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Student ID");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(560, 130, 150, 30);

        jLabel8.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel8.setForeground(jLabel7.getForeground());
        jLabel8.setText("Year");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(560, 210, 70, 30);

        jTextField1.setBackground(new java.awt.Color(204, 255, 204));
        jTextField1.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 51, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(690, 130, 274, 30);

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(204, 255, 204));
        jTextField7.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 51, 0));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField7);
        jTextField7.setBounds(690, 330, 274, 30);

        jButton4.setBackground(new java.awt.Color(0, 102, 0));
        jButton4.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 255, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Search.PNG"))); // NOI18N
        jButton4.setText("Search ");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(770, 280, 100, 30);

        jTextField6.setBackground(new java.awt.Color(204, 255, 204));
        jTextField6.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 51, 0));
        jPanel2.add(jTextField6);
        jTextField6.setBounds(690, 210, 274, 30);

        jButton9.setBackground(new java.awt.Color(255, 153, 102));
        jButton9.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(51, 0, 0));
        jButton9.setText("Exit");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);
        jButton9.setBounds(530, 550, 100, 30);
        jPanel2.add(jDateChooser1);
        jDateChooser1.setBounds(700, 410, 260, 30);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Books/25.jpg"))); // NOI18N
        jPanel2.add(Background);
        Background.setBounds(0, 0, 1000, 660);

        jTabbedPane1.addTab("                  Search & Borrow                      ", jPanel2);

        jPanel3.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Book Name");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(50, 320, 110, 30);

        jLabel10.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Book ID");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(50, 380, 120, 40);

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(204, 255, 255));
        jTextField8.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 0, 102));
        jPanel3.add(jTextField8);
        jTextField8.setBounds(240, 320, 240, 30);

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(204, 255, 255));
        jTextField9.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(0, 0, 102));
        jPanel3.add(jTextField9);
        jTextField9.setBounds(240, 390, 240, 30);

        jLabel11.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("Edition");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(560, 190, 128, 30);

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(204, 255, 255));
        jTextField10.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(0, 0, 102));
        jPanel3.add(jTextField10);
        jTextField10.setBounds(240, 460, 240, 30);

        jLabel12.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("Publisher");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(50, 460, 128, 30);

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(204, 255, 255));
        jTextField11.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(0, 0, 102));
        jPanel3.add(jTextField11);
        jTextField11.setBounds(740, 180, 210, 30);

        jLabel13.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("Date Of Issue");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(550, 250, 150, 40);

        jLabel14.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 51));
        jLabel14.setText("Student Name");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(50, 250, 140, 30);

        jLabel15.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 51));
        jLabel15.setText("Year");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(50, 130, 70, 30);

        jLabel16.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 51));
        jLabel16.setText("Student ID");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(50, 70, 150, 30);

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(204, 255, 255));
        jTextField12.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(0, 0, 102));
        jPanel3.add(jTextField12);
        jTextField12.setBounds(240, 250, 240, 30);

        jTextField13.setBackground(new java.awt.Color(204, 255, 255));
        jTextField13.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(0, 0, 102));
        jPanel3.add(jTextField13);
        jTextField13.setBounds(240, 130, 150, 30);

        jTextField14.setBackground(new java.awt.Color(204, 255, 255));
        jTextField14.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(0, 0, 102));
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField14);
        jTextField14.setBounds(240, 70, 150, 30);

        jButton5.setBackground(new java.awt.Color(255, 153, 153));
        jButton5.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 0, 51));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Search.PNG"))); // NOI18N
        jButton5.setText("Search ");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(260, 190, 100, 30);

        jButton6.setBackground(new java.awt.Color(255, 153, 255));
        jButton6.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 0, 51));
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(850, 400, 120, 40);

        jLabel17.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 51));
        jLabel17.setText("Date Of Return");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(550, 320, 200, 30);

        jButton7.setBackground(new java.awt.Color(153, 204, 255));
        jButton7.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 153));
        jButton7.setText("Return ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(660, 400, 110, 40);

        jButton8.setBackground(new java.awt.Color(255, 153, 102));
        jButton8.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 0, 0));
        jButton8.setText("Exit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);
        jButton8.setBounds(770, 490, 90, 40);
        jPanel3.add(jDateChooser2);
        jDateChooser2.setBounds(740, 330, 210, 30);
        jPanel3.add(jDateChooser4);
        jDateChooser4.setBounds(740, 260, 210, 30);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Books/3.jpg"))); // NOI18N
        jPanel3.add(jLabel18);
        jLabel18.setBounds(0, 0, 1000, 660);

        jTabbedPane1.addTab("                        Return                             ", jPanel3);

        jPanel5.setLayout(null);

        jButton10.setBackground(new java.awt.Color(0, 0, 102));
        jButton10.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(153, 204, 255));
        jButton10.setText("Exit");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton10);
        jButton10.setBounds(400, 340, 220, 70);

        jButton11.setBackground(new java.awt.Color(0, 153, 255));
        jButton11.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 51));
        jButton11.setText("Log Out");
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton11);
        jButton11.setBounds(400, 200, 220, 70);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Books/26.jpg"))); // NOI18N
        jPanel5.add(jLabel19);
        jLabel19.setBounds(0, 0, 1000, 660);

        jTabbedPane1.addTab("               Log Out                ", jPanel5);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 1010, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Delete();
        ReturnUpdate();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        setVisible(false);
        new MemberLogin().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String sql = "select * from IssuedBook where Std_ID = ? and Year = ?";

        try {

            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField14.getText());
            pst.setString(2, jTextField13.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                jTextField8.setText(rs.getString(1));
                jTextField9.setText(rs.getString(2));
                jTextField11.setText(rs.getString(4));
                jTextField12.setText(rs.getString(5));
                jTextField10.setText(rs.getString(3));
                //jDateChooser4.setText(rs.getString(7));
                rs.close();
                pst.close();

            } else {
                JOptionPane.showMessageDialog(null, "No book is issued in this Studen ID !!");
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
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String sql = "select * from MemberAccount where Std_ID = ? and Year = ?";

        try {

            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField1.getText());
            pst.setString(2, jTextField6.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                jTextField7.setText(rs.getString(5));
                rs.close();
                pst.close();

            } else {
                JOptionPane.showMessageDialog(null, "Student ID Not Found !!");
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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        new MemberLogin().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String sql = "Insert into IssuedBook(Book_Name,Book_ID,Edition,Publisher,Std_ID,Year,Std_Name,Date_Of_Issue) values(?,?,?,?,?,?,?,?)";
        try {

                pst = conn.prepareStatement(sql);
                pst.setString(1, jTextField5.getText());
                pst.setString(2, jTextField2.getText());
                pst.setString(3, jTextField3.getText());
                pst.setString(4, jTextField4.getText());
                pst.setString(5, jTextField1.getText());
                pst.setString(6, jTextField6.getText());
                pst.setString(7, jTextField7.getText());
                pst.setString(8, ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());               
                pst.execute();
                JOptionPane.showMessageDialog(null, "Issue complete.");
            }

         catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sql = "select * from BookInfo where Name = ?";

        try {

            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField5.getText());
            rs = pst.executeQuery();
            if (rs.next()) {

                jTextField2.setText(rs.getString(1));
                jTextField3.setText(rs.getString(3));
                jTextField4.setText(rs.getString(4));

                rs.close();
                pst.close();

            } else {
                JOptionPane.showMessageDialog(null, "Book Name Not Found !!");
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        setVisible(false);
        new Management().setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

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
            java.util.logging.Logger.getLogger(MembersAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MembersAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MembersAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MembersAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MembersAction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser4;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
