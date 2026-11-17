import java.util.HashSet;

public class temp {
    public static void main(String[] args) {
        isHappy(19);
    }
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(true){
            int sum =0;
            while(n>0){
                int digit = n%10;
                n = n/10;
                sum += digit * digit;
                if(sum == 1) return true;
                if(set.contains(sum))return false;
                set.add(sum);
                n=sum;
            }
        }
    }
}