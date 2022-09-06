import java.util.Scanner;

public class arithmetic_operator {
    public static void main(String[] args) { 
        Scanner d = new Scanner(System.in);
        System.out.println("enter the first digit");
        int num1=d.nextInt();
        System.out.println("enter the second  digit");
        int num2=d.nextInt();
        System.out.println("addition of number is :="+(num1+num2));//+ operator
        System.out.println("subtraction  of number is :="+(num1-num2));//- operator
        System.out.println("division  of number is :="+(num1/num2));// / operator
        System.out.println("multiplication of number is :="+(num1*num2));// *operator
        System.out.println("modulas  of number is :="+(num1%num2));// %operator
    }
}
