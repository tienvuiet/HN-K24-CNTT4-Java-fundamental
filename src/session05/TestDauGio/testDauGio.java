package session05.TestDauGio;

import java.util.Scanner;

public class testDauGio {
    static boolean isValidMSSV(String mssv) {
        return mssv.matches("^B\\d{7}$");
    }
    static int addStudent(String s, String[] arr, int count){
        if(isValidMSSV(s)){
            arr[count] = s;
            count++;
            System.out.println("Them thanh cong");
        } else {
            System.out.println("Sai dinh dang yeu cau nhap lai!");
        }
        return count;
    }


    static void capNhat(String[] maSV, int count, Scanner sc) {
        System.out.print("Nhap vi tri can sua (index): ");
        int index = sc.nextInt();
        if (index < 0 || index >= count) {
            System.out.println("Index khong hop le!");
            return;
        }
        sc.nextLine();
        String mssv;
        do {
            System.out.print("Nhap MSSV moi: ");
            mssv = sc.nextLine();
        } while (!isValidMSSV(mssv));
        maSV[index] = mssv;
        System.out.println("Cap nhat thanh cong!");
    }
    static int xoa(String[] maSV, int count, Scanner sc) {

        System.out.print("Nhap MSSV can xoa: ");
        String mssv = sc.nextLine();
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (maSV[i].equals(mssv)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Khong tim thay MSSV!");
            return count;
        }
        for (int i = index; i < count - 1; i++) {
            maSV[i] = maSV[i + 1];
        }
        maSV[count - 1] = null;
        count--;
        System.out.println("Xoa thanh cong!");
        return count;
    }

    static void timKiem(String[] maSV, int count, Scanner sc) {
  ;
        System.out.print("Nhap chuoi can tim: ");
        String key = sc.nextLine().toLowerCase();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (maSV[i].toLowerCase().contains(key)) {
                System.out.println(maSV[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co MSSV phu hop!");
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] maSV = new String[100];
        int count = 6;
        maSV[0] = "B2101001";
        maSV[1] = "B2101002";
        maSV[2] = "B2101003";
        maSV[3] = "B2101004";
        maSV[4] = "B2101005";
        maSV[5] = "B2101006";

        int choice = -1;
        while (choice != 6){
            System.out.println("-----Menu-----");
            System.out.println("1.Hien thi (in ra danh sach MSSV hien co)");
            System.out.println("2.Them moi ");
            System.out.println("3.Cap nhat ");
            System.out.println("4.Xoa");
            System.out.println("5.Tim kiem");
            System.out.println("6.Thoat");
            System.out.printf("Lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Danh sach ma sinh vien hien co: ");
                    for(int i = 0 ; i< count; i++){
                        System.out.printf("SV(%d): %s\n",i, maSV[i]);
                    }
                    break;
                case 2:
                    System.out.println("Nhap ma so sinh vien: ");
                    String maSv = sc.nextLine();
                    count = addStudent(maSv, maSV, count);
                    break;

                case 3:
                    capNhat(maSV, count, sc);
                    break;
                case 4:
                    count = xoa(maSV, count, sc);
                    break;
                case 5:
                    timKiem(maSV, count, sc);
                    break;
                case 6:
                    System.out.println("Ban da thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }

    }
}
