
public class sumOfDigit {
    public static void main(String[] args) {
        int n=5897;
        int sum=0;

       int  value =  sumOfDigit(n,sum);

       System.out.println("sum of digit is --> "+value);

    }

    private static int sumOfDigit(int n, int sum) {
        if (n == 0) return sum;

        System.out.println("sum if vlaue --> "+sum);

        return sumOfDigit(n / 10, sum + n % 10);
    }
}
