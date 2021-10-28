package Java.Arrays;

public class Secondlargest {
    public static void main(String[] args) {
        int[] arr={90,30,99,50};
        int max=0;
        //int max2=0;
        /*for(int c:arr){
            System.out.println(c);
        }*/ 
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                max=arr[i];
            }
            else{
                max=arr[i+1];
            }arr[i+1]=max;
        }
        System.out.println(max);
    }
    
}
