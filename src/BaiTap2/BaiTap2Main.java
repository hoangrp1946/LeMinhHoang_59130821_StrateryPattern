/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Pc
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HangHoa hangHoa1 = new HangHoa("Tivi", 18000000, "Samsung 50 inch");
        HangHoa hangHoa2 = new HangHoa("Laptop", 35000000, "Laptop DELL");
        
        GioHang gh1 = new GioHang();
        gh1.themHH(hangHoa1);
        gh1.themHH(hangHoa2);
        gh1.setHinhThucTT(new ThanhToanCOD());
        gh1.inDSHH();
        System.out.println("Tiền khách thanh toán trên COD: "+
                gh1.getThanhToan(gh1.getTienHang())+"\n");
        
        GioHang gh2 = new GioHang();
        gh2.themHH(hangHoa1);
        gh2.themHH(hangHoa2);
        gh2.setHinhThucTT(new ThanhToanOnline());
        gh2.inDSHH();
        System.out.println("Tiền khách thanh toán Online: "+
                gh2.getThanhToan(gh2.getTienHang())+"\n");
    }  
}
