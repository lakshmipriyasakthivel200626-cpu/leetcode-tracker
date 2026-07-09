// Last updated: 7/9/2026, 9:48:28 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int secsum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j)
                   sum+= mat[i][j];
                if(i+j==mat.length-1 && i!=j)
                secsum+=mat[i][j];
                    }
        }
        return  sum+secsum;
    }
}