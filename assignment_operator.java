import java.util.Scanner;
public class assignment_operator {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.println("enter any number ");
       double a=d.nextDouble();
        if(a==30){
            System.out.println("a is equal to 30");
        }
        else{
            System.out.println("a is not equal to 30");
        }
       System.out.println("a+=5:="+(a+=5));
        System.out.println("a-=5:="+(a-=5));
        System.out.println("a*=5:="+(a*=5));
        System.out.println("a/=5:="+(a/=5));
        System.out.println("a%=5:="+(a%=5));
        if(a==30){
            System.out.println("a is equal to 30");
        }
        else{
            System.out.println("a is not equal to 30");
        }


    }
}
