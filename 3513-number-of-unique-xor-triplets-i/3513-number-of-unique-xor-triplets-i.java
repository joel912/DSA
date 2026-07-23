class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max = nums[n-1];
        int min = nums[0];
        if(n>=3){
            return Integer.highestOneBit(n)*2;
        }
        return max-min+1;
        
    }
}