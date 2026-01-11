class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        
        long MOD = 1000000007;
        long a = 0;
        long b = 0;
        
        while(first != null) {
            a = (a * 10 + first.data) % MOD;
            first = first.next;
        }
        
        while(second != null) {
            b = (b * 10 + second.data) % MOD;
            second = second.next;
        }
        
        
        return (a * b) % MOD;
    }
}
