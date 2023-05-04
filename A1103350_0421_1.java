import java.util.*;

public class A1103350_0421_1{
    public static void main(String[] argv) throws Exception{
        Scanner email = new Scanner(System.in);
        System.out.println("請輸入電子郵件:\n範例(a1103350@mail.nuk.edu.tw)");
        String check = "@mail.nuk.edu.tw";
        String user;
        user = email.next();
        if(user.matches("a[0-9]{7}"+check)) {
            System.out.println("輸入正確");
        }else{
            System.out.println("輸入錯誤");
        }


    }
}