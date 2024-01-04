/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package quan_ly_thu_vien;
import chucnang.xuLyDocGia;

/**
 *
 * @author TuanNguyen
 */
public class docgiaDialog extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
    javax.swing.JTable jTable;
    boolean editingEnabled;
    public docgiaDialog(java.awt.Frame parent, boolean modal, javax.swing.JTable jTable, boolean editingEnabled) {
        super(parent, modal);
        initComponents();
        this.jTable = jTable;
        this.editingEnabled = editingEnabled;
        if(editingEnabled) {
            xuLyDocGia.select(manguoimuonTextField, tennguoimuonTextField, gioitinhTextField, sodienthoaiTextField, jTable);
        }
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
        manguoimuonTextField = new javax.swing.JTextField();
        tennguoimuonTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sodienthoaiTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        luuButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        gioitinhTextField = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

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
        jLabel2.setText("Mã người mượn");

        jLabel3.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(125, 99, 87));
        jLabel3.setText("Tên người mượn");

        manguoimuonTextField.setBackground(new java.awt.Color(232, 214, 200));
        manguoimuonTextField.setFont(manguoimuonTextField.getFont().deriveFont(manguoimuonTextField.getFont().getSize()+2f));
        manguoimuonTextField.setForeground(new java.awt.Color(137, 110, 89));
        manguoimuonTextField.setBorder(null);
        manguoimuonTextField.setDragEnabled(true);
        manguoimuonTextField.setName(""); // NOI18N
        manguoimuonTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manguoimuonTextFieldActionPerformed(evt);
            }
        });

        tennguoimuonTextField.setBackground(new java.awt.Color(232, 214, 200));
        tennguoimuonTextField.setFont(tennguoimuonTextField.getFont().deriveFont(tennguoimuonTextField.getFont().getSize()+2f));
        tennguoimuonTextField.setForeground(new java.awt.Color(137, 110, 89));
        tennguoimuonTextField.setBorder(null);
        tennguoimuonTextField.setDragEnabled(true);
        tennguoimuonTextField.setName(""); // NOI18N

        jLabel4.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(125, 99, 87));
        jLabel4.setText("Ngày sinh");

        sodienthoaiTextField.setBackground(new java.awt.Color(232, 214, 200));
        sodienthoaiTextField.setFont(sodienthoaiTextField.getFont().deriveFont(sodienthoaiTextField.getFont().getSize()+2f));
        sodienthoaiTextField.setForeground(new java.awt.Color(137, 110, 89));
        sodienthoaiTextField.setBorder(null);
        sodienthoaiTextField.setDragEnabled(true);
        sodienthoaiTextField.setName(""); // NOI18N

        jLabel6.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(125, 99, 87));
        jLabel6.setText("Số điện thoại");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(132, 98, 83));
        jLabel5.setText("X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
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

        jLabel7.setFont(new java.awt.Font("UTM BryantLG", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(125, 99, 87));
        jLabel7.setText("Địa chỉ");

        gioitinhTextField.setBackground(new java.awt.Color(232, 214, 200));
        gioitinhTextField.setFont(gioitinhTextField.getFont().deriveFont(gioitinhTextField.getFont().getSize()+2f));
        gioitinhTextField.setForeground(new java.awt.Color(137, 110, 89));
        gioitinhTextField.setBorder(null);
        gioitinhTextField.setDragEnabled(true);
        gioitinhTextField.setName(""); // NOI18N

        jDateChooser1.setBackground(new java.awt.Color(232, 214, 200));
        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jSeparator1.setBackground(new java.awt.Color(125, 99, 87));
        jSeparator1.setForeground(new java.awt.Color(125, 99, 87));

        jSeparator2.setBackground(new java.awt.Color(125, 99, 87));
        jSeparator2.setForeground(new java.awt.Color(125, 99, 87));

        jSeparator3.setBackground(new java.awt.Color(125, 99, 87));
        jSeparator3.setForeground(new java.awt.Color(125, 99, 87));

        jSeparator4.setBackground(new java.awt.Color(125, 99, 87));
        jSeparator4.setForeground(new java.awt.Color(125, 99, 87));

        jSeparator5.setBackground(new java.awt.Color(125, 99, 87));
        jSeparator5.setForeground(new java.awt.Color(125, 99, 87));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(54, 54, 54))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(tennguoimuonTextField)
                            .addComponent(manguoimuonTextField)
                            .addComponent(sodienthoaiTextField)
                            .addComponent(luuButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(gioitinhTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4)
                            .addComponent(jSeparator5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manguoimuonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tennguoimuonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gioitinhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sodienthoaiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(luuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(389, 321));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0); //nút thoát
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        // TODO add your handling code here:
        //setColor(exit); //màu thay đôi khi di chuột vào
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        // TODO add your handling code here:
        //resetColor(exit); //reset lại màu khi chuột đi ra
    }//GEN-LAST:event_exitMouseExited

    private void manguoimuonTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manguoimuonTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manguoimuonTextFieldActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.dispose(); //nút thoát cho chữ X
    }//GEN-LAST:event_jLabel5MouseClicked

    private void luuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuButtonActionPerformed
        // TODO add your handling code here:
                if(editingEnabled == false) {
                        xuLyDocGia.add(tennguoimuonTextField.getText(), ((javax.swing.JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText().toString(), gioitinhTextField.getText(), sodienthoaiTextField.getText());
                    } else {
                        xuLyDocGia.edit(Integer.parseInt(manguoimuonTextField.getText()), jTable, tennguoimuonTextField.getText(), ((javax.swing.JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText().toString(), gioitinhTextField.getText(), sodienthoaiTextField.getText());
                    }
                this.dispose();
    }//GEN-LAST:event_luuButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel exit;
    private javax.swing.JTextField gioitinhTextField;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton luuButton;
    private javax.swing.JTextField manguoimuonTextField;
    private javax.swing.JTextField sodienthoaiTextField;
    private javax.swing.JTextField tennguoimuonTextField;
    // End of variables declaration//GEN-END:variables
}
