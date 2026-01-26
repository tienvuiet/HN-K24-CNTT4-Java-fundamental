package session01.bai4;

import java.util.Scanner;

public class gioi2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap gia sach: ");
        double giaSach = sc.nextDouble();
        System.out.printf("Nhap ty gia: ");
        float tyGia = sc.nextFloat();
        double tongTien = giaSach * tyGia;
        // ep kieu so tien
        long tongTienVND = (long)tongTien;
        System.out.println("So tien VND: "+tongTienVND);
    }
}
