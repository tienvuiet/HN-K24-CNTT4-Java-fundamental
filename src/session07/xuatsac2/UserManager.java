package session07.xuatsac2;

import java.util.ArrayList;

public class UserManager {
    public  static User[] users = new User[10];
    public  static  int count  = 0;
    public  static  void addUser(User u){
        if(count< users.length){
            users[count] = u;
            count++;
        }else{
            System.out.println("Danh sach user da day");
        }
    }
    public static  boolean checkLogin(String username, String password){
        for(int i = 0; i< users.length; i++){
            if(users[i].username.equals(username) && users[i].password.equals(password)){
                return true;
            }
        }
        return false;
    }
}
