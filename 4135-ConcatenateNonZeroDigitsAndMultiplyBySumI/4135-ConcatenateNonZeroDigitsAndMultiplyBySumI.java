// Last updated: 7/9/2026, 9:47:14 AM
class Solution {
    public long sumAndMultiply(int n) {
    int sum=0;
    long prod=0;
    while(n>0){
        int dig=n%10;
        if(dig!=0){
            sum+=dig;
            prod=prod*10+dig;
        }
            n/=10;
    } 
    long  res=0;
    while(prod>0){
        long di=prod%10;
        res=res*10+di;
        prod/=10;
    } 
    return sum*res;
    }
}