// Last updated: 7/9/2026, 9:48:18 AM
class Solution {
    public int secondHighest(String s) {
        int max=-1;
        int min=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);          
            if(ch>='0' && ch<='9'){
                int num=ch-'0';
                if(num>max){
                    min=max;
                    max=num;
                }else if(num<max && num>min){
                    min=num;
                }
            }
        }
        return min;
    }
}