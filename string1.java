package Strings;

public class string1 {
    public static void main(String[] args) {
        String s="This is nothing but your  fault now you have to clear it";
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='n'){
                count=count+1;
                System.out.println(count);
                System.out.println(i+"  "+s.charAt(i));
            }
        }
        System.out.println(count);
    }
}
