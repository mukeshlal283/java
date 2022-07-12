import java.util.*;

public class gaadi {
    public static void main(String[] args) {
        
        for(int i=1; i<=5; i++){    //did not change here as before revpyramid
            for(int j=1; j<=5-i+1; j++){    //we change here 
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}