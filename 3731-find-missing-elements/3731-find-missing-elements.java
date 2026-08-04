class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> res = new ArrayList<>();
        int n = nums.length -1;
        int j =0;
        for(int i =nums[0];i<=nums[n];i++){
            if(i != nums[j] ){
                res.add(i);
            
            }
            else{
            j++;
            }
        }
        return res;
    }
}