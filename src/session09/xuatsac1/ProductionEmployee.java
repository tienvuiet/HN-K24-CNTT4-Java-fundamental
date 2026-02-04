package session09.xuatsac1;

public class ProductionEmployee extends Employee {
    private double  salaryProduct;
    private int ngayLuongProduct;

    public ProductionEmployee(String employeeId, String employeeName, double salaryProduct, int ngayLuongProduct) {
        super(employeeId, employeeName);
        this.salaryProduct = salaryProduct;
        this.ngayLuongProduct = ngayLuongProduct;
    }

    @Override
    public double calculateSalary() {
        return salaryProduct*ngayLuongProduct;
    }
}
