package session02.xuatsac1;

import java.util.Scanner;

public class xuatsac1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("-- He thong danh gia doc gia --\n");
        System.out.printf("(Nhap so ngay tre. Nhap 999 de ket thuc)\n");
        int diemUyTin = 100;
        int truDiem = 0;
        int soNgayTre = 0;
        String docGia = "";
        while (soNgayTre != 999){
            System.out.printf("So ngay tre cua lan nay: ");
            soNgayTre = sc.nextInt();
            if (soNgayTre == 999) break;
            truDiem = soNgayTre *2;
            diemUyTin -=   soNgayTre*2;
            System.out.printf("-> Tra ve %d ngay: -%d diem.\n", soNgayTre, truDiem);
        }
        System.out.printf("Tong diem uy tin: %d\n", diemUyTin);
        if(diemUyTin > 120){
            docGia = "Doc gia than thiet";
        }else if(diemUyTin >= 80 && diemUyTin <= 120){
            docGia = "Doc gia tieu chuan";
        }else if(diemUyTin < 80){
            docGia = "Doc gia can luu y";
        }
        System.out.printf("Xep loai: %s",docGia);
    }
}
