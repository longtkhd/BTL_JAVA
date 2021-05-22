/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChuongTrinhDaoTao;

import ThongTinGiaDinh.ThongTinGiaDinh;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Database;

/**
 *
 * @author Dell
 */
public class ChuongTrinhDaoTaoDB extends Database{
    public ChuongTrinhDaoTao getChuongTrinhDaoTao(String ma_nganh) {
        ChuongTrinhDaoTao ctdt = null;
        String getSQL = "SELECT * FROM CTDAOTAO inner join NGANH on CTDAOTAO.maNganh = NGANH.maNganh where CTDAOTAO.maNganh =?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
            preStmt.setString(1, ma_nganh);
            rs = preStmt.executeQuery();
            if (rs.next()) {
                ctdt = new ChuongTrinhDaoTao(rs.getString("maSo"), rs.getString("maNganh"), rs.getString("khoaHoc"), rs.getString("tenChuongTrinh"), rs.getString("trinhDoDaoTao"),rs.getString("hinhThucDaoTao"),rs.getString("tenNganh"));
            }
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Lấy thông tin thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }

        return ctdt;
    }
}
