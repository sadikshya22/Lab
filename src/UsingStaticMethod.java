
import java.util.*;

class StaticMember{
    static String CarNames;
    public void setInfo(String CarNames){
        this.CarNames=CarNames;
    }
    public static void showInfo(){
        System.out.println("car has been manufactured");
    }
}
public class UsingStaticMethod {
     public static void main(String[] args) {
       StaticMember c[]=new StaticMember [5];
        Scanner ob= new Scanner(System.in);
        System.out.println("enter 5 car names");
        for(int i=0;i<5;i++){
        c[i] = new StaticMember();
        System.out.println(c[i]+" ");
        SaticMember.showInfo();
           
    }
       
        
    }
}
