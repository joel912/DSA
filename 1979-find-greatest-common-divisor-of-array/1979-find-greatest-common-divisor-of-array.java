class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int min = nums[0];
        while(min!=0){
            int c = max % min;
            max = min;
            min = c;
        }
        return max;
    }
}
