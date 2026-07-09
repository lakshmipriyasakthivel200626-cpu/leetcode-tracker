// Last updated: 7/9/2026, 9:47:39 AM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
      int  maxd=0;
      int maxa=0;
      for(int i=0;i<dimensions.length;i++){
        int l=dimensions[i][0];
        int w=dimensions[i][1];
        int d=l*l+w*w;
        int a=l*w;
        if(d>maxd){
            maxd=d;
            maxa=a;
        }else if(d==maxd){
            maxa=Math.max(maxa,a);
        }
      }
      return maxa;
    }
}