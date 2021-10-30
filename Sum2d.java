package Java.Arrays;

public class Sum2d {
    public static void main(String[] args) {
        int a=0;
        int[][] arr=new int[2][2];
        int[][] arr1=new int[2][2];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=3;
        arr[1][1]=4;
        arr1[0][0]=5;
        arr1[0][1]=6;
        arr1[1][0]=7;
        arr1[1][1]=8;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }System.out.println();
        }
        System.out.println();
        for(int i=0;i<arr1.length;i++){
            for (int j=0;j< arr1[i].length;j++){
                System.out.print(arr1[i][j]+"\t");
            }System.out.println();
        }
        System.out.println();
        if(arr.length==arr1.length){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    a=arr[i][j]+arr1[i][j];
                    System.out.println("The sum of two matrices is: "+a);
                }
            }
        }
    }
}
