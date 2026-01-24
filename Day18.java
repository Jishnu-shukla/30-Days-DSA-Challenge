class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        
        if(start.length == 0) return 0;
        //Table => 2d array
        int activities [][] = new int[start.length][2];
        
        for(int i=0; i<start.length; i++) {
            // activities[i][0] = i;
            activities[i][0] = start[i];
            activities[i][1] = finish[i];
        }
        
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[1]));
        
        int maxAct = 1;
        int lastEnd = activities[0][1];
        
        for(int i=1; i<finish.length; i++) {
            if(activities[i][0] > lastEnd) {
                maxAct++;
                lastEnd = activities[i][1];
            }
        }
        
        return maxAct;
    }
}
