// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ans = mid;        // possible ceil found
                high = mid - 1;   // try to find smaller index
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
