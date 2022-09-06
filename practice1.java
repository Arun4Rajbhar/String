import java.util.*;
import java.lang.Math;
public class practice1 {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        int n=d.nextInt();
        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println(sum);

    }

}
