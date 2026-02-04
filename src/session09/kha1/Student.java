package session09.kha1;

public class Student extends  Person{
    private String maSV;
    private double diemTrungBinh;

    public Student(String fullName, int age, double diemTrungBinh, String maSV) {
        super(fullName, age);
        this.maSV = maSV;
        this.diemTrungBinh = diemTrungBinh;

    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }



    @Override
    public void display() {
        System.out.println("Ma sv: "+maSV);
        super.display();
        System.out.println("Diem trung binh"+ diemTrungBinh);
    }
}
