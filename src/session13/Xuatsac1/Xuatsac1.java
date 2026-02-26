package session13.Xuatsac1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Xuatsac1 {
    static List<Patient> listPatient = new ArrayList<>();
    public static void inputPatient(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID benh nhan: ");
        String id = sc.nextLine();
        System.out.println("Nhap ten banh nhan: ");
        String fullName = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap chuan doan: ");
        String disgnosis = sc.nextLine();

        Patient p = new Patient(id, fullName, age, disgnosis);
        listPatient.add(p);
        System.out.println("Them benh nhan thanh cong");
    }

    public static void setListPatient() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap id benh nhan muon chuan doan: ");
        String id = sc.nextLine();
        boolean flag = false ;
        for (Patient item : listPatient){
            if(item.id.equals(id) ){
                flag = true ;
                System.out.println("Nhap chuan doan moi: ");
                String newChuanDoan = sc.nextLine();
                item.setDisgnosis(newChuanDoan);
                break;
            }
        }
        if(!flag){
            System.out.println("Khong tim thay id banh nhan");
        }
    }

    public static void deletePatient(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id benh nhan muon xuat vien: ");
        String id = sc.nextLine();

        boolean removed = listPatient.removeIf(p -> p.id.equals(id));

        if(removed){
            System.out.println("Xuat vien thanh cong!");
        } else {
            System.out.println("Khong tim thay id benh nhan");
        }
    }
    public static void sortPatients() {
        listPatient.sort((p1, p2) -> {
            if (p2.age != p1.age) {
                return p2.age - p1.age;
            }
            return p1.fullName.compareToIgnoreCase(p2.fullName);
        });
        System.out.println("Da sap xep ");
    }
    public static  void disPlay(List<Patient> listPatient){
        for (Patient item: listPatient){
            System.out.println("Id: "+ item.id+ "| fullName: "+ item.fullName +"| Age: "+ item.age+ "| Diagnosis: "+ item.disgnosis);
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int choice ;
      do{
          System.out.println("MENU");
          System.out.println("1.Tiep nhan benh nhan");
          System.out.println("2.Cap nhat chuan doan");
          System.out.println("3.Xuat vien");
          System.out.println("4.Xap xep danh sach");
          System.out.println("5.Hien thi danh sach benh nhan");
          System.out.println("6.Thoat");
          System.out.println("Lua chon cua ban: ");
          choice = sc.nextInt();
          switch (choice){
              case 1:
                  inputPatient();
                  break;
              case 2:
                  setListPatient();
                  break;
              case 3:
                  deletePatient();
                  break;
              case 4:
                  sortPatients();
                  break;
              case 5:
                  disPlay(listPatient);
                  break;
              case 6:
                  System.out.println("Ban da thoat truong trinh");
                  break;
              default:
                  System.out.println("lua chon khong hop le");
          }
      }while (choice != 6);
    }
}
