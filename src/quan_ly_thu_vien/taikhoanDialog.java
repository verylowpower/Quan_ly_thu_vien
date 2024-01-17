/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package quan_ly_thu_vien;

import chucnang.xuLySach;
import chucnang.ComponentPrinter;

import java.awt.Color;
import java.awt.Component;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import chucnang.xulyTaiKhoan;

/**
 *
 * @author quann
 */
public class taikhoanDialog extends javax.swing.JDialog {

    /**
     * Creates new form sachDialog
     */
    boolean editingEnabled;

    public taikhoanDialog(java.awt.Frame parent, boolean modal, boolean editingEnabled) {
        super(parent, modal);
        initComponents();
        xulyTaiKhoan.getComboBoxElements(thuthuComboBox);
        this.editingEnabled = editingEnabled;
        if (editingEnabled) {
            jLabel6.setText("Mật khẩu mới");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        taikhoanTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        thuthuComboBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(232, 214, 200));
        bg.setPreferredSize(new java.awt.Dimension(843, 627));

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

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
                exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 54, Short.MAX_VALUE));
        exitLayout.setVerticalGroup(
                exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 37, Short.MAX_VALUE));

        jLabel2.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(125, 99, 87));
        jLabel2.setText("Thủ thư");

        jLabel4.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(125, 99, 87));
        jLabel4.setText("Tài khoản");

        taikhoanTextField.setBackground(new java.awt.Color(232, 214, 200));
        taikhoanTextField.setFont(taikhoanTextField.getFont().deriveFont(taikhoanTextField.getFont().getSize() + 2f));
        taikhoanTextField.setForeground(new java.awt.Color(137, 110, 89));
        taikhoanTextField.setBorder(null);
        taikhoanTextField.setDragEnabled(true);
        taikhoanTextField.setName(""); // NOI18N

        jLabel6.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(125, 99, 87));
        jLabel6.setText("Mật khẩu");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(132, 98, 83));
        jLabel5.setText("X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        thuthuComboBox.setBackground(new java.awt.Color(232, 214, 200));
        thuthuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn thủ thư" }));
        thuthuComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thuthuComboBoxActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(125, 99, 87));
        jSeparator1.setForeground(new java.awt.Color(125, 99, 87));

        jSeparator2.setBackground(new java.awt.Color(125, 99, 87));
        jSeparator2.setForeground(new java.awt.Color(125, 99, 87));

        jSeparator3.setBackground(new java.awt.Color(125, 99, 87));
        jSeparator3.setForeground(new java.awt.Color(125, 99, 87));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/Luu.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        txtpassword.setBackground(new java.awt.Color(232, 214, 200));
        txtpassword.setFont(txtpassword.getFont().deriveFont(txtpassword.getFont().getSize() + 2f));
        txtpassword.setForeground(new java.awt.Color(132, 98, 83));
        txtpassword.setBorder(null);
        txtpassword.setCaretColor(new java.awt.Color(255, 255, 255));
        txtpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtpassword.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(bgLayout.createSequentialGroup()
                                                .addGap(199, 199, 199)
                                                .addComponent(jLabel1))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                bgLayout.createSequentialGroup()
                                                        .addGap(15, 15, 15)
                                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(bgLayout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(bgLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(32, 32, 32))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                bgLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(jLabel4)
                                                        .addGap(46, 46, 46)))
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(taikhoanTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 146,
                                                Short.MAX_VALUE)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 146,
                                                Short.MAX_VALUE)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 146,
                                                Short.MAX_VALUE)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 146,
                                                Short.MAX_VALUE)
                                        .addComponent(thuthuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 142,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtpassword))
                                .addGap(94, 94, 94)));
        bgLayout.setVerticalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47,
                                        Short.MAX_VALUE)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(thuthuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(taikhoanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(16, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 375,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        setSize(new java.awt.Dimension(386, 374));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/Luu.png")));
    }// GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/Luu1.png")));
    }// GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel1MouseClicked
        xulyTaiKhoan.addPassword(taikhoanTextField.getText(), String.valueOf(txtpassword.getPassword()),
                thuthuComboBox.getSelectedItem().toString());
        this.dispose();
    }// GEN-LAST:event_jLabel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.dispose(); // nút thoát cho chữ X
    }// GEN-LAST:event_jLabel5MouseClicked

    private void exitMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_exitMouseExited
        // TODO add your handling code here:
        // resetColor(exit); //reset lại màu khi chuột đi ra
    }// GEN-LAST:event_exitMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_exitMouseEntered
        // TODO add your handling code here:
        // setColor(exit); //màu thay đôi khi di chuột vào
    }// GEN-LAST:event_exitMouseEntered

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        // this.dispose(); //nút thoát
    }// GEN-LAST:event_exitMouseClicked

    private void thuthuComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_thuthuComboBoxActionPerformed
        // TODO add your handling code here:
        if (editingEnabled) {
            xulyTaiKhoan.update(taikhoanTextField, txtpassword, thuthuComboBox.getSelectedItem().toString());
        }
    }// GEN-LAST:event_thuthuComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField taikhoanTextField;
    private javax.swing.JComboBox<String> thuthuComboBox;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
