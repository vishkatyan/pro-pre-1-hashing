import java.util.HashMap;
public class P7KDistanceDuplicateElemApproach2 {
    public static boolean setExist(int arr[], HashMap<Integer, Integer> map, int k){
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i]) && i-map.get(arr[i]) <=k )
                    return true;
             else
                map.put(arr[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {1,2,3,1,4,2};
        if(setExist(arr, map, 5)) System.out.println("Exist");
        else System.out.println("Not exist");
    }
}
