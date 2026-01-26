package session01.bai2;

import java.util.Scanner;

public class kha2 {
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so ngay cham tre: ");
        int soNgayChamTre = sc.nextInt();
        System.out.printf("Nhap so luong sach muon: ");
        int soLuongSachMuon  = sc.nextInt();

        double tienPhatGoc = soNgayChamTre * soLuongSachMuon * 5000;
        System.out.printf("Tien phat goc: %.1f VND\n", tienPhatGoc);

        double tienPhatDieuChinh  = tienPhatGoc;
        if(soNgayChamTre > 7 & soLuongSachMuon >= 3){
            tienPhatDieuChinh += tienPhatGoc *0.03;
        }
        System.out.printf("Tien phat dieu chinh: %.1f VND\n", tienPhatDieuChinh);

        String status ;
        if(tienPhatDieuChinh > 50000){
            status = "true";
        }else{
            status = "false";
        }
        System.out.printf("Yeu cau khoa the: %s", status);
    }
}
