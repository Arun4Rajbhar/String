import java.util.Scanner;
public class bitwise_operator {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        int num1=d.nextInt();
        int num2=d.nextInt();
        System.out.println(num1&num2);
        System.out.println(num1|num2);
        System.out.println(num1^num2);
        System.out.println(~num2);
        System.out.println(~num1);

    }
}
