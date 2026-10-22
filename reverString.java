import java.util.Scanner;

public class reverString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre String");
        String Str = sc.nextLine();

        int sLength = Str.length();

        String newStr = "";

        for(int i=sLength-1 ; i>=0 ;i--){
            newStr = newStr + Str.charAt(i);
        }

        System.out.println("final rever string   ---->   " + newStr);

    }
}
