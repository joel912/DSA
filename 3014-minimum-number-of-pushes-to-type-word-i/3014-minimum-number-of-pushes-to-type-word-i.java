class Solution {
    public int minimumPushes(String word) {
        int total = 0;
        for(int i =0;i<word.length();i++){
            int val = (i/8) +1;
            total += val; 
        }
        return total;
    }
}