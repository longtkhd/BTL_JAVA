/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocPhan;

import AdminQLSV.*;
import MenuUser.SinhVien;
import ThoiKhoaBieu.*;
//import hocphan.*;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tunga
 */
public class HocPhanTable extends AbstractTableModel {
    
    private String name[]={"Mã Học Phần", "Tên Học Phần","Loại Học Phần","Số Tín Lí Thuyết", "Số Tín Thực Hành", "Tổng Tín Chi" };
    private Class classes[]={String.class, String.class, String.class, Integer.class, Integer.class, Integer.class};
    
    ArrayList<HocPhan> ds=new ArrayList<HocPhan>();

    public HocPhanTable(ArrayList<HocPhan> ds)
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
            case 0: return ds.get(rowIndex).getMaHp();
            case 1: return ds.get(rowIndex).getTenHp();
            case 2: return ds.get(rowIndex).getLoaiHp();
            case 3: return ds.get(rowIndex).getSoTCLT();
            case 4: return ds.get(rowIndex).getSoTCTH();
            case 5: return ds.get(rowIndex).getTongTC();   
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
