public class P3CheckSubarrayApproach1 {
    public static void main(String[] args) {
        // Assume that every element is unique in both the array (No Duplicacy)
        int arr1[] = {1,2,3,4,5,6};
        boolean found = true;
        int arr2[]  = {2,3,5,6};
        for(int i=0; i<arr2.length; i++){
            found = false;
            for(int j=0; j<arr1.length; j++){
                if(arr2[i]==arr1[j]){
                    found = true;
                    break;
                }
            }
            if(!found) {found = false;}
        }
        System.out.println(found);
    }
}
