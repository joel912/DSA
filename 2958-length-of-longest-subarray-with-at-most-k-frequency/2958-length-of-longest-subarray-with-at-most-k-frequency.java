class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
     int start =0;
     int end =0;
     int max =0;

     HashMap<Integer,Integer> res = new HashMap<>();
     while(end<nums.length){
        res.put(nums[end], res.getOrDefault(nums[end],0)+1);
        while(res.get(nums[end])> k) {
            res.put(nums[start], res.get(nums[start]) -1);
            start++;
        }
        max = Math.max(max,end-start +1);
        end++;
     }
     return max;
}
}