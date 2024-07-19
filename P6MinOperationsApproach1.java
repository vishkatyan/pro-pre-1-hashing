public class P6MinOperationsApproach1 {
    public static void main(String[] args) {
        int arr[] = {22, 44, 21};
        int n=3;
        int maxFreq = 0;
        int currFreq;
        for(int i=0; i<n; ++i){
            currFreq=1;
            for(int j=0; j<n; ++j){
                if(i==j) continue;
                if(arr[i]==arr[j]) currFreq++;
            }
            if(currFreq>maxFreq)
                maxFreq = currFreq;
        }
        System.out.println("Min Operation Required " + (n-maxFreq));
    }
}
