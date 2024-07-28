public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr={1,1,2,2,2,1};
		HashMap<Integer,Integer> hm = new HashMap<>();
		int ans=0;
		for(int i =0;i<arr.length;i++){
		    if(hm.containsKey(arr[i])){
		        ans=Math.max(ans,i-hm.get(arr[i]));
		    }
		    else{
		        hm.put(arr[i],i);
		    }
		}
		System.out.print(ans);
	}
