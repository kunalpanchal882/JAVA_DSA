public class firstAndLastUpercase {
    public static void main(String[] args) {
        String str = "Sheryians";

        System.out.println("length of str  ----->  " + str.length() );


        char First = str.charAt(0);
        char Last = str.charAt(str.length()-1);
        String mid = str.substring(1, str.length()-1);

        if(First >= 'a' && First<='z'){
            First = (char)(First-32);
        }

        if(Last >= 'a' && Last<='z'){
            Last = (char)(Last-32);
        }

        String ans = First+mid+Last;

        System.out.println("Convert first  ----->  " + First );
        System.out.println("Convert Last ----->  " + Last );
        System.out.println("Convert mid ----->  " + mid );
        System.out.println("Convert first and LASt into uppercase ----->  " + ans );


    }
}
