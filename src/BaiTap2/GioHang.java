/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author tohie
 */
public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dsHH = new ArrayList<>();
    //
    public int themHH(HangHoa hang)
    {
        dsHH.add(hang);
        return 1;
    }
    //
    public int tienHang()
    { 
        int tienHang=0;
        for(int i=0;i<dsHH.size();i++)
            tienHang+=dsHH.get(i).getGia();
        return tienHang;   
    }
    //

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    public double thanhToan()
    {
        return hinhThucTT.thanhToan( tienHang());
    }
    public void inDS(){
        for(int i = 0; i < dsHH.size(); i++){
    
  
            System.out.println( "Tên mặc hàng: "+dsHH.get(i).getTenHH()+"\n"+
                                "Mô tả: "+dsHH.get(i).getMoTa()+"\n"+
                                "Giá: "+dsHH.get(i).getGia()+"\n");
                                        }
            
            System.out.println("Tiền Hang       : "+tienHang() +"\n"+
                                "Số tiền phải trả: "+thanhToan()+
                                "\n -----------------------");
            
            }
}
