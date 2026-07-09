// Last updated: 7/9/2026, 9:50:57 AM
class Solution {
    public int countPrimes(int n) {
    if(n<2) return 0;
     boolean[] isPrimes=new boolean[n];
    
     Arrays.fill(isPrimes,true);
     isPrimes[0]=false;
      isPrimes[1]=false;
     for(int i=2;i*i<n;i++){
        if(isPrimes[i])
        for(int j=i*i;j<n;j+=i){
            isPrimes[j]=false;
        }
     }
    
     int count=0;
     for(int i=2;i<n;i++){
     if(isPrimes[i]){
        count++;
     }
     }
     return count;
    }
}
