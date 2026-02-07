class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        int n=arr.length;
        List<Integer>result=new ArrayList<>();
        int[]freq=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>=1&&arr[i]<=n){
                freq[arr[i]-1]++;
            }
        }
        for(int i=0;i<n;i++){
            result.add(freq[i]);
        }
        return result;
    }
}
