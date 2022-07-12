import java.util.*;

public class gaadi{

    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        System.out.println("enter your age = ");
        int age = object.nextInt();
        
        if(age > 18){
            System.out.println("adult");
        }else{
            System.out.println("underage");
        }
    }
}