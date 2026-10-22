import java.util.Arrays;

public class leftRotateByk {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k=8;

        int newK = k%arr.length;

        System.out.println("value of new k "+newK+"and previous"+k);

        for(int i=1;i<=newK;i++){
            int temp = arr[0];
            for(int j=1;j<arr.length;j++){
                arr[j-1]=arr[j];
            }
            arr[arr.length-1] = temp;
        }

        System.out.println("left Rotate by K place"+Arrays.toString(arr));

    }
}
