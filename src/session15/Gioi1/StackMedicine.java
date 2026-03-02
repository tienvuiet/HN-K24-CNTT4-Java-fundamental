package session15.Gioi1;

import java.util.Stack;

public class StackMedicine {
    private Stack<Medicine> stack = new Stack<>();
    public void addMedicine(Medicine mc){
        stack.push(mc);
        System.out.println("Da them thuoc: "+ mc.getName());
    }
    public Medicine popMedicine(){
        if(stack.isEmpty()){
            System.out.println("Khong co thuoc nao trong kho");
            return null;
        }else{
            Medicine mc = stack.pop();
            System.out.println(mc);
            return mc;
        }
    }
    public void reset(){
        stack.clear();
    }
    public void disPlayMedicine(){
        for(Medicine mc : stack){
            System.out.println(mc);
        }
    }
    static void main(String[] args) {
       StackMedicine smc = new StackMedicine();
       smc.addMedicine(new Medicine("Tien", 1200));
       smc.addMedicine(new Medicine("Thang", 3000));
       smc.addMedicine(new Medicine("Hoa", 2000));
        System.out.println("Lay don thuoc: ");
        smc.popMedicine();
        System.out.println("Danh sach don thuoc ban dau: ");
        smc.disPlayMedicine();
        System.out.println("Danh sach don thuoc sau clear: ");
        smc.reset();
        smc.disPlayMedicine();
    }
}
