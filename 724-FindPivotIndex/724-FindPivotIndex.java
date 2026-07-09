// Last updated: 7/9/2026, 9:49:39 AM
class Solution {
    public int pivotIndex(int[] arr) {
        int n=arr.length;
        int ps[]=new int[n];
        int ss[]=new int[n];
    ps[0]=arr[0];
    for(int i=1;i<arr.length;i++){
        ps[i]=arr[i]+ps[i-1];
    }
    ss[n-1]=arr[n-1]; 
    for(int i=n-2;i>=0;i--){
        ss[i]=arr[i]+ss[i+1]; 
    }
    for(int i=0;i<n;i++){
        if(ps[i]==ss[i]){
            return i;
        }
    }
    return -1;
    }
    
    
}
