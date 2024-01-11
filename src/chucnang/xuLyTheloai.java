/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chucnang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author lehuy
 */
public class xuLyTheloai {
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
                    "select ma_theloai, tentheloai from theloai");
            while (rs.next()) {
                model.addRow(new Object[] {
                        rs.getString("ma_theloai"), rs.getString("tentheloai")
                });
            }
        } catch (Exception e) {
        }
    }
    public static void add(String matheloai, String tentheloai){
        try {
            Connection conn = connectionClass.getConnection();
            final PreparedStatement ps = conn
                    .prepareStatement(
                            "insert into theloai(ma_theloai, tentheloai)"
                                    + "values(?, ?)");
            ps.setInt(1, Integer.parseInt(matheloai));
            ps.setString(2, tentheloai);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
        public static void select(javax.swing.JTextField txtusername5, javax.swing.JTextField txtusername4, javax.swing.JTable jTable) {
    try {
        txtusername5.setText(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
        ResultSet rs = connectionClass.getStatement().executeQuery(
                    "select ma_theloai, tentheloai from theloai");
            rs.next();
        txtusername4.setText(rs.getString("tentheloai"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
    
    public static void edit(int ma_theloai, javax.swing.JTable jTable,String tentheloai) {
        try {
            PreparedStatement ps = connectionClass.getConnection().prepareStatement(
                    "Update theloai set ma_theloai = ?, tentheloai = ? where ma_theloai = '"+ jTable.getValueAt(jTable.getSelectedRow(), 0).toString() +"'");
            ps.setInt(1, ma_theloai);
            ps.setString(2, tentheloai);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
    
    public static void delete(javax.swing.JTable jTable1) {
        try {
            Connection conn = connectionClass.getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM theloai WHERE ma_theloai = ?");
            ps.setInt(1, Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
    
    public static int selectLastID(){
        // String masach = new String();
        int matheloai = 0;
        try{
            ResultSet rs = connectionClass.getStatement().executeQuery("Select max(ma_theloai) from theloai");
            rs.next();
            matheloai = rs.getInt(1);
        } catch (SQLException e) {

        }
        return matheloai;
    }
}
