/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import static java.lang.CharSequence.compare;

/**
 *
 * @author tohie
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        int temp;
        temp= o1.getHoTen().compareTo(o2.getHoTen());
        if(temp>0) return 1;
        if(temp==0) return 0;
        else return -1;
        
    }
    
}
