class Solution {
    public boolean isPowerOfTwo(int n) {
        //n=8 => 1000 & 0111 = 0
        int ans = n & (n-1);

        if(ans == 0) return true;

        return false;
    }
}
