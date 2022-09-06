import java.util.Scanner;
public class return_within_condition {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.println("enter a value which is greater than 5");
        int num=d.nextInt();
        if (num<5){
            return;
        }
    }
}
