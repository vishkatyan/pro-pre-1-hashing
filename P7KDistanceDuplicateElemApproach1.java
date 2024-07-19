public class P7KDistanceDuplicateElemApproach1 {
    public static boolean isPair(int arr[], int k){
        int n = arr.length;
        for(int i=1; i<=n; i++){
            for(int j=i+1; j<=n&&j<=(i+k);j++){
                if(arr[i]==arr[j]);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 1, 2, 3};
        int k=2;
        if(isPair(arr,k)) System.out.println("Pair exist");
        else System.out.println("Doesn't exist");
    }
}
