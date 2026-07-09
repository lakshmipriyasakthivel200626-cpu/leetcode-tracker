// Last updated: 7/9/2026, 9:50:04 AM
class Solution {
    public int findComplement(int num) {
       int mask=1;
       while(mask<num){
        mask=(mask<<1)|1;
       } 
       return mask^num;
    }
}