package Strings;
import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        String s1=" is a good city";
        System.out.println("enter a city name");
        String s=d.nextLine();
        String s2=s+s1;
        System.out.println(s2);

    }
}
