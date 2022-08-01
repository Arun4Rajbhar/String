package Strings;

public class startswith {
    public static void main(String[] args) {
        String s1="java is a goo language";
        String s2="java";
        String s3="language";

        boolean res1=s1.startsWith(s2);
        boolean res2=s2.startsWith(s3);
        System.out.println(res1);
        System.out.println(res2);
    }
}
