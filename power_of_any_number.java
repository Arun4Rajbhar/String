import java.util.Scanner;
public class power_of_any_number {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.println("enter the base first");
        int base=d.nextInt();
        int result=1;
        System.out.println("enter the power of number");
        int power=d.nextInt();
        for(int i=0;i<power;i++){
            result=result*base;

        }
        System.out.println(base+" to the power "+power+" is "+result);
    }
}
