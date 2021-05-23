/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminQLSV;

import ChuongTrinhDaoTao.ChuongTrinhDaoTao;
import MenuUser.SinhVien;
import ThoiKhoaBieu.ThoiKhoaBieu;
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
public class AdminQLSVDB extends Database{
    public ArrayList<AdminQLSV> getDSSV() {
          ArrayList<AdminQLSV> dssv = new ArrayList<AdminQLSV>();
        
        
        String getSQL = "SELECT * FROM SINHVIEN ";
 
       
        try {
           openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
           
            rs = preStmt.executeQuery();
            while (rs.next()) {
                 dssv.add(new AdminQLSV(rs.getString("maSv"), rs.getString("hoten"), rs.getString("soDt"),rs.getString("email"), rs.getString("diachiSv"), rs.getString("sothich"),rs.getString("danToc"),rs.getString("tonGiao"),rs.getString("gioiTinh"),rs.getString("maNguoidung"),rs.getString("maNganh")));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dssv;
    }
    //bắt dầu thêm code
    public void InsertSV(String msv,String ht,String sdt,String email,
            String dc,String soth,String dt,String tg, String gt,String mand,String mn)
    {    
           
           String getSQL1 = "INSERT INTO NGUOIDUNG(maNguoidung) VALUES(?)";
          String getSQL = "INSERT INTO SINHVIEN(maSv,hoten,soDt,email,diaChiSV,soThich,danToc,tonGiao,gioiTinh,maNguoidung,maNganh) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
           
        try {
            openConnection();
            PreparedStatement preStmt1 = cnn.prepareStatement(getSQL1);
            preStmt1.setString(1, mand);
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
            
            preStmt.setString(1, msv);
            preStmt.setString(2, ht);
            preStmt.setString(3, sdt);
            preStmt.setString(4, email);
            preStmt.setString(5, dc);
            preStmt.setString(6, soth);
            preStmt.setString(7, dt);
            preStmt.setString(8, tg);
            preStmt.setString(9, gt);
            preStmt.setString(10, mand); 
            preStmt.setString(11, mn);
            preStmt1.executeUpdate();
            preStmt.executeUpdate();
            
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Mã bị trùng!!", "Lỗi", JOptionPane.CANCEL_OPTION);
        }      
    }
    public ArrayList<ChuongTrinhDaoTao> getMaNganh() {
          ArrayList<ChuongTrinhDaoTao> dsmn = new ArrayList<ChuongTrinhDaoTao>();
        String getSQL = "SELECT maNganh FROM NGANH ";
        try {
           openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
           
            rs = preStmt.executeQuery();
            while (rs.next()) {
                 dsmn.add(new ChuongTrinhDaoTao(rs.getString("maNganh")));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dsmn;
      }
        public ArrayList<NguoiDung> getMaND() {
          ArrayList<NguoiDung> dsmn = new ArrayList<NguoiDung>();
        
        
        String getSQL = "SELECT maNguoidung FROM NGUOIDUNG ";
 
       
        try {
           openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
           
            rs = preStmt.executeQuery();
            while (rs.next()) {
                 dsmn.add(new NguoiDung(rs.getString("maNguoidung")));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dsmn;
    }
    public ArrayList<AdminQLSV> timDSSV(String msv) {
          ArrayList<AdminQLSV> dssv = new ArrayList<AdminQLSV>();        
        String getSQL = "SELECT * FROM SINHVIEN WHERE maSv=? ";
        try {
           openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
            preStmt.setString(1, msv);
            rs = preStmt.executeQuery();
            while (rs.next()) {
                 dssv.add(new AdminQLSV(rs.getString("maSv"), rs.getString("hoten"), rs.getString("soDt"),rs.getString("email"), rs.getString("diachiSv"), rs.getString("sothich"),rs.getString("danToc"),rs.getString("tonGiao"),rs.getString("gioiTinh"),rs.getString("maNguoidung"),rs.getString("maNganh")));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dssv;
    }
    public void xoaDSSV(String msv) {
            
           String getSQL = "DELETE SINHVIEN WHERE maSv=?";
          
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
            preStmt.setString(1, msv);
            preStmt.executeUpdate(); 
            closeConnection();
        } 
        catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Mã sinh viên không tồn tại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }      
    }
}
