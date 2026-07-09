// Last updated: 7/9/2026, 9:49:07 AM
class Solution {
    public int heightChecker(int[] heights) {
        int ex[]=heights.clone();
        Arrays.sort(ex);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=ex[i]){
                count++;
            }
        }
        return count;
    }
}