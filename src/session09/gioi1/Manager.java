package session09.gioi1;

public class Manager extends Employee {
    private String phongBan;

    public Manager(String ten, String luongCoBan, String phongBan) {
        super(ten, luongCoBan);
        this.phongBan = phongBan;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Phong ban: "+phongBan);
    }
}
