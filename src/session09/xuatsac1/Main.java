package session09.xuatsac1;

public class Main {
    static void main(String[] args) {
        Employee[] employees = {
                new OfficeEmployee("OF01","Vu Viet Tien",60000,9),
                new ProductionEmployee("PR01","Nguyen Xuan Thanh Long", 3000,5),
                new ProductionEmployee("PR02","Pham Nhat Vuong",5000,3)

        };
        double tongLuong = 0;
        for (Employee e: employees){
             tongLuong += e.calculateSalary();
        }
        System.out.println("Tong tien luong cua nhan vien la: "+tongLuong);

    }
}
