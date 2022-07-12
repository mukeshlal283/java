import java.util.*;

public class gaadi {
    public static void main(String[] args) {
        int a = 18; //row
        //int b = 10; //column
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}