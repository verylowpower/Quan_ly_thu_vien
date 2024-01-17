/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quan_ly_thu_vien;

import java.awt.Color;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPanel;
import chucnang.connectionClass;
/**
 *
 * @author vitancuc
 */
public class login extends javax.swing.JFrame {
    public login() {
        initComponents();
    }
    void setColor(JPanel panel) {  //đổi màu
        panel.setBackground(new Color(255,223,198));
    } 
    void resetColor(JPanel panel) { //reset về màu background
        panel.setBackground(new Color(232,214,200));
    }
    public void Login() {
        try {
            Statement st = connectionClass.getStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM nhanvien");
            while (rs.next()) {
                String username = rs.getString(8);
                String password = rs.getString(9);
                if (username.equals(txtusername.getText())
                    && password.equals(String.valueOf(txtpassword.getPassword()))){
                        this.dispose();
                        new Home().setVisible(true);
                }
            };
        } catch (SQLException e) {}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login_bg = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        exit = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Login_bg.setBackground(new java.awt.Color(232, 214, 200));
        Login_bg.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("UTM BryantLG", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(132, 98, 83));
        jLabel2.setText("Đăng nhập");

        jLabel3.setFont(new java.awt.Font("UTM BryantLG", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(132, 98, 83));
        jLabel3.setText("Tên đăng nhập");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("UTM BryantLG", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(132, 98, 83));
        jLabel4.setText("Mật khẩu");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login form/logo.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("UTM BryantLG", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(132, 98, 83));
        jLabel6.setText("Thư viện Hà Nội");

        exit.setBackground(new java.awt.Color(232, 214, 200));
        exit.setAlignmentX(0.0F);
        exit.setAlignmentY(0.0F);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(132, 98, 83));
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login form/line.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login form/line.png"))); // NOI18N

        txtusername.setBackground(new java.awt.Color(232, 214, 200));
        txtusername.setFont(txtusername.getFont().deriveFont(txtusername.getFont().getSize()+2f));
        txtusername.setForeground(new java.awt.Color(132, 98, 83));
        txtusername.setBorder(null);
        txtusername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtusername.setDragEnabled(true);
        txtusername.setName(""); // NOI18N
        txtusername.setOpaque(true);

        txtpassword.setBackground(new java.awt.Color(232, 214, 200));
        txtpassword.setFont(txtpassword.getFont().deriveFont(txtpassword.getFont().getSize()+2f));
        txtpassword.setForeground(new java.awt.Color(132, 98, 83));
        txtpassword.setBorder(null);
        txtpassword.setCaretColor(new java.awt.Color(255, 255, 255));
        txtpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtpassword.setOpaque(true);

        jButton1.setFont(new java.awt.Font("UTM BryantLG", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(125, 99, 87));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/button5.png"))); // NOI18N
        jButton1.setText("Bắt đầu");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/button7.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Quên mật khẩu ?");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Login_bgLayout = new javax.swing.GroupLayout(Login_bg);
        Login_bg.setLayout(Login_bgLayout);
        Login_bgLayout.setHorizontalGroup(
            Login_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_bgLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(Login_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Login_bgLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Login_bgLayout.createSequentialGroup()
                        .addGroup(Login_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Login_bgLayout.createSequentialGroup()
                                .addGroup(Login_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addGroup(Login_bgLayout.createSequentialGroup()
                                        .addGap(151, 151, 151)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(Login_bgLayout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(157, 157, 157)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Login_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(Login_bgLayout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(301, 301, 301)
                                    .addComponent(logo))
                                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 122, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Login_bgLayout.setVerticalGroup(
            Login_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_bgLayout.createSequentialGroup()
                .addGroup(Login_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Login_bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Login_bgLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(Login_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Login_bgLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(logo))
                .addGap(7, 7, 7)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Login_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Login_bgLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Login_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login_bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(801, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:\
        System.exit(0); //nút thoát
    }//GEN-LAST:event_exitMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        System.exit(0); //nút thoát cho chữ X
    }//GEN-LAST:event_jLabel5MouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        // TODO add your handling code here:
        setColor(exit); //màu thay đôi khi di chuột vào
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        // TODO add your handling code here:
        resetColor(exit); //reset lại màu khi chuột đi ra
    }//GEN-LAST:event_exitMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new emaildoimk(new javax.swing.JFrame(), true).setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked


    
    

    
    
    
    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login_bg;
    private javax.swing.JPanel exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
