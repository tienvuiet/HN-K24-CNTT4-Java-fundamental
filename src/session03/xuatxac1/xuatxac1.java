package session03.xuatxac1;

import java.util.Scanner;

public class xuatxac1 {

    public static int findBooks(int[] arr, int bookId){
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == bookId){
                return i;
            }
        }
        return -1;
    }

    public static void deleteBook(int[] arr, int bookId){
        int index = findBooks(arr, bookId);
        if(index == -1){
            System.out.printf("Khong tim thay sach ma %d", bookId);
        }
        for(int i = index; i< arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;

        System.out.printf("Da xoa sach ma %d\n", bookId);
    }

    public static void displayBook(int[] arr){
        System.out.printf("Kho sach hien tai (%d):", arr.length );
        for(int i = 0 ; i< arr.length; i++){
            if(arr[i]!= 0){
                System.out.printf("%d ", arr[i]);
            }

        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = {101,102,103,104,105};

        int bookId = -1 ;
        displayBook(books);
        while (bookId != 0){
            System.out.printf("\nNhap ma sach can xoa (0 de thoat):  ");
            bookId = sc.nextInt();
            if(bookId ==0){
                break;
            }
            deleteBook(books, bookId);
            displayBook(books);
        }
    }
}
