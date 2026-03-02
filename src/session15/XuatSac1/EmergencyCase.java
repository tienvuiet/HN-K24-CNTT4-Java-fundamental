package session15.XuatSac1;

import session15.Kha2.Patient;

import java.util.Stack;

public class EmergencyCase {
    private Patient patient ;

    public Patient getPatient() {
        return patient;
    }
    public EmergencyCase(Patient patient) {
        this.patient = patient;

    }

    private Stack<TreatmentStep> steps = new Stack<>();
    public void addStep(TreatmentStep ec){
        steps.push(ec);
        System.out.println("Da them mo ta: " + ec.getDescription());
    };
    public  TreatmentStep undoStep(){
        if(!steps.isEmpty()){
            TreatmentStep undoStep = steps.pop();
            System.out.println("Da undo: "+ undoStep);
            return undoStep;
        }else{
            System.out.println("Khong co mo ta nao!");
            return null;
        }
    }
    public void displayStep(){
        for (TreatmentStep item : steps){
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return "EmergencyCase: "+ patient.getName();
    }
}
