// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        List<Integer> ans = new ArrayList<>();
        
        int i=0, j=0, k=0;
        
        while(i<arr1.size() && j<arr2.size() && k<arr3.size()) {
            int val1 = arr1.get(i);
            int val2 = arr2.get(j);
            int val3 = arr3.get(k);
            
            
            if(val1 == val2 && val2 == val3) {
                ans.add(val1);
                
                i++; j++; k++;
                
                while(i < arr1.size() && val1 == arr1.get(i)) i++;
                while(j < arr2.size() && val2 == arr2.get(j)) j++;
                while(k < arr3.size() && val3 == arr3.get(k)) k++;
            }
            
            else if(val1 < val2) {
                i++;
            }
            else if(val2 < val3) {
                j++;
            } 
            else{
                k++;
            }
        }
        
        if(ans.isEmpty()) {
            ans.add(-1);
        }
        
        return ans;
    }
}
