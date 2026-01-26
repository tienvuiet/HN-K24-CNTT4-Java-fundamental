package session02.gioi1;

import java.util.Scanner;

public class gioi1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sach tra muon: ");
        int soSach = sc.nextInt();
        double total = 0;
        int soNgayTre = 0;
        for(int i =1 ; i<= soSach; i++){
            System.out.printf("Nhap so ngay tre cua cuan thu %d: ",i);
            soNgayTre = sc.nextInt();
            total += soNgayTre * 5000;
        }
        System.out.printf("==> Tong tien phat: %.2f VND", total);
    }
}
