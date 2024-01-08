/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chucnang;

import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author lehuy
 */
public class xuLyThuthu {
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
                    "select ma_nv, hoten, ngay_sinh, gioi_tinh, dia_chi, sdt from nhanvien");
            while (rs.next()) {
                model.addRow(new Object[] {
                        rs.getString("ma_nv"), rs.getString("hoten"), rs.getString("ngay_sinh"),
                        rs.getString("gioi_tinh"),
                        rs.getString("dia_chi"), rs.getString("sdt")
                });
            }
        } catch (Exception e) {
        }
    }

    public static void add(String maNV, String tenNV, String ngaysinh,
            javax.swing.JRadioButton JRadioButton1, javax.swing.JRadioButton JRadioButton2,
            String diaChi, String sdt) {
        try {
            Connection conn = connectionClass.getConnection();
            final PreparedStatement ps = conn
                    .prepareStatement(
                            "insert into nhanvien(ma_nv, hoten, ngay_sinh, gioi_tinh, dia_chi, sdt)"
                                    + "values(?, ?, ?, ?, ?, ?)");
            ps.setInt(1, Integer.parseInt(maNV));
            ps.setString(2, tenNV);
            // ps.setString(2, String.valueOf(JComboBox1.getSelectedItem().toString() + "/"
            // + JComboBox2.getSelectedItem().toString()
            // + "/" + JComboBox3.getSelectedItem().toString()));
            ps.setString(3, ngaysinh);
            if (JRadioButton1.isSelected()) {
                ps.setString(4, "Nam");
            } else if (JRadioButton2.isSelected()) {
                ps.setString(4, "Nữ");
            }
            ps.setString(5, diaChi);
            ps.setString(6, sdt);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }

    public static void select(javax.swing.JTextField txtusername5, javax.swing.JTextField txtusername4,
            javax.swing.JRadioButton JRadioButton1, javax.swing.JRadioButton JRadioButton2,
            javax.swing.JTextField txtusername9, javax.swing.JTextField txtusername7, javax.swing.JTable jTable, javax.swing.JTextField jDateChooser1) {
        try {
            txtusername5.setText(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
            ResultSet rs = connectionClass.getStatement().executeQuery(
                    "select ma_nv, hoten, gioi_tinh, ngay_sinh, dia_chi, sdt from nhanvien where ma_nv = '" + jTable.getValueAt(jTable.getSelectedRow(), 0).toString() + "'");
            rs.next();
            txtusername4.setText(rs.getString("hoten"));
            if (rs.getString("gioi_tinh") != null) {
                if ((rs.getString("gioi_tinh")).equals("Nam")) {
                    JRadioButton1.setSelected(true);
                } else if (rs.getString("gioi_tinh").equals("Nữ")) {
                    JRadioButton2.setSelected(true);
                }
            }
            jDateChooser1.setText(rs.getString("ngay_sinh"));
            txtusername9.setText(rs.getString("dia_chi"));
            txtusername7.setText(rs.getString("sdt"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }

    public static void edit(int ma_nv, javax.swing.JTable jTable, String tenNV, String ngaysinh,
            javax.swing.JRadioButton JRadioButton1, javax.swing.JRadioButton JRadioButton2,
            String diaChi, String sdt) {
        try {
            PreparedStatement ps = connectionClass.getConnection().prepareStatement(
                "Update nhanvien set ma_nv = ?, hoten = ?, ngay_sinh = ?, gioi_tinh = ?, dia_chi = ?, sdt = ? where ma_nv = '"+ jTable.getValueAt(jTable.getSelectedRow(), 0).toString() + "'");
            ps.setInt(1, ma_nv);
            ps.setString(2, tenNV);
            ps.setString(3, ngaysinh);
            if (JRadioButton1.isSelected()) {
                ps.setString(4, "Nam");
            } else if (JRadioButton2.isSelected()) {
                ps.setString(4, "Nữ");
            }
            ps.setString(5, diaChi);
            ps.setString(6, sdt);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }

    public static void delete(javax.swing.JTable jTable1) {
        try {
            Connection conn = connectionClass.getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM nhanvien WHERE ma_nv = ?");
            ps.setInt(1, Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
    public static int selectLastID(){
        int mathuthu = 0;
        try{
            ResultSet rs = connectionClass.getStatement().executeQuery("Select max(ma_nv) from nhanvien ");
            rs.next();
            mathuthu = rs.getInt(1);
        } catch (SQLException e) {

        }
        return mathuthu;
    }

    public static void edit(int parseInt, JTable jTable, String dateFormatString, JRadioButton jRadioButton1, JRadioButton jRadioButton2, String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
