/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguoiDung;

import AdminQLSV.AdminQLSV;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ngan
 */
public class NguoiDungTable extends AbstractTableModel{

     private String name[]={"Mã người dùng", "Tên tài khoản","Tên người dùng","Mật khẩu", "Loại tài khoản"};
    private Class classes[]={String.class, String.class, String.class, String.class, String.class};
    ArrayList<NguoiDung> ds=new ArrayList<NguoiDung>();

    public NguoiDungTable(ArrayList<NguoiDung> ds)
   {
       this.ds=ds;       
   }
    //lấy số phần tử của listThiSinh
    @Override
    public int getRowCount()
    {
        return ds.size();
    }
    //Lấy số lượng tiêu để của mảng.
    @Override
    public int getColumnCount()
    {
        return name.length;
    }
    //Đưa thông tin của phần tử trong arrayList lên jTable
    public Object getValueAt(int rowIndex,int columnIndex)
    {
        switch(columnIndex)
        {
            case 0: return ds.get(rowIndex).getMaNguoidung();
            case 1: return ds.get(rowIndex).getTenTaikhoan();
            case 2: return ds.get(rowIndex).getTenNguoiDung();
            case 3: return ds.get(rowIndex).getMatKhau();
            case 4: return ds.get(rowIndex).getLoaiTaiKhoan();
            default :return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return name[column];
    }
    
}
