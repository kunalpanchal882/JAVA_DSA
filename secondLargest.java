import java.util.Scanner;

public class secondLargest {
     public static void main(String[] args) {
        int arr[] = {10,9,32,7,87,2};
        int max = Math.max(arr[0],arr[1]);
        int secMax = Math.min(arr[0],arr[1]);

        for(int i=0;i<arr.length;i++){
            int value = arr[i];
            if(value > max){
                secMax=max;
                max=value;
            }else if(value>secMax && secMax!=max){
                secMax=value;
            }
        }

        System.out.println("the max element"+ max);
        System.out.println("the secondmax element"+ secMax);
       
    }
}
