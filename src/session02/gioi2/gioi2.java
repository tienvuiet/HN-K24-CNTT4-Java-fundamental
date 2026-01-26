package session02.gioi2;

import java.util.Scanner;

public class gioi2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = 0;
        while (id <= 0){
            System.out.printf("Nhap ma id sach moi (id >0): ");
            id = sc.nextInt();
            if(id <= 0){
                System.out.printf("Loi: id phai la so duong. Moi nhap lai\n");
            }else{
                System.out.printf("Xac nhan: Ma sach %d da duoc ghi nhan", id);
                break;
            }
        }
    }
}
