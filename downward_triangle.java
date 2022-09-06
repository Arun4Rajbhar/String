import java.util.Scanner;
public class downward_triangle
{
    public static void main(String[] args)
    {
        Scanner d=new Scanner(System.in);
        System.out.println("enter the number of rows to be printed");
        int n=d.nextInt();
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);


    }
    static void pattern1(int n) //downward triangle using star
    {
      for(int row=0;row<n;row++){
          for(int col=0;col<n-row;col++){
              System.out.print("* ");
          }
          System.out.println();
      }
    }
    static void pattern2(int n){ //downward triangle using number
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){ //upward triangle using number
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
static void pattern4(int n) // two triangle half hollow diamond shape

{
    for(int row=0;row<n;row++){
        for(int col=0;col<n-row;col++){
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
            System.out.print("* ");
        }
        System.out.println();
    }

}
static void pattern5(int n){ // two triangle half solid diamond shape
    for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int row=0;row<(2*n);row++){

        if(row<=n){
            for(int col=0;col<row;col++){
                System.out.print("* ");
            }
        }
       else{
            for(int col=0;col<2*n-row;col++){
                System.out.print("* ");
            }
        }
        System.out.println();
    }

}

}
