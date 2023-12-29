package chucnang;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class xuLyDocGia {
    public static void updateTable(javax.swing.JTable jTable1) {
        try {
            DefaultTableModel model = new DefaultTableModel();
            model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            Statement stat = connectionClass.getStatement();
            ResultSet rs = stat.executeQuery(
                    "select  * from doc_gia");
            while (rs.next()) {
                model.addRow(new Object[] {
                        rs.getInt("ma_doc_gia"), rs.getString("hoten"), rs.getString("ngay_sinh"), rs.getString("gioi_tinh"),
                        rs.getString("sdt")
                });
            }
        } catch (Exception e) {
        }
    }

    

    // Chay query them vao database
    public static void add(String hoten, String ngay_sinh, String gioi_tinh, String sdt){
        try {
            Connection conn = connectionClass.getConnection();
            final PreparedStatement ps = conn
                    .prepareStatement(
                            "insert into doc_gia(hoten, ngay_sinh, gioi_tinh, sdt)"
                                    + "values(?, ?, ?, ?)");
            
            ps.setString(1, hoten);
            ps.setString(2, ngay_sinh);
            ps.setString(3, gioi_tinh);
            ps.setString(4, sdt);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }

    public static void edit(int ma_doc_gia, javax.swing.JTable jTable, String hoten, String ngay_sinh, String gioi_tinh, String sdt) {
        try {
            PreparedStatement ps = connectionClass.getConnection().prepareStatement(
                    "Update doc_gia set ma_doc_gia = ?, hoten = ?, ngay_sinh = ?, gioi_tinh = ?, sdt = ? where ma_doc_gia = '"+ ma_doc_gia +"'");
            ps.setInt(1, ma_doc_gia);
            ps.setString(2, hoten);
            ps.setString(3, ngay_sinh);
            ps.setString(4, gioi_tinh);
            ps.setString(5, sdt);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }

    public static void select(javax.swing.JTextField manguoimuonTextField, javax.swing.JTextField tennguoimuonTextField,
            javax.swing.JTextField ngaysinhTextField, javax.swing.JTextField gioitinhTextField, javax.swing.JTextField sodienthoaiTextField,
            javax.swing.JTable jTable) {
        try {
            manguoimuonTextField.setText(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
            ResultSet rs = connectionClass.getStatement().executeQuery(
                    "select  ma_doc_gia, hoten, ngay_sinh, gioi_tinh, sdt  from doc_gia");
            rs.next();
            tennguoimuonTextField.setText(rs.getString("hoten"));
            ngaysinhTextField.setText(rs.getString("ngay_sinh"));
            gioitinhTextField.setText(rs.getString("gioi_tinh"));
            sodienthoaiTextField.setText(rs.getString("sdt"));
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
    public static void delete(javax.swing.JTable jTable1) {
        try {
            Connection conn = connectionClass.getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM doc_gia WHERE ma_doc_gia = ?");
            ps.setInt(1, Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
    
}