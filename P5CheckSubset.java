import java.util.HashMap;

public class P5CheckSubset {
    public static boolean isSubset(int arr1[], int arr2[]){
        if(arr2.length>arr1.length) return false;

        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<arr1.length; i++){
            // if not present in hashmap then simply put it into it
            if(hmap.containsKey(arr1[i])){
                int val = hmap.get(arr1[i]);
                hmap.put(arr1[i], val+1);
            } else {
                hmap.put(arr1[i], 1);
            }
        }
        // Now check for arr2
        for(int num: arr2){
            if(!hmap.containsKey(num)) return false;
            if(hmap.get(num)==0) return false;
            int countOff = hmap.get(num);
            hmap.put(num, countOff-1);
        }
        return true;
    }
    public static void main(String[] args) {
        int arr1[] = {22,12,1,3,22,4,1,1};
        int arr2[] = {1,1,1, 1,4};
        if(isSubset(arr1, arr2)) System.out.println("It is subset");
        else System.out.println("It is not a subset");

    }
}
