import java.util.Arrays;

public class moveNegitveLeft {
    public static void main(String[] args) {
        int[] arr = {1,-2,-4,6,-7,9};

        int i=0;
        int j=0;
        while (j<arr.length) {
            if(arr[j]<0){
                int temp=arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }

        System.out.println("move negitive to left"+Arrays.toString(arr));

    }
}
