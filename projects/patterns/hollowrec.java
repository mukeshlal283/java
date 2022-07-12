import java.util.*;

public class gaadi {
    public static void main(String[] args) {
        int a = 18; //column
        int b = 9; //row
        for(int i=1; i<=b; i++){
            for(int j=1; j<=a;j++){
                if(j==1|| i==1||j==a||i==b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}