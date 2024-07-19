import java.util.HashSet;
public class P3CheckSubarrayApproach2 {
    public static void subarrayA2(HashSet<Integer> hset, int arr1[], int arr2[]){
        for(int i=0; i<arr1.length; i++){
            hset.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){

            if(!hset.contains(arr2[i])){
                System.out.println("Arr2 is not a subarray of Arr1");
                return;
            }
        }
        System.out.println("Arr2 is a subarray of Arr1");

    }
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();
        int arr1[] = {1, 2, 3, 4, 5, 6, 7};
        int arr2[] = {3, 5, 9};
        subarrayA2(hset, arr1, arr2);
    }
}
