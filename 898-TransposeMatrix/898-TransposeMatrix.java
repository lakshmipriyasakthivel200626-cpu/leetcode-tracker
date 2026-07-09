// Last updated: 7/9/2026, 9:49:25 AM
class Solution {
    public int[][] transpose(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int [][]newmat =new int[n][m];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
         newmat[j][i]=mat[i][j]; 
        }

       } 
       return newmat;
    }
}