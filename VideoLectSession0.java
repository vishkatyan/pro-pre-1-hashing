import java.util.HashMap;

public class VideoLectSession0 {
    public static void MinMax(int arr[]){
        int maxFreq=Integer.MIN_VALUE, minFreq=Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                int val = map.get(arr[i]);
                map.put(arr[i], val+1);
            }
            else {
                map.put(arr[i], 1);
            }
            if(map.get(arr[i])>maxFreq)
                maxFreq = map.get(arr[i]);
            if(map.get(arr[i])<minFreq)
                minFreq = map.get(arr[i]);
        }
        System.out.println(maxFreq);
        System.out.println(minFreq);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,3,4,1,5};
        MinMax(arr);
    }
}
