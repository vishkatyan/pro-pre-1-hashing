import java.util.Scanner;

public class usingHashArrayLec2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Size of array till 50");
        int n = scr.nextInt();
        int arr[] = new int[n];
        int hash[] = new int[51]; // if I add constraints here
        for(int i=0; i<n; i++){
            arr[i] = scr.nextInt();
            hash[arr[i]] = hash[arr[i]]+1;  // simultaneously updating the hash array
        }
        System.out.println("size of query array");
        int q = scr.nextInt();
        for(int i=0; i<q;i++){
            System.out.println("Enter query");
            int query = scr.nextInt();
            int count = hash[query];
            System.out.println(count);
        }
    }
}
