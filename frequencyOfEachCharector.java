import java.util.Scanner;

public class frequencyOfEachCharector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String for count the Ch: ");
        String str = sc.nextLine();

        sc.close();

        int[] arr = new int[57];

        for(int i=0;i<str.length();i++)
            arr[str.charAt(i) - 65]++;

        for(int i=0;i<arr.length;i++)
            if(arr[i] != 0) System.out.println("Frequency of "+ (char)(i + 65) + " is " + arr[i]);



    }
}
