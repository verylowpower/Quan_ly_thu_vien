/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quan_ly_thu_vien;
import chucnang.connectionClass;
/**
 *
 * @author vitancuc
 */
public class Quan_ly_thu_vien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connectionClass.ConnectDB();
        new login().setVisible(true);
    }
    
}
