class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        Queue<Integer> q2 = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        int n = q.size();
        
        if(q.size() < k) {
            return q;
        }
        
        //Removing elements from original queue
        for(int i=0; i<k; i++) {
            s.push(q.peek());
            q.remove();
        }
        
        for(int i=k; i<n; i++) {
            q2.add(q.peek());
            q.remove();
        }
        
        //Inserting elements back to original queue
        for(int i=0; i<k; i++) {
            q.add(s.peek());
            s.pop();
        }
        
        for(int i=k; i<n; i++) {
            q.add(q2.peek());
            q2.remove();
        }
        
        return q;
    }
}
