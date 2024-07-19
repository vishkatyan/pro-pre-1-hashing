import java.util.BitSet;

public class P3CheckSubarrayApproach3 {
    public static boolean isSubarray(int[] arr1, int[] arr2){
        // Find max elem in array1 to set bitset size
        int maxEle = Integer.MIN_VALUE;
        for(int num: arr1){
            if (num>maxEle)
                maxEle = num;
        }

        // define a bitset
        BitSet bitset = new BitSet(maxEle+1);
        // add elem in bitset
        for(int num:arr1){
            bitset.set(num);
        }

        // check is elem in arr2 present ot not
        for(int num:arr2){
            if(num>maxEle || !bitset.get(num))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr1[]  = {2,4,5,7,9};
        int arr2[] = {2,7,3};
        if(isSubarray(arr1, arr2)) System.out.println("Subarray");
        else System.out.println("Not a Subarray");
    }
}
