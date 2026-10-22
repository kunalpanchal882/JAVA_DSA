public class havPrefixString {
    public static void main(String[] args) {
        String[] arr = {"attention" ,"attend","at","and"};

        int count =0;

        for(int i=0;i<arr.length;i++){
            String word = arr[i];

            if(word.startsWith("at")){
                count = count + 1;
            }

        }

        System.out.println("Count of prefix of at in given array ----->   " + count);

    }
}
