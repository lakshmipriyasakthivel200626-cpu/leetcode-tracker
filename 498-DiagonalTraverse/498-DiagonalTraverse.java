// Last updated: 7/9/2026, 9:50:00 AM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int sum=0;
        int arr[]=new int[m*n];
        int size=0;
        while (sum <= (m + n - 2)) {
            if (sum % 2 == 0) { 
                int i = Math.min(sum, m - 1);
                while (i >= 0) {
                    int j = sum - i;
                    if (j >= 0 && j < n) {
                        arr[size++] = mat[i][j];
                    }
                    i--;
                }
            } else { 
                int i = 0;
                while (i < m) {
                    int j = sum - i;
                    if (j >= 0 && j < n) {
                        arr[size++] = mat[i][j];
                    }
                    i++;
                }
            }
            sum++;
        }
        return arr;
    }
}