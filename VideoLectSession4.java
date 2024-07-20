import java.util.HashMap;

public class VideoLectSession4 {
    //Brute Force Approach -> O(n^2)
    public static int absPair(int arr[],int k){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int absDiff = Math.abs(arr[i]-arr[j]);
                if(absDiff==k)
                    count++;
            }
        }
        return count;
    }

    // Optimized Approach -> O(n)
    public static int isPair(int arr[], int k){
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i]-k))
                count+= map.get(arr[i]-k);
            if(k!=0 && map.containsKey(arr[i]+k))
                count+= map.get(arr[i]+k);
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        return  count;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,2};
        System.out.println(absPair(arr,2));
        System.out.println(isPair(arr, 2));
    }
}
