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
                    "select * from phieu_muon"
                            +
                            " LEFT JOIN docgia ON phieu_muon.ma_doc_gia = docgia.ma_doc_gia LEFT JOIN sach ON phieu_muon.ma_sach=sach.ma_sach"
                            +
                            " LEFT JOIN nhanvien ON phieu_muon.ma_nv=nhanvien.ma_nv"
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
        // Them phan tu tu database vao comboBox cua sachDialog
    public static void getComboBoxElements(javax.swing.JComboBox jComboBox4, javax.swing.JComboBox jComboBox6) {
        try {
            Statement stat = connectionClass.getStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM sach");
            while (rs.next()) {
                jComboBox4.addItem(rs.getString("ten_sach"));
            }
            rs = stat.executeQuery("SELECT * FROM docgia");
            while (rs.next()) {
                jComboBox6.addItem(rs.getString("hoten"));
            }          
        } catch (Exception e) {
        }
    }
    
    // Chay query them vao database
    public static void add(javax.swing.JComboBox jComboBox3, javax.swing.JComboBox jComboBox4,
            javax.swing.JComboBox jComboBox6,javax.swing.JComboBox jComboBox5, String ma_doc_gia, String ma_sach, String ngay_tra, String ngay_muon, String ma_phieu){
        try {
            Connection conn = connectionClass.getConnection();
            final PreparedStatement ps = conn
                    .prepareStatement(
                            "insert into sach(ngay_muon, ngay_tra, ma_doc_gia, ma_sach)"
                                    + "values(?, ?, ?, ?, ?)");
            ps.setString(1, String.valueOf( jComboBox4.getSelectedItem().toString() + "/" + jComboBox3.getSelectedItem().toString()));  
            ps.setString(2, String.valueOf( jComboBox6.getSelectedItem().toString() + "/" + jComboBox5.getSelectedItem().toString())); 
            ps.setString(3,ma_doc_gia);
            ps.setString(4,ma_sach);
            
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }

    public static void edit(javax.swing.JComboBox jComboBox3, javax.swing.JComboBox jComboBox4,
            javax.swing.JComboBox jComboBox6,javax.swing.JComboBox jComboBox5, String ma_doc_gia, String ma_sach, String ma_phieu, javax.swing.JTextField txtusename5, javax.swing.JTextField txtusename4,
            javax.swing.JTextField txtusename6) {
        try {
            
            PreparedStatement ps = connectionClass.getConnection().prepareStatement(
                    "Update phieu_muon set ma_phieu = ?, ngay_muon = ?, ngay_tra = ?, ma_doc_gia = ?, ma_sach = ?, ma_nv = ? where ma_phieu = '"+ ma_phieu +"'");
            ps.setString(1, String.valueOf( jComboBox4.getSelectedItem().toString() + "/" + jComboBox3.getSelectedItem().toString()));  
            ps.setString(2, String.valueOf( jComboBox6.getSelectedItem().toString() + "/" + jComboBox5.getSelectedItem().toString())); 
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }

    public static void select(javax.swing.JTextField txtusername5, javax.swing.JTextField txtusername4,
            javax.swing.JTextField txtusername6,
            javax.swing.JComboBox jComboBox3, javax.swing.JComboBox jComboBox4, javax.swing.JComboBox jComboBox5,
            javax.swing.JTable jTable, javax.swing.JComboBox jComboBox6) {
        try {
            txtusername5.setText(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
            ResultSet rs = connectionClass.getStatement().executeQuery(
                    "select* from phieu_muon"
                            + "LEFT JOIN docgia ON phieu_muon.ma_doc_gia = docgia.ma_doc_gia LEFT JOIN sach ON phieu_muon.ma_sach=sach.ma_sach"
                            +
                            " LEFT JOIN nhanvien ON phieu_muon.ma_nv=nhanvien.ma_nv "+ txtusername4.getText()
                           );
            rs.next();
            txtusername5.setText(rs.getString("ma_phieu"));
            txtusername4.setText(rs.getString("ma_sach"));
            txtusername6.setText(rs.getString("ma_doc_gia")); 
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

    public static void edit(int parseInt, JTable jTable, String text, String text0, JComboBox<String> jComboBox3, JComboBox<String> jComboBox4, JComboBox<String> jComboBox5, JComboBox<String> jComboBox6) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void add(String text, String text0, JComboBox<String> jComboBox3, JComboBox<String> jComboBox4, JComboBox<String> jComboBox5, JComboBox<String> jComboBox6) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

