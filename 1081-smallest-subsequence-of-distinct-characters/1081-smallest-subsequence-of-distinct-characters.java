class Solution {
    public String smallestSubsequence(String s) {
     int arr[] = new int[26];
     for(int i =0;i<s.length();i++){
        char c = s.charAt(i);
        arr[c - 'a'] = i;
     }
     HashSet<Character> res = new HashSet<>();
     Stack<Integer> val = new Stack<>();
     
     for(int i =0;i< s.length();i++){
        char c = s.charAt(i);
        if(res.contains(c)){
            continue;
        }
        while(!val.isEmpty()){
            char prev = s.charAt(val.peek());
            if(prev > c && arr[prev-'a'] > i){
                val.pop();
                res.remove(prev);
            }
            else{
                break;
            }
        }
        val.push(i);
        res.add(c);
        
        
     }
      StringBuilder sb = new StringBuilder();
        while(!val.isEmpty()) {
            sb.append(s.charAt(val.pop()));
        }
        sb.reverse();
        return sb.toString();
    }
}