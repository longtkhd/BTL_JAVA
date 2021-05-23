/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocPhan;

import AdminQLSV.AdminQLSV;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Database;

/**
 *
 * @author Dell
 */
public class HocPhanDB extends Database{
    
    public ArrayList<HocPhan> getHP() {
          ArrayList<HocPhan> hp = new ArrayList<HocPhan>();
        
        String getSQL = "SELECT * FROM HOCPHAN ";
        try {
           openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
           
            rs = preStmt.executeQuery();
            while (rs.next()) {
                 hp.add(new HocPhan(rs.getString("maHp"), rs.getString("tenHp"), rs.getString("loaiHp"),rs.getInt("soTCLT"), rs.getInt("soTCTH"), rs.getInt("tonTC")));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hp;
    }
    
     public void InsertHP(String maHp,String tenHp,String loaiHp,Integer soTCLT,Integer soTCTH,Integer tonTC)
    {    
           
          
          String insertSQL = "INSERT INTO HOCPHAN(maHp,tenHp,loaiHp,soTCLT,soTCTH,tonTC) VALUES(?,?,?,?,?,?)";
           
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(insertSQL);
            preStmt.setString(1, maHp);
            preStmt.setString(2, tenHp);
            preStmt.setString(3, loaiHp);
            preStmt.setString(4, soTCLT.toString());
            preStmt.setString(5, soTCTH.toString());
            preStmt.setString(6, tonTC.toString());
            preStmt.executeUpdate();
             JOptionPane.showMessageDialog(null, "Thêm học phần thành công ");
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Có lỗi", "Lỗi", JOptionPane.CANCEL_OPTION);
        }      
    }
     
     public void xoaHP(String mahp) {
            
           String getSQL = "DELETE HOCPHAN WHERE maHp=?";
          
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
            preStmt.setString(1, mahp);
            preStmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Xóa học phần thành công ");
            closeConnection();
        } 
        catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Mã học phần không tồn tại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }      
    }
      public void updateHocphan(String maHp,String tenHp,String loaiHp,Integer soTCLT,Integer soTCTH,Integer tonTC) {
        
        String updateSQL = "UPDATE HOCPHAN SET tenHp=?, loaiHp=?, soTCLT=?, soTCTH=?,tonTC=? WHERE maHp=?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(updateSQL);
           
            preStmt.setString(1, tenHp);
            preStmt.setString(2, loaiHp);
            preStmt.setString(3, soTCLT.toString());
            preStmt.setString(4, soTCTH.toString());
            preStmt.setString(5, tonTC.toString());
            preStmt.setString(6, maHp);
            preStmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Cập nhật học phần thành công ");
           
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }
       
    }
}


