import java.util.Scanner;

public class palindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int i=0;
        int j=str.length()-1;

        boolean isPalandrom = true;

        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
               isPalandrom = false;
            }
            i++;
            j--;
        }

        if(isPalandrom){
            System.out.println("is palandrom");
        }else{
            System.out.println("is not palandrom");
        }


    }
}
