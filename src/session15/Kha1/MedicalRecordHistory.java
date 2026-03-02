package session15.Kha1;

import java.util.Stack;

public class MedicalRecordHistory {
    private  Stack<EditAction> history = new Stack<>();
    public void addEdit(EditAction action){
        history.add(action);
        System.out.println("Da them yeu cau");
    }
    public  EditAction undoEdit(){
        if(!history.isEmpty()){
            EditAction remove = history.pop();
            System.out.println("Da hoan tac :" + remove);
            return remove;
        }else{
            System.out.println("Khong co yeu cau chinh sua nao");
            return null;
        }
    }
    public EditAction getLatestEdit(){
        if(!history.isEmpty()){
            EditAction getLatest = history.peek();
            System.out.println("Yeu cau chinh sua: "+ getLatest);
            return getLatest;
        }else{
            System.out.println("Khong co yeu cau chinh sua nao");
            return null;
        }
    }
    public void displayHistory(){
        if(history.isEmpty()){
            System.out.println("Khong co yeu cau chinh sua nao");
        }else{
            for (EditAction ed: history){
                System.out.println(ed);
            }
        }
    }
    static void main(String[] args) {
        MedicalRecordHistory editHistory = new MedicalRecordHistory();
        editHistory.addEdit(new EditAction("Tien dep trai", "8:30"));
        editHistory.addEdit(new EditAction("nak mua lau", "8:30"));
        editHistory.addEdit(new EditAction("lau mua nak", "8:30"));
        editHistory.addEdit(new EditAction("Sacanana", "8:30"));
        System.out.println("Hoan tac");
        editHistory.undoEdit();
        System.out.println("Chinh sua gan nhat: ");
        editHistory.getLatestEdit();
        System.out.println("Toan bo chinh sua: ");
        editHistory.displayHistory();
    }
}
