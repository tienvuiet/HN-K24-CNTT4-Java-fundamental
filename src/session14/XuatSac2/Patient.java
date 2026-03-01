package session14.XuatSac2;

public class Patient {
    String name;
    int age;
    String tenKhoa;

    public Patient(String name, int age, String tenKhoa) {
        this.name = name;
        this.age = age;
        this.tenKhoa = tenKhoa;
    }

    @Override
    public String toString() {
        return name + " tuoi: "+ age +" ten khoa: "+ tenKhoa;
    }
}
