// Last updated: 7/9/2026, 9:47:54 AM
class Solution {
    public int distinctAverages(int[] nums) {
      int n=nums.length;
      Arrays.sort(nums);
      int l=0;
      int r=n-1;
      HashSet<Integer> ans=new HashSet<>();
      while(l<r){
        int sum=nums[l]+nums[r];
        ans.add(sum);
        l++;
        r--;
      }  
      return ans.size();
    }
}