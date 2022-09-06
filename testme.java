public class testme {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 10; 0<=i; i--) {

            for (int j = 10; i<=j ; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
