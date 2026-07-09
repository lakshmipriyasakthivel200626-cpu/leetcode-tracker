// Last updated: 7/9/2026, 9:48:42 AM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res=new ArrayList<>();
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                res.add(true);
            }else{
            res.add(false);
            }
        }
        return res;
    }
}