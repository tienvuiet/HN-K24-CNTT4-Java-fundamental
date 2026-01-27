package session03.kha1;


import java.util.Scanner;

public class kha1 {

    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] books = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ma sach thu " + (i + 1) + ": ");
            books[i] = sc.nextInt();
        }
        return books;
    }
    public static void displayLibraries(int[] arr) {
        System.out.print("Danh sach ma sach: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach: ");
        int n = sc.nextInt();
        int[] libraries = addBookToLibraries(n);
        displayLibraries(libraries);
    }
}
