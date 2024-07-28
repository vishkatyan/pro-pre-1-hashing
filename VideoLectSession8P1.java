import java.util.*;
 
public class VideoLectSession8P1 {
 
    public static int countShortestSubarraysWithSumK(int[] nums, int k) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE, count = 0;
 
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += nums[end];
                if (sum == k) {
                    int length = end - start + 1;
                    if (length < minLength) {
                        minLength = length;
                        count = 1;
                    } else if (length == minLength) {
                        count++;
                    }
                }
            }
        }
 
        return count;
    }
 
    public static int countLargestSubarraysWithSumK(int[] nums, int k) {
        int n = nums.length;
        int maxLength = 0, count = 0;
 
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += nums[end];
                if (sum == k) {
                    int length = end - start + 1;
                    if (length > maxLength) {
                        maxLength = length;
                        count = 1;
                    } else if (length == maxLength) {
                        count++;
                    }
                }
            }
        }
 
        return count;
    }
 
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 5};
        int k = 5;
 
        System.out.println("Shortest subarrays with sum " + k + ": " + countShortestSubarraysWithSumK(nums, k));
        System.out.println("Largest subarrays with sum " + k + ": " + countLargestSubarraysWithSumK(nums, k));
    }
}
