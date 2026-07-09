// Last updated: 7/9/2026, 9:50:26 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs.add(nums1[i]);
        }
        HashSet<Integer> res=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
        if(hs.contains(nums2[i])){
             res.add(nums2[i]);
        }
        }
        int []ans=new int[res.size()];
        int ind=0;
        for(int x:res){
            ans[ind++]=x;
        }
        return ans;
        
    }
}