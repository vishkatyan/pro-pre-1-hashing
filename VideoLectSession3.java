import java.util.HashMap;
public class VideoLectSession3 {
    // Brute Force -> O(n^2)
    public static int pairExist(int arr[], int k){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]-arr[j]==k)
                    count++;
            }
        }
        return count;
    }
    //Optimized -> O(n)
    public static int pairs(int arr[], int k){
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int complementary = arr[i]+k;
                    if(map.containsKey(complementary))
                        count+= map.get(complementary);
                    map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 4, 1};
        System.out.println(pairExist(arr, 3));
        System.out.println(pairs(arr, 2));
    }
}
