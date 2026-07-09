// Last updated: 7/9/2026, 9:51:12 AM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        while(l<r){
            int sum=numbers[l]+numbers[r];
            if(sum==target){
                return new int[] {l+1,r+1};
            }else if(sum<target){
                l++;
            }else{
                r--;
            }
        }
        return new int[]{l,r};
    }
}