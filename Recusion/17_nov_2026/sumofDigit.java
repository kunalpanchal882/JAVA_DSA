
public class sumofDigit {
    public static void main(String[] args) {
        int n = 875;
        int sum =0;

        int value = somedigit(n,sum);
        System.out.println("value"+value);
    }

    private  static int  somedigit(int n, int sum ){
        if(n==0) return sum;
        
        
        int lastDigit = n % 10;
        n=n/10;

        System.out.println("% --->"+lastDigit);
        System.out.println("/ --->"+n);

        sum=  sum+lastDigit;

        System.out.println("sum -->"+sum);
        
        return somedigit(n,sum);
        // System.out.println("sum  after -->"+sum);
        // return sum;


    }
}
