package chucnang;

import java.sql.*;

import javax.swing.JOptionPane;

public class xulyTaiKhoan {
    public static void addPassword(String username, String password, String nhanvien) {
        try {
            ResultSet rs = connectionClass.getStatement()
                    .executeQuery("SELECT COUNT(username) FROM nhanvien where username = '" + username + "'");
            if (rs.getInt("COUNT(username)") == 0) {
                PreparedStatement ps = connectionClass.getConnection()
                        .prepareStatement("UPDATE nhanvien set username = '?', password = '?'' WHERE hoten = '?'");
                ps.setString(1, username);
                ps.setString(2, password);
                ps.setString(3, nhanvien);
                ps.executeUpdate();
            } else {
                JOptionPane.showMessageDialog(null, "Tai khoan da ton tai!");
            }
        } catch (SQLException e) {
            // TODO: handle exception
        }

    }

    public static void getComboBoxElements(javax.swing.JComboBox jComboBox) {
        try {
            Statement stat = connectionClass.getStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM nhanvien");
            while (rs.next()) {
                jComboBox.addItem(rs.getString("hoten"));
            }
        } catch (Exception e) {
        }
    }
    public static void update(javax.swing.JTextField usernameField, javax.swing.JPasswordField passwordField, String nhanvien){
        try {
            ResultSet rs = connectionClass.getStatement().executeQuery("Select username, password from nhanvien where hoten = '" + nhanvien + "'");
            rs.next();
            usernameField.setText(rs.getString("username"));
            passwordField.setText(rs.getString("password"));
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
