// Last updated: 7/9/2026, 9:50:59 AM
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();       
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}