// Last updated: 7/9/2026, 9:49:12 AM
class Solution {
    public int bitwiseComplement(int n) {
    int mask=1;
    while(mask<n){
        mask=(mask<<1)|1;
    }    
    return mask^n;
    }
}