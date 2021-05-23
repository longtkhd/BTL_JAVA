/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThoiKhoaBieu;

//import hocphan.*;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tunga
 */
public class ThoiKhoaBieuTable extends AbstractTableModel {
    
    private String name[]={"Mã", "Học Phần","Loại","TCLT", "TCTH", "Tổng TC","Kỳ","Thứ","Tiết BD","Tiết KT"};
    private Class classes[]={String.class, String.class, String.class, Integer.class, Integer.class, Integer.class,Integer.class,String.class,Integer.class,Integer.class};
    
    ArrayList<ThoiKhoaBieu> ds=new ArrayList<ThoiKhoaBieu>();

    public ThoiKhoaBieuTable(ArrayList<ThoiKhoaBieu> ds)
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
            case 0: return ds.get(rowIndex).getMahp();
            case 1: return ds.get(rowIndex).getTenhp();
            case 2: return ds.get(rowIndex).getLoaihp();
            case 3: return ds.get(rowIndex).getTclt();
            case 4: return ds.get(rowIndex).getTcth();
            case 5: return ds.get(rowIndex).getTongtc();  
            case 6: return ds.get(rowIndex).getKy();   
            case 7: return ds.get(rowIndex).getThu(); 
            case 8: return ds.get(rowIndex).getTietbatdau(); 
            case 9: return ds.get(rowIndex).getTietketthuc(); 
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
