/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.Date;

/**
 *
 * @author tohie
 */
public class SinhVien {
    private  String hoTen;
    private Date ngaySinh;
    private float diemTB;
    public SinhVien(String hoTen,Date ngaySinh,float diemTB)
    {
        this.hoTen=hoTen;
        this.ngaySinh=ngaySinh;
        this.diemTB=diemTB;
        
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

   
    
}
