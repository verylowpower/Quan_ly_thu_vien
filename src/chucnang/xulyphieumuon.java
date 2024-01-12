/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chucnang;

import java.awt.Image;
import java.awt.image.BufferedImage;
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
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ADMIN
 */
public class xulyphieumuon {
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
                    "select ma_phieu, ngay_muon, ngay_tra, doc_gia.hoten, nhanvien.hoten, sach.ten_sach from phieu_muon"
                            +
                            " LEFT JOIN doc_gia ON phieu_muon.ma_doc_gia = doc_gia.ma_doc_gia LEFT JOIN sach ON phieu_muon.ma_sach=sach.ma_sach"
                            +
                            " LEFT JOIN nhanvien ON phieu_muon.ma_nv= nhanvien.ma_nv"
                           );
            while (rs.next()) {
                model.addRow(new Object[] {
                        rs.getInt("ma_phieu"), rs.getString("ten_sach"), rs.getString(4), rs.getString(5),
                        rs.getString("ngay_muon") , rs.getString("ngay_tra")  
                });
            }
        } catch (Exception e) {
        }
    }
        // Them phan tu tu database vao comboBox cua phieumuonDialo
    public static void getComboBoxElements( javax.swing.JComboBox jComboBox7, javax.swing.JComboBox jComboBox2, javax.swing.JComboBox jComboBox1) 
    {
        try {
            Statement stat = connectionClass.getStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM sach");
            while (rs.next()) {
                jComboBox7.addItem(rs.getString("ten_sach"));
            }
            rs = stat.executeQuery("SELECT * FROM doc_gia");
            while (rs.next()) {
                jComboBox2.addItem(rs.getString("hoten"));
            }
            rs = stat.executeQuery("SELECT * FROM nhanvien");
            while (rs.next()) {
                jComboBox1.addItem(rs.getString("hoten"));
            }      
        } catch (Exception e) {
        }
    }
    
    // Chay query them vao database
    public static void add(String ma_phieu, String ngay_muon, String ngay_tra,
            javax.swing.JComboBox jComboBox1, javax.swing.JComboBox jComboBox2, javax.swing.JComboBox jComboBox7 ){
        try {
            Connection conn = connectionClass.getConnection();
            final PreparedStatement ps = conn
                    .prepareStatement(
                            "insert into phieu_muon(ma_phieu, ngay_muon, ngay_tra, ma_doc_gia, ma_sach, ma_nv)"
                                    + "values(?, ?, ?, ?, ?, ?)");
            ResultSet rs = connectionClass.getStatement().executeQuery(
                    "SELECT * FROM sach WHERE ten_sach = '" + jComboBox7.getSelectedItem().toString() + "'");
            rs.next();
            int idSach = rs.getInt("ma_sach");
            rs = connectionClass.getStatement()
                    .executeQuery("Select * from doc_gia WHERE hoten = '" + jComboBox2.getSelectedItem() + "'");
            rs.next();
            int idDocgia = rs.getInt("ma_doc_gia");
            rs = connectionClass.getStatement()
                    .executeQuery("Select * from nhanvien WHERE hoten = '" + jComboBox1.getSelectedItem() + "'");
            rs.next();
            int idThuthu = rs.getInt("ma_nv");
            ps.setInt(1, Integer.parseInt(ma_phieu));
            ps.setString(2, ngay_muon);
            ps.setString(3,ngay_tra);
            ps.setInt(4,idDocgia);
            ps.setInt(5,idSach);
            ps.setInt(6,idThuthu);                   
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }

    public static void edit(int ma_phieu, String ngay_muon, String ngay_tra, 
            javax.swing.JComboBox jComboBox7, javax.swing.JComboBox jComboBox2,javax.swing.JComboBox jComboBox1, javax.swing.JTable jTable) {
        try {
            ResultSet rs = connectionClass.getStatement().executeQuery(
                    "SELECT * FROM sach WHERE ten_sach = '" + jComboBox7.getSelectedItem().toString() + "'");
            rs.next();
            int idSach = rs.getInt("ma_sach");
            rs = connectionClass.getStatement()
                    .executeQuery("Select * from doc_gia WHERE hoten = '" + jComboBox2.getSelectedItem() + "'");
            rs.next();
            int idDocgia = rs.getInt("ma_doc_gia");
            rs = connectionClass.getStatement()
                    .executeQuery("Select * from nhanvien WHERE hoten = '" + jComboBox1.getSelectedItem() + "'");
            rs.next();
            int idThuthu = rs.getInt("ma_nv");
            PreparedStatement ps = connectionClass.getConnection().prepareStatement(
                    "Update phieu_muon set ma_phieu = ?, ngay_muon = ?, ngay_tra = ?, ma_doc_gia = ?, ma_sach = ?, ma_nv = ? where ma_phieu = '"
                            + jTable.getValueAt(jTable.getSelectedRow(), 0).toString() +"'");
            ps.setInt(1, ma_phieu);
            ps.setString(2, ngay_muon);
            ps.setString(3, ngay_tra);
            ps.setInt(4,idDocgia);
            ps.setInt(5,idSach);
            ps.setInt(6,idThuthu);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }

    public static void select(javax.swing.JTextField txtusername5,javax.swing.JComboBox jComboBox7,
            javax.swing.JComboBox jComboBox2, javax.swing.JComboBox jComboBox1, javax.swing.JTable jTable) {
        try {
            txtusername5.setText(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
            ResultSet rs = connectionClass.getStatement().executeQuery(
                    "select ngay_muon, ngay_tra, doc_gia.hoten, nhanvien.hoten, sach.ten_sach from phieu_muon "
                            + 
                            "LEFT JOIN doc_gia ON phieu_muon.ma_doc_gia = doc_gia.ma_doc_gia LEFT JOIN sach ON phieu_muon.ma_sach=sach.ma_sach"
                            +
                            " LEFT JOIN nhanvien ON phieu_muon.ma_nv=nhanvien.ma_nv WHERE ma_phieu = '"+ txtusername5.getText() + "'");
            rs.next();
            jComboBox7.setSelectedItem(rs.getString("ten_sach"));
            jComboBox2.setSelectedItem(rs.getString(3));
            jComboBox1.setSelectedItem(rs.getString(4));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
    public static void delete(javax.swing.JTable jTable1) {
        try {
            Connection conn = connectionClass.getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM phieu_muon WHERE ma_phieu = ?");
            ps.setInt(1, Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }

    public static int selectLastID(){
        // String masach = new String();
        int ma_phieu = 0;
        try{
            ResultSet rs = connectionClass.getStatement().executeQuery("Select max(ma_phieu) from phieu_muon ");
            rs.next();
            ma_phieu = rs.getInt(1);
        } catch (SQLException e) {

        }
        return ma_phieu;
    }
}



