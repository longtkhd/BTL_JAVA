/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuUser;

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
public class SinhVienDB extends Database {
      public int updateSinhVien(String ma_sv, String ho_ten, String so_dien_thoai, String email,String dia_chi,String dan_toc,String ton_giao,String so_thich,String gioi_tinh) {
        int affectedRow = 0;
        String updateSQL = "UPDATE SINHVIEN SET hoten=?, soDt=?, email=?, diachiSV=?, danToc=?,tonGiao=?,soThich=?,gioiTinh=? WHERE maSv=?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(updateSQL);
           
            preStmt.setString(1, ho_ten);
            preStmt.setString(2, so_dien_thoai);
            preStmt.setString(3, email);
            preStmt.setString(4, dia_chi);
            preStmt.setString(5, dan_toc);
            preStmt.setString(6, ton_giao);
            preStmt.setString(7, so_thich);
            preStmt.setString(8, gioi_tinh);
            preStmt.setString(9, ma_sv);
            affectedRow = preStmt.executeUpdate();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }
        return affectedRow;
    }
}
