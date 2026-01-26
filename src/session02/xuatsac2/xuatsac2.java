package session02.xuatsac2;

import java.util.Scanner;

public class xuatsac2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soluot ;
        int tongSoLuot = 0;
        int soNgayMuon = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 2; i <= 8; i++){
            if(i == 8){
                System.out.printf("Nhap so luot muon ngay Chu Nhat: ", i);
            }else{
                System.out.printf("Nhap so luot muon ngay Thu %d: ", i);
            }
            soluot = sc.nextInt();
            if(soluot > max) {
                max = soluot;
            }
            if(soluot < min){
                min = soluot;
            }
            if(soluot == 0){
                continue;
            }
            tongSoLuot += soluot;
            soNgayMuon ++;
        };

        double avgLuotMuon = tongSoLuot/soNgayMuon;
        System.out.println("-- KET QUA THONG KE --");
        System.out.printf("Luot muon cao nhat: %d\n", max);
        System.out.printf("Luot muon thap nhat: %d\n", min);
        System.out.printf("Trung binh luot muon/ngay: %.1f\n", avgLuotMuon);

    }
}
