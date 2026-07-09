// Last updated: 7/9/2026, 9:48:49 AM
class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] nums = new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        Arrays.sort(nums,(a,b)->{
            int countA=Integer.bitCount(a);
            int countB=Integer.bitCount(b);
            if(countA==countB){
                return a-b;
            }
            return countA-countB;
        });
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[i];
        }
        return arr;
    }
}