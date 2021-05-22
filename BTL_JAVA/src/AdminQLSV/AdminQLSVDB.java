/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminQLSV;

import MenuUser.SinhVien;
import ThoiKhoaBieu.ThoiKhoaBieu;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.Database;

/**
 *
 * @author Dell
 */
public class AdminQLSVDB extends Database{
    public ArrayList<SinhVien> getDSSV() {
          ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();
        
        
        String getSQL = "SELECT * FROM SINHVIEN ";
 
       
        try {
           openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
           
            rs = preStmt.executeQuery();
            while (rs.next()) {
                 dssv.add(new SinhVien(rs.getString("maSv"), rs.getString("hoten"), rs.getString("soDt"),rs.getString("email"), rs.getString("diachiSv"), rs.getString("sothich"),rs.getString("danToc"),rs.getString("tonGiao"),rs.getString("gioiTinh"),rs.getString("maNguoidung"),rs.getString("maNganh"),rs.getString("maNguoidung")));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dssv;
    }
    
}
