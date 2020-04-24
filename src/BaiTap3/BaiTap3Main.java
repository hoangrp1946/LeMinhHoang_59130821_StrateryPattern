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
 * @author Pc
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {    
        SimpleDateFormat ns = new SimpleDateFormat("dd-MM-yy");
        SinhVien sv1 = new SinhVien("Nguyễn Tấn Đức", ns.parse("12-05-99"), 5.5f);
        SinhVien sv2 = new SinhVien("Ngô Quốc Hùng", ns.parse("09-02-99"), 8.6f);
        SinhVien sv3 = new SinhVien("Lê Thanh Minh", ns.parse("26-10-99"), 7.6f);
        SinhVien sv4 = new SinhVien("Lê Kiều My", ns.parse("20-06-99"), 6.5f);       
        QLSV DSSV = new QLSV();
        DSSV.themSV(sv1);
        DSSV.themSV(sv2);
        DSSV.themSV(sv3);
        DSSV.themSV(sv4);
        
        DSSV.setSoSanh(new SoSanhTheoTen());
        DSSV.sapXep();
        System.out.println("Sắp xếp danh sách sinh viên theo tên: "+"\n");
        DSSV.inDS();       
        DSSV.setSoSanh(new SoSanhTheoDiem());
        DSSV.sapXep();
        System.out.println("Sắp xếp danh sách sinh viên theo điểm: "+"\n");
        DSSV.inDS();
    }   
}
