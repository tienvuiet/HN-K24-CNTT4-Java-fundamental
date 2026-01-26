package session01.bai5;

import java.util.Scanner;

public class xuatxac1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap vao so nguyen 4 chu so: ");
        int number = sc.nextInt();
        int units = number % 10;
        int hundreds = (number / 10 ) %10;
        int dozens = (number /100) %10;
        int thousands = (number/1000) % 10;
        int sumoffirstThreeNumber = thousands + hundreds + dozens;
        System.out.printf("Chu so kiem tra ki vong: %d\n", units);

        if(sumoffirstThreeNumber % 10 == units){
            System.out.println("HOP LE");
        }else{
            System.out.println("Sai mai");
        }
    }
}
