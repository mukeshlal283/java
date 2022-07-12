import java.util.*;
//project of find the sum of first n natural number
public class loop {
    public static void main(String[] args) {

        Scanner objct = new Scanner(System.in);
        System.out.println("enter number of columns : ");
        int a = objct.nextInt();
        System.out.println("enter number of rows : ");
        int b = objct.nextInt();
        for(int i=1; i<=b; i++){
            for(int j=1; j<=a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
