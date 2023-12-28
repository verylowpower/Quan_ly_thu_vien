/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quan_ly_thu_vien;

import javax.swing.JPanel;

/**
 *
 * @author lehuy
 */
public class sachpanel extends javax.swing.JPanel {

    /**
     * Creates new form jsach
     */
    public sachpanel() {
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

        bg = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        timkiemTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        themButton = new javax.swing.JButton();
        xoaButton = new javax.swing.JButton();
        suaButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1167, 657));

        bg.setBackground(new java.awt.Color(232, 214, 200));
        bg.setPreferredSize(new java.awt.Dimension(1167, 657));

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

        jLabel8.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(125, 99, 87));
        jLabel8.setText("Tìm kiếm");

        timkiemTextField.setFont(timkiemTextField.getFont().deriveFont(timkiemTextField.getFont().getSize()+2f));
        timkiemTextField.setForeground(new java.awt.Color(137, 110, 89));
        timkiemTextField.setBorder(null);
        timkiemTextField.setDragEnabled(true);
        timkiemTextField.setName(""); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Thể loại", "Tác giả", "Nhà xuất bản ", "Năm xuất bản"
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

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timkiemTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jScrollPane1)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(suaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217)
                .addComponent(xoaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timkiemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        System.exit(0); //nút thoát cho chữ X
    }//GEN-LAST:event_jLabel5MouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0); //nút thoát
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        // TODO add your handling code here:
        setColor(exit); //màu thay đôi khi di chuột vào
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        // TODO add your handling code here:
        resetColor(exit); //reset lại màu khi chuột đi ra
    }//GEN-LAST:event_exitMouseExited

    private void themButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themButtonActionPerformed
        // TODO add your handling code here:
        new sachDialog(new javax.swing.JFrame(), true, jTable1, true).setVisible(true);
    }//GEN-LAST:event_themButtonActionPerformed

    private void xoaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xoaButtonActionPerformed

    private void suaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaButtonActionPerformed
        new sachDialog(new javax.swing.JFrame(), true, jTable1, false).setVisible(true);
    }//GEN-LAST:event_suaButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton suaButton;
    private javax.swing.JButton themButton;
    private javax.swing.JTextField timkiemTextField;
    private javax.swing.JButton xoaButton;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel exit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void resetColor(JPanel exit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
