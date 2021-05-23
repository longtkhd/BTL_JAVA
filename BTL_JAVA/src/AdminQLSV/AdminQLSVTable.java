/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminQLSV;

import MenuUser.SinhVien;
import ThoiKhoaBieu.*;
//import hocphan.*;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tunga
 */
public class AdminQLSVTable extends AbstractTableModel {
    
    private String name[]={"Mã sinh viên", "Họ tên","Số điện thoại","Email", "Địa chỉ", "Sở thích","Dân tộc","Tôn giáo","Giới tính","Mã người dùng","Mã ngành" };
    private Class classes[]={String.class, String.class, String.class, String.class, String.class, String.class,String.class,String.class,String.class,String.class,String.class};
    
    ArrayList<AdminQLSV> ds=new ArrayList<AdminQLSV>();

    public AdminQLSVTable(ArrayList<AdminQLSV> ds)
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
            case 0: return ds.get(rowIndex).getMaSv();
            case 1: return ds.get(rowIndex).getHoten();
            case 2: return ds.get(rowIndex).getSoDt();
            case 3: return ds.get(rowIndex).getEmail();
            case 4: return ds.get(rowIndex).getDiachiSv();
            case 5: return ds.get(rowIndex).getSothich();  
            case 6: return ds.get(rowIndex).getDanToc();   
            case 7: return ds.get(rowIndex).getTonGiao(); 
            case 8: return ds.get(rowIndex).getGioiTinh(); 
            case 9: return ds.get(rowIndex).getMaNguoidung();
            case 10: return ds.get(rowIndex).getMaNganh(); 
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
