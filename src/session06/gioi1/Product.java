package session06.gioi1;

public class Product {
    private String maSp;
    private String tenSP;
    private double giaBan;

    public Product() {
    };

    public Product(String maSp, String tenSP, double giaBan) {
        this.maSp = maSp;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
    }

    public void setGiaBan(double giaBan) {
        if(giaBan< 0){
            System.out.printf("gia ban phai > 0");
        }else{
            this.giaBan = giaBan;
            System.out.printf("Da cap nhat gia ban thanh cong!");
        }

    }
}
