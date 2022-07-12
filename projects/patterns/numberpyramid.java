import java.util.*;

public class gaadi {
    public static void main(String[] args) {

        int n=5;

        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++){  //it work is to count i times means number of rows times
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
    
}