// Last updated: 7/9/2026, 9:47:24 AM
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
    int n=nums.length;
    for(int i=0;i<n;i++){
        int count=0;
    for(int j=0;j<n;j++){
        if(nums[i]==nums[j]){
             count++;
        }
    }
    if(isPrime(count)){
        return true;
    }
    }
    return false;
    }
    private boolean isPrime(int x) {
    if (x<=1) {
        return false;}
        for (int i=2;i <= x/2;i++) {
             if (x%i==0){
                return false;
             }
        }
       return true;
    
}
}