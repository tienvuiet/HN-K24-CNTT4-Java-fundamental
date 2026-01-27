package session03.kha2;

import java.util.Scanner;

public class kha2 {
    public static int searchBook (String[] arr, String search){
       for(int i = 0; i< arr.length; i++){
           if(arr[i].equals(search)){
               return i;
           };
       }
          return -1;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap vao so luong phan tu mang: ");
        int n = sc.nextInt();
        String[] books = new String[n];
        sc.nextLine();
        for(int i = 0; i< n ; i++){
            System.out.printf("book[%d]: ", i);
            books[i] = sc.nextLine();
        }

        System.out.printf("Nhap vao ten sach can tim: ");
        String bookNameSearch = sc.nextLine();

        if( searchBook(books, bookNameSearch) != -1){
            System.out.printf("Tim thay sach '%s' tai vi tri so: %d\n", books[searchBook(books, bookNameSearch)], searchBook(books, bookNameSearch) );
        }else{
            System.out.printf("Sach khong ton tai trong thu vien\n");
        }
    }
}
