// Last updated: 7/9/2026, 9:49:47 AM
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int candy : candyType){
            set.add(candy);
        }
        return Math.min(set.size(), candyType.length / 2);
    }
}