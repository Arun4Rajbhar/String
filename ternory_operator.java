import java.util.Scanner;
public class ternory_operator {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        int n=d.nextInt();
        String s=(n%2==0)?"number is even":"number is odd";
        System.out.println(s);
    }
}
