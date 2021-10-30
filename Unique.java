package Java.Arrays;

public class Unique {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40,50};
        int[] arr2={40,60,50,70,80};
        int arr=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    arr=(arr1[i]);
                    System.out.println(arr);
                }
            }
        }
    }
}
