// Last updated: 7/9/2026, 9:51:30 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
set.add(nums[i]);
        }
        int longest=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int cn=n;
                int c=1;
                while(set.contains(cn+1)){
                    cn++;
                    c++;
                }
                longest=Math.max(longest,c);
            }
        }
        return longest;
        
    }
}