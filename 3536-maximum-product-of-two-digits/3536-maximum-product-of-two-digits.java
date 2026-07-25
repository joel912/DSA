class Solution {
    public int maxProduct(int n) {
        int ans = 0;
        int res =1;
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        int f =0;
        while(n!=0){
           int val = n%10;
           arr[f] = val;
           n = n/10;
           f++;
        }
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                ans = Math.max(ans,arr[i]*arr[j]);
            }
        }

        return ans;
    }
}