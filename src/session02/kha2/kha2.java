package session02.kha2;

import java.util.Scanner;

public class kha2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ma khu vuc(A B C D): ");
        String code = sc.nextLine();
        String viTri = "";
        String loi = "";
        switch (code){
            case "A":
                viTri = "Tang 1: Sach van hoc";
            case "B":
                viTri = "Tang 2: Sach khoa hoc";
            case "C":
                viTri = "Tang 3: Sach ngoai ngu";
            case "D":
                viTri = "Tang4: Sach tin hoc";
            default:
                loi = "Ma khu vuc khong hop le";
        }
        if(viTri != ""){
            System.out.printf("Vi tri: %s", viTri);

        }else if(loi != ""){
            System.out.printf("Loi: %s", loi);
        }
    }
}
