/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author tohie
 */
public class HangHoa {
    private String tenHH;
    private int gia;
    private String moTa;
    public HangHoa(String tenHH, int gia,String moTa)
    {
        this.tenHH=tenHH;
        this.gia=gia;
        this.moTa=moTa;
    }

    public String getTenHH() {
        return tenHH;
    }

    public int getGia() {
        return gia;
    }

    public String getMoTa() {
        return moTa;
    }


    
}
