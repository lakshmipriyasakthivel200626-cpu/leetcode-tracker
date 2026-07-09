// Last updated: 7/9/2026, 9:47:16 AM
import java.util.*;
class Solution{
public int[] concatWithReverse(int[] nums){
Stack<Integer> st=new Stack<>();
    for(int i=0;i<nums.length;i++){
     st.push(nums[i]);
     }
    int[] ans=new int[nums.length*2];
       for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
     }
        for(int i=nums.length;i<ans.length;i++){
         ans[i]=st.pop();
     }
return ans;
          }
}