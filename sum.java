// Print message with values and sum

import java.util.Scanner;

import javax.swing.plaf.synth.SynthTextAreaUI;

// public class sum {
//     public static void main(String[] args) {

//         Scanner sc =new  Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         System.out.printf("sum of %d and %d is %d", a,b,a+b);
//     }
// }

// Accept name & age — formatted output

// public class sum {
//     public static void main(String[] args) {

//         Scanner sc =new  Scanner(System.in);

//         System.out.println("Enter your age");
//         int b = sc.nextInt();
        
//        sc.nextLine();

      
//         System.out.println("Enter your name");
//         String a = sc.nextLine();


//         System.out.printf("Hello " + a + ", you are " + b  + " years old. ");
//     }
// }

public class sum {
    public static void main(String[] args) {

        Scanner sc =new  Scanner(System.in);
        System.out.println("Enter the length of val");
        int a = sc.nextInt();
        int[] arr = new int[a];

        int sum=0;
        for(int i=0;i<a;i++){
            System.out.println("Enter your value");
            int value = sc.nextInt();
            arr[i]=value;
            sum+=value;

        }

        System.out.println("sum of value "+sum);
        System.out.println("arr "+arr);
       
    }
}

