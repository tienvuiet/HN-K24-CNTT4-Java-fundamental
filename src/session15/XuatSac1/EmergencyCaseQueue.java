package session15.XuatSac1;

import session15.Kha2.Patient;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases = new LinkedList<>();
    public void addCase(EmergencyCase c){
        cases.offer(c);
        System.out.println("Them thanh cong: "+ c.toString());
    }
    public EmergencyCase getNextCase(){
        if(!cases.isEmpty()){
            EmergencyCase c = cases.poll();
            System.out.println(c);
            return c;
        }else{
            System.out.println("Khong co truong hop khan cap nao");
            return null;
        }
    }


    static void main(String[] args) {
        EmergencyCaseQueue queue = new EmergencyCaseQueue();
        queue.addCase(new EmergencyCase(new Patient("1","Tien",19)));
        queue.addCase(new EmergencyCase(new Patient("2","Vu",20)));

        EmergencyCase current = queue.getNextCase();
        if(current != null){
            current.addStep(new TreatmentStep("dau hong", "8.30"));
            current.addStep(new TreatmentStep("Viem mui di ung", "9:30"));
            current.displayStep();
            current.undoStep();
            System.out.println("Sau khi undo");
            current.displayStep();
        }


    }
}
