package session15.Kha2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private  Queue<Patient> queue = new LinkedList<>();
    public void addPatient(Patient p ){
        queue.offer(p);
        System.out.println("Da them benh nhan:" + p.getName());
    }
    public Patient callNextPatient(){
        if(!queue.isEmpty()){
            Patient p = queue.poll();
            System.out.println(p);
            return p;
        }else{
            System.out.println("Khong co benh nhan nao cho kham");
            return null;
        }
    }
    public Patient peekNextPatient(){
        if(!queue.isEmpty()){
            Patient p = queue.peek();
            System.out.println(p);
            return p;
        }else{
            System.out.println("Khong co benh nhan nao cho kham tiep theo");
            return null;
        }
    }
    public void disPlayQueue(){
        for (Patient p: queue){
            System.out.println(p);
        }
    }
    static void main(String[] args) {
        PatientQueue patientQueue = new PatientQueue();
        patientQueue.addPatient(new Patient("1", "Tien", 20));
        patientQueue.addPatient(new Patient("2", "Thang", 20));
        patientQueue.addPatient(new Patient("3", "Huy", 20));
        patientQueue.addPatient(new Patient("4", "Duy", 20));

        System.out.println("Bac si goi kham");
        patientQueue.callNextPatient();
        System.out.println("Benh nhan tiep theo cho kham: ");
        patientQueue.peekNextPatient();
        System.out.println("Danh sach benh nhan: ");
        patientQueue.disPlayQueue();
    }
}
