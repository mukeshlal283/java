import java.util.*;

public class gaadi {
    public static void main(String[] args) {

        int n=4;

        for(int i=1; i<=n; i++){
            //first part = half pyramid            
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int space = 2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            //second part = half pyramid
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //now reverse it

        for(int i=n; i>=1; i--){
            //first part = half pyramid            
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int space = 2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            //second part = half pyramid
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}