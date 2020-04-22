/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author tohie
 */
public class QLSV {
    ISoSanh<SinhVien> soSanhSV;
   ArrayList<SinhVien> dsSV=new ArrayList<>();
   public int themSV(SinhVien sv)
   {
       dsSV.add(sv);
       return 1;
              
   }

    public void setSoSanhSV(ISoSanh<SinhVien> soSanhSV) {
        this.soSanhSV = soSanhSV;
    }
   public void sapXep()
   {
       Collections.sort(dsSV,soSanhSV::soSanh);
   }
   public void inDS()
   {
       for(int i=0;i<dsSV.size();i++)
       { 
           System.out.println("Ho Ten SV: "+dsSV.get(i).getHoTen() +"\n"+
                              "Ngay Sinh: "+dsSV.get(i).getNgaySinh()+"\n"+
                               "Diem    : "+dsSV.get(i).getDiemTB() +""
                                       + "\n---------------------");
                    
       }
   }
}
