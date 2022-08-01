package Strings;

public class equalsIgnorecase {
    public static void main(String[] args) {
        String S1="JAVA";
        String s2="java";
        String s3="javed";
        boolean res=S1.equalsIgnoreCase(s2);
        boolean res1=s2.equalsIgnoreCase(s3);
        System.out.println(res);
        System.out.println(res1);
    }
}
