
package chucnang;

/**
 *
 * @author TuanNguyen
 */

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.PatternSyntaxException;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class xuLyNhaXuatBan {
    public static void TableFilter(javax.swing.JTextField textFind, javax.swing.JTable jTable) {
        String text = textFind.getText();
        TableModel model = (TableModel) jTable.getModel();
        final TableRowSorter sorter = new TableRowSorter(model);
        jTable.setRowSorter(sorter);
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            try {
                sorter.setRowFilter(RowFilter.regexFilter(text));
            } catch (PatternSyntaxException pse) {
                System.out.println("Bad regex pattern");
            }
        }
    }
    
    public static void updateTable(javax.swing.JTable jTable1) {
        try {
            DefaultTableModel model = new DefaultTableModel();
            model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            Statement stat = connectionClass.getStatement();
            ResultSet rs = stat.executeQuery(
                    "select * from nha_xuat_ban");
            while (rs.next()) {
                model.addRow(new Object[] {
                    rs.getInt("ma_nxb"), rs.getString("ten_nxb"), rs.getString("diachi"), rs.getString("sdt_nxb")
                });
            }
        } catch (Exception e) {
        }
    }

    // Chay query them vao database
    public static void add(String maNXB, String ten_nxb, String diachi, String sdt_nxb){
        try {
            Connection conn = connectionClass.getConnection();
            final PreparedStatement ps = conn
                    .prepareStatement(
                            "insert into nha_xuat_ban(ten_nxb, diachi, sdt_nxb, ma_nxb)"
                                    + "values(?, ?, ?, ?)");
            
            ps.setString(1, ten_nxb);
            ps.setString(2, diachi);
            ps.setString(3, sdt_nxb);
            if(maNXB == null){
                ps.setString(4, maNXB);
            } else{
                ps.setInt(4, Integer.parseInt(maNXB));
            }
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }

    public static void edit(int ma_nxb, javax.swing.JTable jTable, String ten_nxb, String diachi, String sdt_nxb) {
        try {
            PreparedStatement ps = connectionClass.getConnection().prepareStatement(
                "Update nha_xuat_ban set ma_nxb = ?, ten_nxb = ?, diachi = ?, sdt_nxb = ? where ma_nxb = '"+ jTable.getValueAt(jTable.getSelectedRow(), 0).toString() +"'");
            ps.setInt(1, ma_nxb);
            ps.setString(2, ten_nxb);
            ps.setString(3, diachi);
            ps.setString(4, sdt_nxb);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }

    public static void select(javax.swing.JTextField maNXBTextField, javax.swing.JTextField tenNXBTextField,
            javax.swing.JTextField diachiNXBTextField, javax.swing.JTextField sodienthoaiNXBTextField, javax.swing.JTable jTable) {
        try {
            maNXBTextField.setText(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
            ResultSet rs = connectionClass.getStatement().executeQuery(
                "select * from nha_xuat_ban where ma_nxb = '" + jTable.getValueAt(jTable.getSelectedRow(), 0).toString() +"'");
            rs.next();
            tenNXBTextField.setText(rs.getString("ten_nxb"));
            diachiNXBTextField.setText(rs.getString("diachi"));
            sodienthoaiNXBTextField.setText(rs.getString("sdt_nxb"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
    public static void delete(javax.swing.JTable jTable1) {
        try {
            Connection conn = connectionClass.getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM nha_xuat_ban WHERE ma_nxb = ?");
            ps.setInt(1, Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
}
