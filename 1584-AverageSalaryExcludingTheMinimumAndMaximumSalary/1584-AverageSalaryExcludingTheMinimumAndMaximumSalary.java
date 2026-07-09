// Last updated: 7/9/2026, 9:48:35 AM
class Solution {
    public double average(int[] salary) {
    int n=salary.length;
    int max=salary[0];
    int min=Integer.MAX_VALUE;
    int sum=0;
    for(int i=0;i<n;i++){
        if(salary[i]>max){
max=salary[i];
        }
        if(salary[i]<min){
            min=salary[i];
        }
        sum+=salary[i];
    }   
    return (double)(sum-max-min)/(n-2); 
    }
}