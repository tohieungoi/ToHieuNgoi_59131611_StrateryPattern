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
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var GioHang1 = new GioHang();
        var hh1=new HangHoa("Kem Danh Rang",20000,"PS");
        var hh2=new HangHoa("Laptop lenovo",4000000,"Taiwan");
        GioHang1.themHH(hh1);
        GioHang1.themHH(hh2);
        GioHang1.setHinhThucTT(new ThanhToanCOD());
        GioHang1.thanhToan();
        GioHang1.inDS();
        //-----
        var GioHang2 = new GioHang();
        var hh3=new HangHoa("Man Hinh Asus",2000000,"China");
        var hh4=new HangHoa("Ban Phim Predator",4000000,"Taiwan");
        GioHang2.themHH(hh3);
        GioHang2.themHH(hh4);
        GioHang2.setHinhThucTT(new ThanhToanCOD());
        GioHang2.thanhToan();
        GioHang2.inDS();
    }
    
}
