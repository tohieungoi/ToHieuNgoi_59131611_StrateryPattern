/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author tohie
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         var tinhToan = new  Context();
        
        tinhToan.setTinhToan(new Cong());
        System.out.println("75 + 12 =" +tinhToan.tinh(75,12));     
        
        tinhToan.setTinhToan(new Tru());
        System.out.println("54 - 78 =" +tinhToan.tinh(54, 78));
        
    }
    
}
