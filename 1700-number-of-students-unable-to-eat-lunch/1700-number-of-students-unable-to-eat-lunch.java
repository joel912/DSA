class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        for(int a: students){
            queue.add(a);
        }
        int val =0;
        int j =0;
        while(!queue.isEmpty() && val< queue.size()){
            if(queue.peek() == sandwiches[j]){
                j++;
                queue.poll();
                val =0;
            }
            else{
                queue.add(queue.poll());
                val++;
            }
        }
        return queue.size();
    }
}