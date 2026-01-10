class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int i = 0, j = arr.length-1;
        
        while(i<j) {
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        
            
            i++;
            j--;
        }
        
    }
}
