//Min and Max in Array

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList <Integer> arrLst = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        
        arrLst.add(min);
        arrLst.add(max);
        
        return arrLst;
    }
}
