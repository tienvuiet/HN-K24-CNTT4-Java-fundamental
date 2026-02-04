package session09.gioi1;

public class Employee {
    private String ten;
    private String luongCoBan;

    public Employee(String ten, String luongCoBan) {
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }
    public void display(){
        System.out.println("Ten: "+ ten);
        System.out.println("Luong co ban: "+luongCoBan);
    }
}
