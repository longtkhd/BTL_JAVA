/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiemThiUser;

import ThoiKhoaBieu.*;
//import hocphan.*;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tunga
 */
public class DiemThiTable extends AbstractTableModel {
    
    private String name[]={"Mã Học Phần", "Tên Học Phần","Loại Học Phần","Kỳ","Điểm"};
    private Class classes[]={String.class, String.class, String.class, Integer.class, Integer.class};
    
    ArrayList<DiemThi> ds=new ArrayList<DiemThi>();

    public DiemThiTable(ArrayList<DiemThi> ds)
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
            case 2: return ds.get(rowIndex).getLoaiKt();
            case 3: return ds.get(rowIndex).getKy();
            case 4: return ds.get(rowIndex).getDiem(); 
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
