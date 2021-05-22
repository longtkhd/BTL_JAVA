/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiemThiUser;

import ThoiKhoaBieu.ThoiKhoaBieu;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Database;

/**
 *
 * @author Dell
 */
public class DiemThiDB extends Database{
          public ArrayList<DiemThi> getDiemThi(String ma_sv) {
          ArrayList<DiemThi> diemthi = new ArrayList<DiemThi>();
        
       
        String getSQL = "SELECT * FROM KETQUA inner join HOCPHAN on KETQUA.maHp = HOCPHAN.maHp inner join HOC on HOC.maHp = HOCPHAN.maHp WHERE maSv = ?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
            preStmt.setString(1, ma_sv);
          
           
            rs = preStmt.executeQuery();
            while(rs.next()) {
                diemthi.add(new DiemThi(rs.getString("maHp"), rs.getString("tenHp"), rs.getString("loaiHp"),rs.getInt("diem"),rs.getInt("ky")));
                    //sv = new SinhVien("a","2","3","4","5","6","7","8","9","10","11");
                //giadinh = new ThongTinGiaDinh(rs.getInt("id"), rs.getString("hoTenBo"), rs.getString("hoTenMe"), rs.getString("soDTNT"), rs.getString("diaChiBo"),rs.getString("diaChiMe"), rs.getString("ngheNghiepBo"), rs.getString("ngheNghiepMe"),rs.getString("hoTenACE"), rs.getString("maSv"));
               
            }
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Đăng nhập thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }

        return diemthi;
    }
}
