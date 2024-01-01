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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author quann
 */
public class xuLySach {
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
                    "select  ma_sach, ten_sach, nam_xb ,tacgia.tentacgia, nha_xuat_ban.ten_nxb, theloai.tentheloai  from sach"
                            +
                            " LEFT JOIN tacgia ON sach.ma_tacgia = tacgia.ma_tacgia LEFT JOIN nha_xuat_ban ON sach.ma_nxb = nha_xuat_ban.ma_nxb"
                            +
                            " LEFT JOIN theloai ON sach.ma_theloai = theloai.ma_theloai");
            while (rs.next()) {
                model.addRow(new Object[] {
                        rs.getInt("ma_sach"), rs.getString("ten_sach"), rs.getString("tentheloai"), rs.getString("tentacgia"),
                        rs.getString("ten_nxb"), rs.getString("nam_xb")
                });
            }
        } catch (Exception e) {
        }
    }

    // Them phan tu tu database vao comboBox cua sachDialog
    public static void getComboBoxElements(javax.swing.JComboBox jComboBox, javax.swing.JComboBox jComboBox1,
            javax.swing.JComboBox jComboBox2) {
        try {
            Statement stat = connectionClass.getStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM tacgia");
            while (rs.next()) {
                jComboBox.addItem(rs.getString("tentacgia"));
            }
            rs = stat.executeQuery("SELECT * FROM nha_xuat_ban");
            while (rs.next()) {
                jComboBox1.addItem(rs.getString("ten_nxb"));
            }
            rs = stat.executeQuery("SELECT * FROM theloai");
            while (rs.next()) {
                jComboBox2.addItem(rs.getString("tentheloai"));
            }
        } catch (Exception e) {
        }
    }

    // Chay query them vao database
    public static void add(int ma_sach, javax.swing.JComboBox jComboBox, javax.swing.JComboBox jComboBox1,
            javax.swing.JComboBox jComboBox2, String tenSach, String namXb, ByteArrayOutputStream img){
        try {
            Connection conn = connectionClass.getConnection();
            final PreparedStatement ps = conn
                    .prepareStatement(
                            "insert into sach(ma_sach, ten_sach, nam_xb, ma_nxb, ma_theloai, ma_tacgia, anhSach)"
                                    + "values(?, ?, ?, ?, ?, ?, ?)");
            ResultSet rs = connectionClass.getStatement().executeQuery(
                    "SELECT * FROM tacgia WHERE tentacgia = '" + jComboBox.getSelectedItem().toString() + "'");
            rs.next();
            int idTacGia = rs.getInt("ma_tacgia");
            rs = connectionClass.getStatement()
                    .executeQuery("Select * from theloai WHERE tentheloai = '" + jComboBox2.getSelectedItem() + "'");
            rs.next();
            int idTheLoai = rs.getInt("ma_theloai");
            rs = connectionClass.getStatement()
                    .executeQuery("Select * from nha_xuat_ban WHERE ten_nxb = '" + jComboBox1.getSelectedItem() + "'");
            rs.next();
            int idNxb = rs.getInt("ma_nxb");
            ps.setInt(1, ma_sach);
            ps.setString(2, tenSach);
            ps.setString(3, namXb);
            ps.setInt(4, idNxb);
            ps.setInt(5, idTheLoai);
            ps.setInt(6, idTacGia);
            ps.setBytes(7, img.toByteArray());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }

    public static void edit(int maSach, javax.swing.JTable jTable, javax.swing.JComboBox tacgiaComboBox,
            javax.swing.JComboBox nxbComboBox, javax.swing.JComboBox theloaiComboBox, String tenSach, String namXb, ByteArrayOutputStream img) {
        try {
            ResultSet rs = connectionClass.getStatement().executeQuery(
                    "SELECT * FROM tacgia WHERE tentacgia = '" + tacgiaComboBox.getSelectedItem().toString() + "'");
            rs.next();
            int idTacGia = rs.getInt("ma_tacgia");
            rs = connectionClass.getStatement()
                    .executeQuery("Select * from theloai WHERE tentheloai = '" + theloaiComboBox.getSelectedItem() + "'");
            rs.next();
            int idTheLoai = rs.getInt("ma_theloai");
            rs = connectionClass.getStatement()
                    .executeQuery("Select * from nha_xuat_ban WHERE ten_nxb = '" + nxbComboBox.getSelectedItem() + "'");
            rs.next();
            int idNxb = rs.getInt("ma_nxb");
            PreparedStatement ps = connectionClass.getConnection().prepareStatement(
                    "Update sach set ma_sach = ?, ten_sach = ?, nam_xb = ?, ma_nxb = ?, ma_theloai = ?, ma_tacgia = ?, anhSach = ? where ma_sach = '"+ maSach +"'");
            ps.setInt(1, maSach);
            ps.setString(2, tenSach);
            ps.setString(3, namXb);
            ps.setInt(4, idNxb);
            ps.setInt(5, idTheLoai);
            ps.setInt(6, idTacGia);
            ps.setBytes(7, img.toByteArray());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }

    public static void select(javax.swing.JTextField masachTextField, javax.swing.JTextField tensachTextField,
            javax.swing.JTextField namTextField,
            javax.swing.JComboBox nxbComboBox, javax.swing.JComboBox tacgiaComboBox, javax.swing.JComboBox theloaiComboBox,
            javax.swing.JTable jTable, javax.swing.JLabel pictureLabel) {
        try {
            masachTextField.setText(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
            ResultSet rs = connectionClass.getStatement().executeQuery(
                    "select  ma_sach, ten_sach, nam_xb, anhSach, tacgia.tentacgia, nha_xuat_ban.ten_nxb, theloai.tentheloai  from sach"
                            +
                            " LEFT JOIN tacgia ON sach.ma_tacgia = tacgia.ma_tacgia LEFT JOIN nha_xuat_ban ON sach.ma_nxb = nha_xuat_ban.ma_nxb"
                            +
                            " LEFT JOIN theloai ON sach.ma_theloai = theloai.ma_theloai where sach.ma_sach = " +masachTextField.getText());
            rs.next();
            tensachTextField.setText(rs.getString("ten_sach"));
            namTextField.setText(rs.getString("nam_xb"));
            nxbComboBox.setSelectedItem(rs.getString("ten_nxb"));
            tacgiaComboBox.setSelectedItem(rs.getString("tentacgia"));
            theloaiComboBox.setSelectedItem(rs.getString("tentheloai"));
            if(rs.getBytes("anhSach") != null){
                ImageIcon img = new ImageIcon(new ImageIcon(rs.getBytes("anhSach")).getImage());
                pictureLabel.setIcon(new javax.swing.ImageIcon(img.getImage().getScaledInstance(192, 182, Image.SCALE_SMOOTH)));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
    public static void delete(javax.swing.JTable jTable1) {
        try {
            Connection conn = connectionClass.getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM sach WHERE ma_sach = ?");
            ps.setInt(1, Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
    public static ByteArrayOutputStream getImg(javax.swing.JLabel pictureLabel){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);

        ByteArrayOutputStream temp = new ByteArrayOutputStream();
        try {
            BufferedImage im = ImageIO.read(fileChooser.getSelectedFile());
            temp = new ByteArrayOutputStream();
            ImageIO.write(im, "png", temp);
            pictureLabel.setIcon(new javax.swing.ImageIcon(im.getScaledInstance(pictureLabel.getWidth(), pictureLabel.getHeight(), java.awt.Image.SCALE_SMOOTH)));
        } catch (IOException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "No File Selected");
        }
        return temp;
    }
}
