package session01.bai6;

import java.util.Scanner;

public class xuatxac2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so thu tu cua sach trong he thong: ");
        int stt = sc.nextInt();

        int keSach = (stt - 1) / 25 + 1;
        int viTri  = (stt - 1) % 25 + 1;
        String khu = "";
        if(keSach >= 1 && keSach <= 10){
            khu = "Khu Can";
        }else if(keSach > 10){
            khu = "Khu Vien";
        }
        System.out.println("-- THONG TIN DINH VI --");
        System.out.printf("Sach so: %d\n", stt);
        System.out.printf("Dia chi: Ke %d - Vi tri %d\n",  keSach, viTri);
        System.out.printf("Phan khu: %s\n", khu);

    }
}
