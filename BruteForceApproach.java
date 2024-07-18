import java.util.Scanner;

public class BruteForceApproach {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = scr.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[n];
        for (int i=0; i<n;i++){
            arr[i] = scr.nextInt();
        }
        System.out.println("Enter the query size to search elements in the array: ");
        int q = scr.nextInt();
        for(int i=0; i<q;i++){
             int query = scr.nextInt();
            int count=0;
            for(int j=0; j<n; j++){
                if(arr[j]==query)
                    count++;
            }
            System.out.println(count);
        }

    }
}
