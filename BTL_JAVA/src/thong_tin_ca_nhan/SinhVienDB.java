/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thong_tin_ca_nhan;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.Database;

/**
 *
 * @author Dell
 */
//ma_sv, ho_ten, so_dt,email,dia_chi,so_thich,dan_toc,ton_giao,gioi_tinh
public class SinhVienDB extends Database{
     public ArrayList<SinhVien> getSinhVien() {
        ArrayList<SinhVien> dsSv = new ArrayList<SinhVien>();
        String getAllSQL = "SELECT * FROM SINHVIEN";
        try {
            openConnection();
            Statement stmt = cnn.createStatement();
            rs = stmt.executeQuery(getAllSQL);
            while (rs.next()) {
                dsSv.add(new SinhVien(rs.getString("maSv"), rs.getString("hoten"), rs.getString("soDt"), rs.getString("email"), rs.getString("diachiSV"), rs.getString("soThich"), rs.getString("danToc"), rs.getString("tonGiao"),rs.getString("gioiTinh"),rs.getString("maNguoidung"),rs.getString("maNganh")));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dsSv;
    }

}
