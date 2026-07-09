// Last updated: 7/9/2026, 9:48:51 AM
class Solution {
    public int maximum69Number (int num) {
    int tempn=num;
    int index=0;
    int postindex=-1;
    while(tempn!=0){
        int temp=tempn%10;
        if(temp==6){
         postindex=index;
        }
        index++;
        tempn/=10;
    }    
    if(postindex==-1){
        return num;
    }
    return num+(3*(int)Math.pow(10,postindex));
    }
}