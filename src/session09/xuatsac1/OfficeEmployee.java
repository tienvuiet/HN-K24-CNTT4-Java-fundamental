package session09.xuatsac1;

public class OfficeEmployee extends Employee{
    private double salaryOffice;
    private int ngayCong ;


    public OfficeEmployee(String employeeId, String employeeName, double salaryOffice, int ngayCong) {
        super(employeeId, employeeName);
        this.salaryOffice = salaryOffice;
        this.ngayCong = ngayCong;
    }


    @Override
    public double calculateSalary() {
        return salaryOffice * ngayCong;
    }



}
