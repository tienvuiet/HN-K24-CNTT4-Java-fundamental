package session09.xuatsac1;

public abstract class Employee {
    private String employeeId;
    private String employeeName;

    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
    public  abstract  double calculateSalary();

}
