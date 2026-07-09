// Last updated: 7/9/2026, 9:50:11 AM
import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> s = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int num:nums) {
            if (s.contains(num)) {
                res.add(num); 
            } else {
                s.add(num);   
            }
        }

        return res;
    }
}