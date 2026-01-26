package session02.kha1;

import java.util.Scanner;

public class kha1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap tuoi cua ban: ");
        int tuoi = sc.nextInt();
        System.out.printf("Nhap so sach ban dang muon: ");
        int soSach = sc.nextInt();
        String lyDo = "";
        String ketQua = "";
        if (tuoi >= 18 && soSach <3){
              ketQua = "Ban du dieu kien muon sach quy hiem";
        }else if(tuoi < 18){
               ketQua = "Khong du dieu kien";
               lyDo = "Ban phai du 18 tuoi tro len";
        }else if(soSach >= 3){
            ketQua = "Khong du dieu kien";
            lyDo = "Ban da muon toi da 3 cuon";
        }


        System.out.printf("Ket qua: %s\n", ketQua);
        if(lyDo != ""){
            System.out.printf("-Ly do: %s\n", lyDo);;
        }
    }
}
