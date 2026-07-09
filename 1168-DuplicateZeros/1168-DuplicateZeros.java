// Last updated: 7/9/2026, 9:49:06 AM
class Solution {
    public void duplicateZeros(int[] arr) {
     int l=0;
     int r=arr.length-1;
     while(l<r){
        if(arr[l]==0){
            for(int j=arr.length-1;j>=l+2;j--){
                arr[j]=arr[j-1];
            }arr[l+1]=0;
            l+=2;}
            else{
                l+=1;
            }
        
        
     }   
    }
}