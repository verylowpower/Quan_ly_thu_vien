/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quan_ly_thu_vien;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JFormattedTextField.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author vitancuc
 */
public class phieumuonpanel extends javax.swing.JPanel {
    /**
     * Creates new form jYeucautra
     */
    public phieumuonpanel() {
        initComponents();
        designTable();
    }
    void designTable(){
        jTable1.getTableHeader().setFont(new Font("Monospace", Font.BOLD, 18));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(253, 245, 230));
        jTable1.getTableHeader().setForeground(new Color(125,99,87));
        jScrollPane1.getViewport().setBackground(new Color(211,193,173));
    }
    void setColor(JPanel panel) {  //đổi màu
        panel.setBackground(new Color(255,223,198));
    }
     
    void resetColor(JPanel panel) { //reset về màu background
        panel.setBackground(new Color(232,214,200));
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
        timkiemTextField = new javax.swing.JLabel();
        txtusername5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        themButton = new javax.swing.JButton();
        xoaButton = new javax.swing.JButton();
        suaButton = new javax.swing.JButton();
        inButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(843, 627));

        bg.setBackground(new java.awt.Color(232, 214, 200));
        bg.setPreferredSize(new java.awt.Dimension(843, 627));

        timkiemTextField.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        timkiemTextField.setForeground(new java.awt.Color(125, 99, 87));
        timkiemTextField.setText("Tìm kiếm");

        txtusername5.setBackground(new java.awt.Color(253, 245, 230));
        txtusername5.setFont(txtusername5.getFont().deriveFont(txtusername5.getFont().getSize()+2f));
        txtusername5.setForeground(new java.awt.Color(137, 110, 89));
        txtusername5.setBorder(null);
        txtusername5.setDragEnabled(true);
        txtusername5.setName(""); // NOI18N
        txtusername5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusername5ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 242, 222));
        jTable1.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu", "Tên sách", "Người mượn", "Thủ thư", "Ngày mượn", "Ngày trả"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        themButton.setBackground(new java.awt.Color(232, 214, 200));
        themButton.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        themButton.setForeground(new java.awt.Color(125, 99, 87));
        themButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/button5.png"))); // NOI18N
        themButton.setText("Thêm");
        themButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        themButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        themButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/button7.png"))); // NOI18N
        themButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themButtonActionPerformed(evt);
            }
        });

        xoaButton.setBackground(new java.awt.Color(232, 214, 200));
        xoaButton.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        xoaButton.setForeground(new java.awt.Color(125, 99, 87));
        xoaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/button5.png"))); // NOI18N
        xoaButton.setText("Xóa");
        xoaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        xoaButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        xoaButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/button7.png"))); // NOI18N
        xoaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaButtonActionPerformed(evt);
            }
        });

        suaButton.setBackground(new java.awt.Color(232, 214, 200));
        suaButton.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        suaButton.setForeground(new java.awt.Color(125, 99, 87));
        suaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/button5.png"))); // NOI18N
        suaButton.setText("Sửa");
        suaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suaButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        suaButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/button7.png"))); // NOI18N
        suaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaButtonActionPerformed(evt);
            }
        });

        inButton.setBackground(new java.awt.Color(232, 214, 200));
        inButton.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        inButton.setForeground(new java.awt.Color(125, 99, 87));
        inButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/button5.png"))); // NOI18N
        inButton.setText("In");
        inButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home form/button7.png"))); // NOI18N
        inButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(timkiemTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtusername5))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(inButton, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(suaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(xoaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timkiemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusername5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtusername5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusername5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusername5ActionPerformed

    private void themButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themButtonActionPerformed
        // TODO add your handling code here:
        new phieumuonDialog(new javax.swing.JFrame(), true).setVisible(true);
    }//GEN-LAST:event_themButtonActionPerformed

    private void xoaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xoaButtonActionPerformed

    private void suaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suaButtonActionPerformed

    private void inButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inButtonActionPerformed
        // TODO add your handling code here:
        new inDialog(new javax.swing.JFrame(), true).setVisible(true);
    }//GEN-LAST:event_inButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton inButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton suaButton;
    private javax.swing.JButton themButton;
    private javax.swing.JLabel timkiemTextField;
    private javax.swing.JTextField txtusername5;
    private javax.swing.JButton xoaButton;
    // End of variables declaration//GEN-END:variables
//
//    private static class datePicker {
//
//        public datePicker() {
//        UtilDateModel model = new UtilDateModel();
//        JDatePanelImpl datePanel = new JDatePanelImpl(model);
//        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
// 
//        frame.add(datePicker);
//        }
//    }
}
