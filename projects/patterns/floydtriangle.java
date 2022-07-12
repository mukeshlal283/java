import java.util.*;

public class gaadi {
    public static void main(String[] args) {

        int number = 1;
        
        for(int i=1; i<=5; i++){    
            for(int j=1; j<=i; j++){    //column should column = row
                System.out.print(number+" "); //should take variable to start from 1
                number++;
            }
            System.out.println();
        }
    }
    
}