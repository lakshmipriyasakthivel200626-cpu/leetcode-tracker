// Last updated: 7/9/2026, 9:48:04 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
    int X=0;
    for(int i=0;i<operations.length;i++){
        if(operations[i].contains("++")){
            X++;
        }else{
            X--;
        }
    } 
    return X;   
    }
}