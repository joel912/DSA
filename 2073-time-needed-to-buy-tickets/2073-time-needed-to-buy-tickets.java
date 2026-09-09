class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> res = new LinkedList<>();
        for(int i = 0;i<tickets.length;i++){
            res.add(new int[]{i,tickets[i]});
        }
        int time = 0;
        while(!res.isEmpty()){
            int[] curr = res.poll();
            int index = curr[0];
            int ticketsleft = curr[1] -1;
            time++;
            if(index == k && ticketsleft == 0){
                return time;
            }
            if (ticketsleft > 0) {
                res.add(new int[]{index, ticketsleft}); 
            }
        }
        return time;
    }
}