import java.util.*;
//project of find the sum of first n natural number
public class primno {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int val = obj.nextInt();
        int sum = 0;
        for(int i=1; i<=val; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
