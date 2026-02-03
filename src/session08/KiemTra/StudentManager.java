package session08.KiemTra;

import java.util.Scanner;

public class StudentManager {
    public static Student[] students = new Student[100];
    public static int count = 0;

    public static void addNewStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (count + 1));
            String id;
            do {
                System.out.print("Ma SV (SVxxx): ");
                id = sc.nextLine();
            } while (!id.matches("SV\\d{3}"));
            System.out.print("Ho ten: ");
            String name = sc.nextLine();
            System.out.print("Diem TB: ");
            double score = sc.nextDouble();
            sc.nextLine();
            students[count++] = new Student(id, name, score);
        }
        System.out.println("Them thanh cong!");
    }

    public static void displayListStudent() {
        if (count == 0) {
            System.out.println("Danh sach rong!");
            return;
        }
        System.out.println("| Ma SV      | Ho ten              | Diem  | Hoc luc      |");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }

    public static void searchStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap hoc luc can tim: ");
        String rank = sc.nextLine();
        boolean found = false;
        System.out.println("| Ma SV      | Ho ten              | Diem  | Hoc luc      |");
        for (int i = 0; i < count; i++) {
            if (students[i].getRank().equalsIgnoreCase(rank)) {
                System.out.println(students[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien phu hop!");
        }
    }

    public static void sortStudents() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (students[j].getScore() < students[j + 1].getScore()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("Sap xep thanh cong!");
    }
}
