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
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author vitancuc
 */
public class xulyTacgia {
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
                    "select * from tacgia");
            while (rs.next()) {
                model.addRow(new Object[] {
                        rs.getString("ma_tacgia"), rs.getString("tentacgia")
                        
                });
            }
        } catch (Exception e) {
        }
    }
    public static void add(String tentacgia, String matacgia){
        try {
            Connection conn = connectionClass.getConnection();
            final PreparedStatement ps = conn
                    .prepareStatement(
                            "insert into tacgia(tentacgia, ma_tacgia)"
                                    + "values(?, ?)");
            ps.setString(1, tentacgia);
            if(matacgia != null){
                ps.setInt(2, Integer.parseInt(matacgia));
            } else{
                ps.setString(2, null);
            }
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
    
    public static void select(javax.swing.JTextField txtusername5, javax.swing.JTextField txtusername4,javax.swing.JTable jTable) {
        try {
            txtusername4.setText(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
            ResultSet rs = connectionClass.getStatement().executeQuery(
                "select  ma_tacgia, tentacgia from tacgia where ma_tacgia = '" + jTable.getValueAt(jTable.getSelectedRow(), 0).toString() +"'");
            rs.next();
            txtusername4.setText(rs.getString("tentacgia"));
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
    
    
    public static void edit(int ma_tacgia, javax.swing.JTable jTable,String tentacgia) {
        try {
            PreparedStatement ps = connectionClass.getConnection().prepareStatement(
                    "Update tacgia set ma_tacgia = ?, tentacgia = ? where ma_tacgia = '"+ ma_tacgia +"'");
            ps.setInt(1, ma_tacgia);
            ps.setString(2, tentacgia);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
    
    public static void delete(javax.swing.JTable jTable1) {
        try {
            Connection conn = connectionClass.getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM tacgia WHERE ma_tacgia = ?");
            ps.setInt(1, Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
}
