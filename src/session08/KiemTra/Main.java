package session08.KiemTra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien theo hoc luc");
            System.out.println("4. Sap xep theo hoc luc giam dan");
            System.out.println("5. Thoat");
            System.out.print("Chon chuc nang: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    StudentManager.addNewStudent();
                    break;
                case 2:
                    StudentManager.displayListStudent();
                    break;
                case 3:
                    StudentManager.searchStudent();
                    break;
                case 4:
                    StudentManager.sortStudents();
                    break;
                case 5:
                    System.out.println("Da thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 5);
    }
}
