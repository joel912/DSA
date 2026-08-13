class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        int n = temperatures.length;
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i =0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int val = stack.pop();
                ans[val] = i - val; 
            }
            stack.push(i);
        }
        return ans;
    }
}