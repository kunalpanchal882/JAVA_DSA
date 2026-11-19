
public class fabonaci {
    public static void main(String[] args) {
        int sum =0;
        int first =0;
        int second = 1;

        System.out.println("value --> "+ first);
        System.out.println("value --> "+ second);

        int value = sum(8,first,second);
        System.out.println("value --> "+value);
    }

    private static  int sum(int n,int first,int second){
        int third = first + second;
        System.out.println("value -->"+ third);
        if(n==0) return third; 
       return sum(n-1,second,third);
    }


}
