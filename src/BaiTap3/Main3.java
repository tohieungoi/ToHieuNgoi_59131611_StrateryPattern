/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author tohie
 */
public class Main3 {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        var fm = new SimpleDateFormat("dd/MM/yyyy");
        var DSSV = new QLSV();
        var sv1 = new SinhVien("Sinh Viên Thứ Nhất Tên A",fm.parse("21/02/1999"),9);
        var sv2 = new SinhVien("Sinh Viên Thứ Hai Tên B",fm.parse("05/05/1999"),10);
        var sv3 = new SinhVien("Sinh Viên Thứ Ba Tên C",fm.parse("23/07/1999"),8);

        DSSV.themSV(sv1);
        DSSV.themSV(sv2);
        DSSV.themSV(sv3);
    
        System.out.println("Sắp Xếp Theo Điểm : \n");
        DSSV.setSoSanhSV(new SoSanhTheoDiem());
        DSSV.sapXep();
        DSSV.inDS();
        System.out.println("Sắp Xếp Theo Tên : \n");
        DSSV.setSoSanhSV(new SoSanhTheoTen());
        DSSV.sapXep();
        DSSV.inDS();
        
        
    }
    
}
