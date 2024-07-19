import java.util.HashMap;
import java.util.Map;

public class P6MinOperationsApproach2 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int arr[] = {1,2,1,1,2,2,2,2,4,5,6,7};
        for(int i:arr){
            if(hmap.containsKey(i)){
                int val = hmap.get(i);
                hmap.put(i, val+1);
            }
            else {
                hmap.put(i, 1);
            }
        }
        int maxFreq = 0;
        for(Map.Entry<Integer, Integer> entry :hmap.entrySet()){
            int freq = entry.getValue();
            if(freq>maxFreq)
                maxFreq = freq;
        }
        System.out.println("Min operations required: "+ (arr.length-maxFreq));
    }

}
