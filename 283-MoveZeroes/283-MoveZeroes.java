// Last updated: 7/9/2026, 9:50:36 AM
class Solution {
    public void moveZeroes(int[] arr) {
    int   n=arr.length;
    int newarr[]=new int[n];
    int cnt=0;
    for(int i=0;i<n;i++){
        if(arr[i]!=0){
            newarr[cnt++]=arr[i];
        }}
        for(int i=0;i<n;i++){
          arr[i]=newarr[i];
        }

    }
}
   