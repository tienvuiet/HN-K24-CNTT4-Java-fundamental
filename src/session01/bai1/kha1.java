package session01.bai1;

import java.util.Scanner;

public class kha1 {
    static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhập mã sach: ");
        String bookID = sc.nextLine();
        System.out.println("Nhap ten sach: ");
        String bookName = sc.nextLine();
        System.out.println("Nhap nam xuat ban: ");
        int publishYear = sc.nextInt();
        System.out.println("Nhap gia bia: ");
        double price = sc.nextDouble();
        System.out.println("Sach con trong kho (true/false): ");
        boolean isAvailable = sc.nextBoolean();
        int tuoiTho = 2026-publishYear;
        String status = isAvailable ? "Con sach": "Da muon";
        System.out.println("--Phieu thong tin sach--");
        System.out.println("Ten sach: "+ bookName.toUpperCase());
        System.out.println("Ma so: "+bookID + " | Tuoi tho: " + tuoiTho +" nam");
        System.out.printf("Gia ban: %.2f VND\n", price);
        System.out.println("Tinh trang: "+status);
    }
}
