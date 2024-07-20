import java.util.HashMap;

public class VideoLectSession2 {
    // Brute force approach
    public static int isPair(int arr[], int k){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==k)
                    count++;
            }
        }
        return count;
    }

    // Optimized approach using hashmaps
    public static int pairExist(int arr[], int k){
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int complementary = k-arr[i];
            if(map.containsKey(complementary))
                count++;
            map.put(arr[i], i);
        }
        return count;
    }
    public static void main(String[] args) {
        // Brute Force Approach
        int arr[] = {1,2,3,4,2};
//        System.out.println(isPair(arr, 1));
        System.out.println(pairExist(arr, 4));

    }
}
