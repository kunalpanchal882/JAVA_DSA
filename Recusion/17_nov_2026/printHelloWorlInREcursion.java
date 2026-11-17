public class printHelloWorlInREcursion {
    public static void main(String[] args) {
        System.out.println("hello world ");
        print(5);
        printNumber(5);
    }

    private  static  void  print(int n){
        if(n==0) return ;

        System.out.println("hello world");

        print(n-1);
    }

    private  static  void  printNumber(int n){
      if(n==0) return  ;
      printNumber(n-1);
        System.out.println(n);

    }
}
 