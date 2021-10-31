package Java.Arrays;

public class sumr {
    public static void main(String[] args) {
        int sumr=0;
        float avg=0;
        int[][] arr=new int[4][4];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[0][3]=9;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[1][3]=9;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;
        arr[2][3]=9;
        arr[3][0]=11;
        arr[3][1]=31;
        arr[3][2]=32;
        arr[3][3]=9;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }System.out.println();
        }
        for(int i=0;i<arr.length;i++){
            sumr=0;
            avg=0;
            for (int j=0;j<arr[i].length;j++){
                sumr=sumr+arr[i][j];
                float a=arr.length ;
                avg= (sumr/(a));
            }
            System.out.println("The sum of "+i+" row is: "+sumr);
            System.out.println("The average of "+i+" row is: "+avg);
        }
    }
    
}
