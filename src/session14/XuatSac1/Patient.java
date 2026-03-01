package session14.XuatSac1;

public class Patient {
     String name;
     int severity ;
     int arrivalTime;

    public Patient(int severity, String name, int arrivalTime) {
        this.severity = severity;
        this.name = name;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return  name + " Muc "+severity + ", den luc " + arrivalTime;
    }
}
