import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class frequencyOfEachCharectorMAP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String");
        String Str = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();

        // int[] arr = {56, 99, 12, 23, 56};

        // for(int num : arr) {
        //     System.out.println(num);
        // }

        for(int i=0;i<Str.length();i++){
            if(map.get(Str.charAt(i)) != null){
                map.put(Str.charAt(i), map.get(Str.charAt(i))+1);
                continue;
            }

            map.put(Str.charAt(i),1);
        }

        Set<Entry<Character, Integer>> entrySet = map.entrySet();

        for(Entry<Character, Integer> entry : entrySet) {
            entry.getKey();
            entry.getValue();
        }

        Set<Character> keySet = map.keySet();

        for(Character chars : keySet) {
            map.get(chars);
        }

        System.out.println("map"+map);

    }
}