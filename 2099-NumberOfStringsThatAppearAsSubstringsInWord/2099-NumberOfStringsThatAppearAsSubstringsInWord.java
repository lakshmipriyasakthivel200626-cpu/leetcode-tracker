// Last updated: 7/9/2026, 9:48:06 AM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
    for(int i=0;i<patterns.length;i++){
        if(word.contains(patterns[i])){
            count++;
        }
    }     
    return count;
    }
}