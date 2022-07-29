package Strings;
import java.util.Scanner;

public class UsingSplitFunction {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        String s1=" raja ram is national thief here in our country";
        System.out.println("Enter a String");
        String s=d.nextLine();
        meth(s1);



    }
    static void meth( String s1){
        String arr[]=s1.split(" ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" " +arr[i]);
        }
        int len=0;
        for(int i=0;i<arr.length;i++){

            len=len+ arr[i].length();
        }
        System.out.println();
        System.out.println(len);


    }
}
