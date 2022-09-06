import java.util.Scanner;
public class switch_statement {
    public static void main(String[] args) {


        Scanner c = new Scanner(System.in);
        System.out.println("enter day number");
        int day=c.nextInt();
        String d;

        switch (day) {
            case 1:
                d = "monday";
                break;
            case 2:
                d = "tuesday";
                break;
            case 3:
                d="wednesday";
                break;
            case 4:d="thursday";
            break;

            case 5:d="friday";
            break;

            case 6:d="saturday";
            break;

            case 7:d="sunday";
            break;

            default:d="invalid input";



        }
        if(day<=7) {
            System.out.println("this the day number which you were entered :" + day + "  day name is :" + d);
        }
        else{
            System.out.println("this the day number which you were entered :" + day + " this is a  :" + d);

        }
    }
}
