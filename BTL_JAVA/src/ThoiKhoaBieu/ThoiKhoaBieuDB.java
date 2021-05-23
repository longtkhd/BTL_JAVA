/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThoiKhoaBieu;

import MenuUser.SinhVien;
import ThongTinGiaDinh.ThongTinGiaDinh;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Database;

/**
 *
 * @author Dell
 */
public class ThoiKhoaBieuDB extends Database{
      public ArrayList<ThoiKhoaBieu> getThoiKhoaBieu(String ma_nganh) {
          ArrayList<ThoiKhoaBieu> dstkb = new ArrayList<ThoiKhoaBieu>();
        
        ThoiKhoaBieu tkb = null;
        String getSQL = "SELECT * FROM HOC inner join HOCPHAN on HOC.maHp = HOCPHAN.maHp WHERE maNganh = ?";
 
       
        try {
           openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
            preStmt.setString(1, ma_nganh);
            System.out.println(ma_nganh);
           
            rs = preStmt.executeQuery();
            while (rs.next()) {
                 dstkb.add(new ThoiKhoaBieu(rs.getString("maHp"), rs.getString("tenHp"), rs.getString("loaiHp"),rs.getString("thu"), rs.getInt("ky"), rs.getInt("tietBatDau"),rs.getInt("tietKetThuc"),rs.getInt("soTCLT"),rs.getInt("soTCTH"),rs.getInt("tonTC")));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dstkb;
    }
}
