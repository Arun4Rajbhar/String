import java.util.Scanner;
public class oneDarrayUserInput_printingElentsInfrountOfIndexNo {
    public static void main(String[] args) {
        Scanner inte=new Scanner(System.in);
        System.out.println("enter the size of array");
        int x=inte.nextInt();
        int arr[]=new int[x];
        takeInput(x ,arr);
        printArray(x, arr);
    }
    static void takeInput(int x ,int[] arr){
       Scanner d=new Scanner(System.in);
        for(int i=0;i<x;i++){
            System.out.println("enter the element no "+(i+1));
            arr[i]=d.nextInt();
        }
    }
    static void printArray(int x,int[] arr){
        for(int i=0;i<x;i++){
            System.out.println("at index "+i+" "+arr[i]);
        }
    }
}
