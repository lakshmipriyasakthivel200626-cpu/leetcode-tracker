// Last updated: 7/9/2026, 9:50:40 AM
class Solution {
    public int addDigits(int n) {
     
     while(n>9){
int sum=0;

     
    while(n!=0){
        int rem=n%10;
        sum+=rem;
        n=n/10;

     }
     n=sum;   
    }
    return n;
    }
}