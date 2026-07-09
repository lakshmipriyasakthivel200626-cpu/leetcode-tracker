// Last updated: 7/9/2026, 9:50:42 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        if(s.length() !=  t.length()) return false;
         for(char c:s.toCharArray() ){
        map.put(c,map.getOrDefault(c,0)+1);
         }
         for(char c:t.toCharArray() ){
        map.put(c,map.getOrDefault(c,0)-1);
        if(map.get(c)<0) return false;
        
     }   
     return true;
    }
}