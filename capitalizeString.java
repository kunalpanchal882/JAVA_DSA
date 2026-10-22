import java.util.Scanner;

public class capitalizeString {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);

        System.out.println("Enter your String for toggle ");
        String str = sc.nextLine();

        String ans = "";

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if((ch >= 'a') && (ch <= 'z')){
                ans = ans + (char)(ch-32);
            }else if((ch >= 'A') && (ch <= 'Z')){
                ans = ans + (char)(ch+32);
            }

        }

        System.out.println("String after the toggle  = " + str + " --->   "+ans);

    }
}
