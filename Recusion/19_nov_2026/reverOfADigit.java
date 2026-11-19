
public class reverOfADigit {
    public static void main(String[] args) {
        int n = 8753;
        int rev = 0;
        int value  = reverse(n, rev);

        System.out.println("revese a string --> "+value);
    }

    private  static  int reverse(int n,int rev){
        if(n==0) return rev;
        int digit = n%10;
        return reverse( n/10, rev *10 +digit);
    }
}
