// Last updated: 7/9/2026, 9:48:29 AM
class Solution {
    public int findKthPositive(int[] arr, int k) {
int l=0,r=arr.length-1;
while(l<=r){
    int mid=(l+r)/2;
    int misss=arr[mid]-(mid+1);
    if(misss<k){
        l=mid+1;
    }else{
        r=mid-1;
    }
}
return l+k;
    }
}