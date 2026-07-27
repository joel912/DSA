class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int val1 = nums[n-1] -1;
        int val2 = nums[n-2] -1;
        return val1*val2;
    }
}