class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int max = 0;
        int min = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>nums[max]){
                max = i;
            }
            if(nums[i]<nums[min]){
                min = i;
            }
        }
        int front = Math.min(max,min);
        int back = Math.max(max,min);
        int case1 = back+1;
        int case2 = n-front;
        int case3 = (front+1) + (n-back);
        if(n!=1){
            return Math.min(case3,Math.min(case1,case2));
        }
        return 1;
    }
}