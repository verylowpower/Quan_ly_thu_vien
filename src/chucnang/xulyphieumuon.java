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
                    "select ma_phieu, ngay_muon, ngay_tra, docgia.ma_doc_gia, nhanvien.ma_nv, sach.ma_sach from phieu_muon"
                            +
                            " LEFT JOIN docgia ON phieu_muon.ma_doc_gia = docgia.ma_doc_gia LEFT JOIN sach ON phieu_muon.ma_sach=sach.ma_sach"
                            +
                            " LEFT JOIN nhanvien ON phieu_muon.ma_nv= nhanvien.ma_nv"
                           );
            while (rs.next()) {
                model.addRow(new Object[] {
                        rs.getInt("ma_phieu"), rs.getString("ngay_muon"), rs.getString("ngay_tra"), rs.getString("ma_doc_gia"),
                        rs.getString("ma_nv") , rs.getString("ma_sach")  
                });
            }
        } catch (Exception e) {
        }
    }
        // Them phan tu tu database vao comboBox cua phieumuonDialo
    public static void getComboBoxElements( javax.swing.JComboBox jComboBox7, javax.swing.JComboBox jComboBox1, javax.swing.JComboBox jComboBox2) 
    {
        try {
            Statement stat = connectionClass.getStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM sach");
            while (rs.next()) {
                jComboBox7.addItem(rs.getString("ten_sach"));
            }
            rs = stat.executeQuery("SELECT * FROM docgia");
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
    public static void add(String ma_phieu, javax.swing.JComboBox jComboBox3, javax.swing.JComboBox jComboBox4,
            javax.swing.JComboBox jComboBox6,javax.swing.JComboBox jComboBox5, javax.swing.JComboBox jComboBox1, javax.swing.JComboBox jComboBox2,
            javax.swing.JComboBox jComboBox7 ){
        try {
            Connection conn = connectionClass.getConnection();
            final PreparedStatement ps = conn
                    .prepareStatement(
                            "insert into sach(ma_phieu, ngay_muon, ngay_tra, ma_doc_gia, ma_sach, ma_nv)"
                                    + "values(?, ?, ?, ?, ?, ?, ?)");
            ResultSet rs = connectionClass.getStatement().executeQuery(
                    "SELECT * FROM sach WHERE ten_sach = '" + jComboBox7.getSelectedItem().toString() + "'");
            rs.next();
            int idSach = rs.getInt("ma_sach");
            rs = connectionClass.getStatement()
                    .executeQuery("Select * from docgia WHERE hoten = '" + jComboBox2.getSelectedItem() + "'");
            rs.next();
            int idDocgia = rs.getInt("ma_doc_gia");
            rs = connectionClass.getStatement()
                    .executeQuery("Select * from nhanvien WHERE hoten = '" + jComboBox1.getSelectedItem() + "'");
            rs.next();
            int idThuthu = rs.getInt("ma_nv");
            ps.setInt(1, Integer.parseInt(ma_phieu));
            ps.setInt(2,idSach);
            ps.setInt(3,idDocgia);
            ps.setInt(4,idThuthu);
            ps.setString(5, String.valueOf( jComboBox4.getSelectedItem().toString() + "/" + jComboBox3.getSelectedItem().toString()));  
            ps.setString(6, String.valueOf( jComboBox6.getSelectedItem().toString() + "/" + jComboBox5.getSelectedItem().toString()));                    
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }

    public static void edit(String ma_phieu, javax.swing.JComboBox jComboBox7, javax.swing.JComboBox jComboBox4,
            javax.swing.JComboBox jComboBox2,javax.swing.JComboBox jComboBox1, javax.swing.JComboBox jComboBox3, 
            javax.swing.JComboBox jComboBox5, javax.swing.JComboBox jComboBox6) {
        try {
            ResultSet rs = connectionClass.getStatement().executeQuery(
                    "SELECT * FROM sach WHERE ten_sach = '" + jComboBox7.getSelectedItem().toString() + "'");
            rs.next();
            int idSach = rs.getInt("ma_sach");
            rs = connectionClass.getStatement()
                    .executeQuery("Select * from docgia WHERE hoten = '" + jComboBox2.getSelectedItem() + "'");
            rs.next();
            int idDocgia = rs.getInt("ma_doc_gia");
            rs = connectionClass.getStatement()
                    .executeQuery("Select * from nhanvien WHERE hoten = '" + jComboBox1.getSelectedItem() + "'");
            rs.next();
            int idThuthu = rs.getInt("ma_nv");
             
            
            PreparedStatement ps = connectionClass.getConnection().prepareStatement(
                    "Update phieu_muon set ma_phieu = ?, ngay_muon = ?, ngay_tra = ?, ma_doc_gia = ?, ma_sach = ?, ma_nv = ? where ma_phieu = '"+ ma_phieu +"'");
            ps.setInt(1, Integer.parseInt(ma_phieu));
            ps.setInt(2,idSach);
            ps.setInt(3,idDocgia);
            ps.setInt(4,idThuthu);
            ps.setString(5, String.valueOf( jComboBox4.getSelectedItem().toString() + "/" + jComboBox3.getSelectedItem().toString()));  
            ps.setString(6, String.valueOf( jComboBox6.getSelectedItem().toString() + "/" + jComboBox5.getSelectedItem().toString())); 
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }

    public static void select(javax.swing.JTextField txtusername5,javax.swing.JComboBox jComboBox7,
            javax.swing.JComboBox jComboBox2, javax.swing.JComboBox jComboBox1,javax.swing.JComboBox jComboBox3, 
            javax.swing.JComboBox jComboBox4, javax.swing.JComboBox jComboBox5,
            javax.swing.JTable jTable, javax.swing.JComboBox jComboBox6) {
        try {
            txtusername5.setText(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
            ResultSet rs = connectionClass.getStatement().executeQuery(
                    "select ma_phieu, ngay_muon, ngay_tra, docgia.ma_doc_gia, nhanvien.ma_nv, sach.ma_sach from phieu_muon"
                            + 
                            "LEFT JOIN docgia ON phieu_muon.ma_doc_gia = docgia.ma_doc_gia LEFT JOIN sach ON phieu_muon.ma_sach=sach.ma_sach"
                            +
                            " LEFT JOIN nhanvien ON phieu_muon.ma_nv=nhanvien.ma_nv "+ txtusername5.getText()
                           );
            rs.next();
            txtusername5.setText(rs.getString("ma_phieu"));
            jComboBox7.setSelectedItem(rs.getString("ma_sach"));
            jComboBox2.setSelectedItem(rs.getString("ngay_doc_gia"));
            jComboBox1.setSelectedItem(rs.getString("ngay_nv"));
            jComboBox3.setSelectedItem(rs.getString("ngay_muon"));
            jComboBox4.setSelectedItem(rs.getString("ngay_muon"));
            jComboBox5.setSelectedItem(rs.getString("ngay_tra"));
            jComboBox6.setSelectedItem(rs.getString("ngay_tra"));
                       
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
            ResultSet rs = connectionClass.getStatement().executeQuery("Select max(ma_sach) from sach ");
            rs.next();
            ma_phieu = rs.getInt(1);
        } catch (SQLException e) {

        }
        return ma_phieu;
    }
}



