
import java.util.*;
public class TestTeacher {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
       Teacher t =new Teacher();
       t.getTeacherID();
       t.getFullName();
       t.getEmail();
       t.getSalary();
       
       t.setTeacherID(1);
       t.setFullName("ram");
       t.setEmail("ram@gmail.com");
       t.setSalary(12000.00);
       
        System.out.println("ID is"+t.getTeacherID());
        System.out.println("Name is"+t.getFullName());
        System.out.println("Email is"+t.getEmail());
        System.out.println("salarly is"+t.getSalary());
        
       
       
       
    }
}
