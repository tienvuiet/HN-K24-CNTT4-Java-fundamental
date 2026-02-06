package session10.Xuatsac1;

public class Main {
    static void main(String[] args) {
        OfficeStaff officeStaff = new OfficeStaff("Vu Viet Tien", 5000);
        Manager manager = new Manager("Tien", 6000);


        System.out.println("Luong nhan vien: "+   officeStaff.calculateSalary());
        System.out.println("Luong quan lys: "+    manager.calculateSalary());
    }
}
