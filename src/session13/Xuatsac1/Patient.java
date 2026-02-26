package session13.Xuatsac1;

public class Patient {
    protected   String id;
    protected String fullName;
    protected int age ;
    protected String disgnosis;

    public Patient(String id, String fullName, int age, String disgnosis) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.disgnosis = disgnosis;
    }

    public Patient() {
    }

    public void setDisgnosis(String disgnosis) {
        this.disgnosis = disgnosis;
    }
}
