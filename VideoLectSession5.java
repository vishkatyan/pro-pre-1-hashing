public class VideoLectSession5 {
    // Brute Force Approach
    public static int isSum(int arr[], int l, int r){
        int sum = 0;
        for(int i=l; i<=r; i++){

            sum+=arr[i];
        }
        return sum;
    }
    // Optimized Code
    public static int[] prefixSum(int arr[]){
        int prefix[] = new int[arr.length+1];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }
    public static int optimizedSum(int prefix[], int l, int r){
        return (prefix[r]-prefix[l-1]);
    }

    public static void main(String[] args) {
        int arr[] ={2,3,4,1,2};
        System.out.println(isSum(arr, 2, 4));
        int [] prefix = prefixSum(arr);
        System.out.println(optimizedSum(prefix, 2, 4));
    }
}
