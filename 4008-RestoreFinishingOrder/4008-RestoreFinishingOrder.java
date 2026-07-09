// Last updated: 7/9/2026, 9:47:22 AM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int temp[]=new int[order.length];
        int k=0;
        for(int i=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(order[i]==friends[j]){
                    temp[k++]=order[i];
                }
            }
        }
        return Arrays.copyOf(temp,k);
    }
}