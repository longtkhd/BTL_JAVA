/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThongTinGiaDinh;

import MenuUser.SinhVien;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Database;

/**
 *
 * @author Dell
 */
public class ThongTinGiaDinhDB extends Database{
    public int updateGiaDinh(int id,String ho_ten_bo, String ho_ten_me, String so_dien_thoai, String dia_chi_bo,String dia_chi_me,String nghe_nghiep_bo,String nghe_nghiep_me,String ho_ten_ace) {
        int affectedRow = 0;
        String updateSQL = "UPDATE GIADINH SET hoTenBo=?, hoTenMe=?, soDTNT=?, diaChiBo=?, diaChiMe=?,ngheNghiepBo=?,ngheNghiepMe=?,hoTenACE=? WHERE id=?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(updateSQL);
            preStmt.setString(1, ho_ten_bo);
            preStmt.setString(2, ho_ten_me);
            preStmt.setString(3, so_dien_thoai);
            preStmt.setString(4, dia_chi_bo);
            preStmt.setString(5, dia_chi_me);
            preStmt.setString(6, nghe_nghiep_bo);
            preStmt.setString(7, nghe_nghiep_me);
            preStmt.setString(8, ho_ten_ace);
            preStmt.setInt(9, id);
            affectedRow = preStmt.executeUpdate();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }
        return affectedRow;
    }
    
     public ThongTinGiaDinh getThongTinGiaDinh(String ma_sv) {
        ThongTinGiaDinh giadinh = null;
        String getSQL = "SELECT * FROM GIADINH where GIADINH.maSV =?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
            preStmt.setString(1, ma_sv);
            rs = preStmt.executeQuery();
            if (rs.next()) {
                //sv = new SinhVien(rs.getString("maSv"), rs.getString("hoten"), rs.getString("soDt"), rs.getString("email"), rs.getString("diachiSV"),rs.getString("soThich"),rs.getString("danToc"),rs.getString("tonGiao"),rs.getString("gioiTinh"),rs.getString("maNguoidung"),rs.getString("maNganh"));
                    //sv = new SinhVien("a","2","3","4","5","6","7","8","9","10","11");
                giadinh = new ThongTinGiaDinh(rs.getInt("id"), rs.getString("hoTenBo"), rs.getString("hoTenMe"), rs.getString("soDTNT"), rs.getString("diaChiBo"),rs.getString("diaChiMe"), rs.getString("ngheNghiepBo"), rs.getString("ngheNghiepMe"),rs.getString("hoTenACE"), rs.getString("maSv"));
            }
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Lấy thông tin gia đình thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }

        return giadinh;
    }
     
      

}
