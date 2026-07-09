// Last updated: 7/9/2026, 9:47:53 AM
class Solution {
    public int pivotInteger(int n) {
        int ts=0;
        for(int i=1;i<=n;i++){
           ts+=i;
        }
        int ls=0;
        int rs=0;
        for(int i=1;i<=n;i++){
            ls+=i;
            rs=ts-ls+i;
            if(ls==rs){
                return i;
            }
        }
        return -1;
    }
}