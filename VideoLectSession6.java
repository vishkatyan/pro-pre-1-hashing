public class VideoLectSession6 {
    // Brute Force Approach
    public static int subArrayPairs(int arr[], int k){
        int count = 0;
        for(int i =0; i<arr.length;i++){
            int total = 0;
            for(int j=i; j<arr.length; j++){
                total = total+arr[j];
                if(total==k)
                    count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {3, -1, 2, -2, 4, 3};
        System.out.println(subArrayPairs(arr, 4));
    }
}
