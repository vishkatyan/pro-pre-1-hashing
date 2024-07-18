import java.util.HashMap;
import java.util.Scanner;

public class FinalSolutionLec3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter n value");
        int n= scr.nextInt();
        int arr[] = new int[n];
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<n; i++){
            arr[i] = scr.nextInt();
            int g = hmap.getOrDefault(arr[i], 0);
            hmap.put(arr[i], g+1);
        }
        int q = scr.nextInt();
        for(int i=0; i<q; i++){
            int query  = scr.nextInt();
            int count = hmap.getOrDefault(query, 0);
            System.out.println(count);
        }
    }
}
