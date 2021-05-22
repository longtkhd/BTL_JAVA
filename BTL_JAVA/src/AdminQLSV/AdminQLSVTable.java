/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminQLSV;

import MenuUser.SinhVien;
import ThoiKhoaBieu.*;
import hocphan.*;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tunga
 */
public class AdminQLSVTable extends AbstractTableModel {
    
    private String name[]={"Mã sinh viên", "Họ tên","Số điện thoại","Email", "Địa chỉ", "Sở thích","Dân tộc","Tôn giáo","Giới tính","Mã người dùng","Mã ngành" };
    private Class classes[]={String.class, String.class, String.class, String.class, String.class, String.class,String.class,String.class,String.class,String.class,String.class};
    
    ArrayList<SinhVien> ds=new ArrayList<SinhVien>();

    public AdminQLSVTable(ArrayList<SinhVien> ds)
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
            case 0: return ds.get(rowIndex).getMa_sv();
            case 1: return ds.get(rowIndex).getHo_ten();
            case 2: return ds.get(rowIndex).getSo_dt();
            case 3: return ds.get(rowIndex).getEmail();
            case 4: return ds.get(rowIndex).getDia_chi();
            case 5: return ds.get(rowIndex).getSo_thich();  
            case 6: return ds.get(rowIndex).getDan_toc();   
            case 7: return ds.get(rowIndex).getTon_giao(); 
            case 8: return ds.get(rowIndex).getGioi_tinh(); 
            case 9: return ds.get(rowIndex).getMa_nguoi_dung();
            case 10: return ds.get(rowIndex).getLoai_taikhoan(); 
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
