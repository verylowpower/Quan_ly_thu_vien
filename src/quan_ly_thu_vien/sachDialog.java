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
/**
 *
 * @author quann
 */
public class sachDialog extends javax.swing.JDialog {

    /**
     * Creates new form sachDialog
     */
    javax.swing.JTable jTable;
    boolean editingEnabled;
    ByteArrayOutputStream img;

    public sachDialog(java.awt.Frame parent, boolean modal, javax.swing.JTable jTable, boolean editingEnabled) {
        super(parent, modal);
        initComponents();
        xuLySach.getComboBoxElements(tacgiaComboBox, nxbComboBox, theloaiComboBox);
        this.editingEnabled = editingEnabled;
        this.jTable = jTable;
        if(editingEnabled) {xuLySach.select(masachTextField, tensachTextField, namxuatbanTextField, nxbComboBox,tacgiaComboBox,theloaiComboBox, jTable, pictureLabel);}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tensachTextField = new javax.swing.JTextField();
        masachTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        namxuatbanTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pictureLabel = new javax.swing.JLabel();
        themanhButton = new javax.swing.JButton();
        luuButton = new javax.swing.JButton();
        tacgiaComboBox = new javax.swing.JComboBox<>();
        theloaiComboBox = new javax.swing.JComboBox<>();
        nxbComboBox = new javax.swing.JComboBox<>();
        luuButton1 = new javax.swing.JButton();

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
            .addGap(0, 54, Short.MAX_VALUE)
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(125, 99, 87));
        jLabel2.setText("Mã sách");

        jLabel3.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(125, 99, 87));
        jLabel3.setText("Năm xuất bản");

        jLabel4.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(125, 99, 87));
        jLabel4.setText("Tên sách");

        tensachTextField.setFont(tensachTextField.getFont().deriveFont(tensachTextField.getFont().getSize()+2f));
        tensachTextField.setForeground(new java.awt.Color(137, 110, 89));
        tensachTextField.setBorder(null);
        tensachTextField.setDragEnabled(true);
        tensachTextField.setName(""); // NOI18N

        masachTextField.setFont(masachTextField.getFont().deriveFont(masachTextField.getFont().getSize()+2f));
        masachTextField.setForeground(new java.awt.Color(137, 110, 89));
        masachTextField.setBorder(null);
        masachTextField.setDragEnabled(true);
        masachTextField.setName(""); // NOI18N

        jLabel6.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(125, 99, 87));
        jLabel6.setText("Nhà xuất bản");

        namxuatbanTextField.setFont(namxuatbanTextField.getFont().deriveFont(namxuatbanTextField.getFont().getSize()+2f));
        namxuatbanTextField.setForeground(new java.awt.Color(137, 110, 89));
        namxuatbanTextField.setBorder(null);
        namxuatbanTextField.setDragEnabled(true);
        namxuatbanTextField.setName(""); // NOI18N

        jLabel7.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(125, 99, 87));
        jLabel7.setText("Thể loại");

        jLabel8.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(125, 99, 87));
        jLabel8.setText("Tác giả");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(132, 98, 83));
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        pictureLabel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );

        themanhButton.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        themanhButton.setForeground(new java.awt.Color(125, 99, 87));
        themanhButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/button5.png"))); // NOI18N
        themanhButton.setText("Thêm ảnh");
        themanhButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        themanhButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        themanhButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/button7.png"))); // NOI18N
        themanhButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themanhButtonActionPerformed(evt);
            }
        });

        luuButton.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        luuButton.setForeground(new java.awt.Color(125, 99, 87));
        luuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/button5.png"))); // NOI18N
        luuButton.setText("Lưu");
        luuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        luuButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        luuButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/button7.png"))); // NOI18N
        luuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuButtonActionPerformed(evt);
            }
        });

        tacgiaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tác giả" }));

        theloaiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thể loại" }));

        nxbComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhà xuất bản" }));

        luuButton1.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        luuButton1.setForeground(new java.awt.Color(125, 99, 87));
        luuButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/button5.png"))); // NOI18N
        luuButton1.setText("Test");
        luuButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        luuButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        luuButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/button7.png"))); // NOI18N
        luuButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(212, 212, 212)))
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nxbComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(namxuatbanTextField)
                                        .addComponent(tensachTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                        .addComponent(masachTextField))
                                    .addComponent(tacgiaComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(theloaiComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(44, 44, 44)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(themanhButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(272, 272, 272))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(luuButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(luuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(273, 273, 273))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(masachTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tensachTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namxuatbanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nxbComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tacgiaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(themanhButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(theloaiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(luuButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 565, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(565, 431));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        //this.dispose(); //nút thoát
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        // TODO add your handling code here:
        //setColor(exit); //màu thay đôi khi di chuột vào
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        // TODO add your handling code here:
        //resetColor(exit); //reset lại màu khi chuột đi ra
    }//GEN-LAST:event_exitMouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.dispose(); //nút thoát cho chữ X
    }//GEN-LAST:event_jLabel5MouseClicked

    private void themanhButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themanhButtonActionPerformed
        // TODO add your handling code here:
        img = xuLySach.getImg(pictureLabel);
    }//GEN-LAST:event_themanhButtonActionPerformed

    private void luuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuButtonActionPerformed
        // TODO add your handling code here:
        if(editingEnabled == false) {
            xuLySach.add(tacgiaComboBox, nxbComboBox, theloaiComboBox, tensachTextField.getText(), tensachTextField.getText(), img);
        } else{
            xuLySach.edit(Integer.parseInt(masachTextField.getText()), jTable, tacgiaComboBox, nxbComboBox, theloaiComboBox, tensachTextField.getText(), namxuatbanTextField.getText(), img);
        }
    }//GEN-LAST:event_luuButtonActionPerformed

    private void luuButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuButton1ActionPerformed
        // TODO add your handling code here:
        Component draft = bg;
        new ComponentPrinter(draft).printComponent();
    }//GEN-LAST:event_luuButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton luuButton;
    private javax.swing.JButton luuButton1;
    private javax.swing.JTextField masachTextField;
    private javax.swing.JTextField namxuatbanTextField;
    private javax.swing.JComboBox<String> nxbComboBox;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JComboBox<String> tacgiaComboBox;
    private javax.swing.JTextField tensachTextField;
    private javax.swing.JComboBox<String> theloaiComboBox;
    private javax.swing.JButton themanhButton;
    // End of variables declaration//GEN-END:variables
}
