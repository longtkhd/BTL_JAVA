/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DangNhap;

import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Database;
import thong_tin_ca_nhan.SinhVien;

/**
 *
 * @author Dell
 */
public class DangNhapDB extends Database{
    public SinhVien dangNhapNguoiDung(String tentaikhoan, String password) {
        SinhVien sv = null;
        String getSQL = "SELECT * FROM NGUOIDUNG join SINHVIEN on NGUOIDUNG.maNguoidung = SINHVIEN.maNguoidung WHERE tenTaiKhoan = ? AND matKhau = ?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
            preStmt.setString(1, tentaikhoan);
            preStmt.setString(2, password);
            rs = preStmt.executeQuery();
            if (rs.next()) {
                sv = new SinhVien(rs.getString("maSv"), rs.getString("hoten"), rs.getString("soDt"), rs.getString("email"), rs.getString("diachiSV"),rs.getString("soThich"),rs.getString("danToc"),rs.getString("tonGiao"),rs.getString("gioiTinh"),rs.getString("maNguoidung"),rs.getString("maNganh"));
            }
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Đăng nhập thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }

        return sv;
    }

  
}
