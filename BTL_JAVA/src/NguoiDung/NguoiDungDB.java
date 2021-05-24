/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguoiDung;

 
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Database;

/**
 *
 * @author Ngan
 */
public class NguoiDungDB extends  Database{
     public ArrayList<NguoiDung> getDSND() {
          ArrayList<NguoiDung> dsnd = new ArrayList<NguoiDung>();
        
        
        String getSQL = "SELECT * FROM NGUOIDUNG ";
 
       
        try {
           openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
           
            rs = preStmt.executeQuery();
            while (rs.next()) {
                 dsnd.add(new NguoiDung(rs.getString("maNguoidung"), rs.getString("tenTaikhoan"), rs.getString("tenNguoiDung"),rs.getString("matKhau"), rs.getString("loaiTaiKhoan")));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dsnd;
    }
      public void InsertND(String mnd,String ttk,String tnd,String mk,String ltk )
    {    
          String getSQL = "INSERT INTO NGUOIDUNG VALUES(?,?,?,?,?)";          
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);  
            preStmt.setString(1, mnd);
            preStmt.setString(2, ttk);
            preStmt.setString(3, tnd);
            preStmt.setString(4, mk);
            preStmt.setString(5, ltk);
            preStmt.executeUpdate();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Mã bị trùng!!", "Lỗi", JOptionPane.CANCEL_OPTION);
        }      
    }
       public void UpdateND(String mnd,String ttk,String tnd,String mk,String ltk )
    {    

        String updateSQL = "UPDATE NGUOIDUNG SET tenTaikhoan=?,tenNguoiDung=?,matKhau=?,loaiTaiKhoan=? where maNguoidung=?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(updateSQL);
           
           preStmt.setString(5, mnd);
            preStmt.setString(1, ttk);
            preStmt.setString(2, tnd);
            preStmt.setString(3, mk);
            preStmt.setString(4, ltk);
            preStmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Cập nhật ngưởi dùng thành công ");
           
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }
    }
     public void xoaDSND(String mnd) {
            
           String getSQL1 = "DELETE NGUOIDUNG WHERE maNguoidung=?";
          
        try {
            openConnection();
            PreparedStatement preStmt1 = cnn.prepareStatement(getSQL1);
            preStmt1.setString(1, mnd);
            preStmt1.executeUpdate(); 
            closeConnection();
        } 
        catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Mã người dùng không tồn tại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }      
    }
    public ArrayList<NguoiDung> timDSND(String mnd) {
        ArrayList<NguoiDung> dsnd = new ArrayList<NguoiDung>();        
        String getSQL = "SELECT * FROM NGUOIDUNG WHERE maNguoidung=? ";
        try {
           openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
            preStmt.setString(1, mnd);
            rs = preStmt.executeQuery();
            while (rs.next()) {
                 dsnd.add(new NguoiDung(rs.getString("maNguoidung"), rs.getString("tenTaikhoan"), rs.getString("tenNguoiDung"),rs.getString("matKhau"), rs.getString("loaiTaiKhoan")));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsnd;
    }
}
