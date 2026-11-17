import java.util.HashSet;



public class removeduplicate {
    public static void main(String[] args) {
        int[] arr = {10,2,3, 4,2,2,10,2,4};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                set.remove(arr[i]);
                break;
            }
            set.add(arr[i]);
        }

        System.out.println(set);
    }
}
