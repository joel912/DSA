class Solution {
    public int missingInteger(int[] nums) {
      int sum =nums[0];
      HashSet<Integer> res =new HashSet();
      for(int n:nums){
        res.add(n);
      }
      
      for(int i =1;i<nums.length;i++){
        if(nums[i] == nums[i - 1] + 1){
            sum+=nums[i];
        }
        else{
            break;
        }
      }
    
      while(res.contains(sum)){
        sum=sum+1;
      }
      return sum;
    }
}