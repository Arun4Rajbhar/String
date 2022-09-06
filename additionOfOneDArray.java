public class additionOfOneDArray {
    public static void main(String[] args) {
        int arr[][]=new int[2][2];
        int arr1[][]=new int[2][2];
        int result[][]=new int[2][2];
        arr[0][0]=78;
        arr[0][1]=65;
        arr[1][0]=48;
        arr[1][1]=84;

        arr1[0][0]=98;
        arr1[0][1]=35;
        arr1[1][0]=24;
        arr1[1][1]=485;

        add(arr,arr1,result);
        displayresult(result,arr,arr1);



    }
    static void add(int[][] arr,int[][] arr1,int[][] result){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                result[i][j]=arr[i][j]+arr1[i][j];

            }
        }
    }
    static void displayresult(int[][] result,int[][] arr,int[][] arr1){
        System.out.println("arr");

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");

            }

            System.out.println();
        }


        System.out.println("arr1");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(+arr1[i][j]+" ");

            }
            System.out.println();
        }


        System.out.println("result ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(+result[i][j]+" ");

            }
            System.out.println();
        }


    }
}
