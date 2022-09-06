import java.util.Scanner;
public class logical_operator {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
       int a=4,b=8;
        if((a<b)&&((a*2)==b)){
            System.out.println("((a<b)&&((a*2)==b))");

        }
        if((a<b)||(a>b)){
            System.out.println("(a<b)||(a>b)");
        }
        System.out.println("!(a<b)"+!(a<b));
        System.out.println("a="+a);


    }
}
