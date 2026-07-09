// Last updated: 7/9/2026, 9:47:25 AM
class Solution {
    public int maxFreqSum(String s) {
        int maxVowel = 0;
        int maxConso = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int count = 0;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == ch){
                    count++;
                }
            }
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                if(count > maxVowel){
                    maxVowel = count;
                }
            }
            else{
                if(count > maxConso){
                    maxConso = count;
                }
            }
        }

        return maxVowel + maxConso;
    }
}
