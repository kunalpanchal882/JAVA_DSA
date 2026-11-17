import java.util.HashMap;

public class frequencyofChar {
    public static void main(String[] args) {
        int[] arr = {10,2,31,4,2,43,5,3,64,53,43};
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]+1));
            }else{
                map.put(arr[i],1);
            }
        }

        System.out.println("frequency"+map);
    }
}
