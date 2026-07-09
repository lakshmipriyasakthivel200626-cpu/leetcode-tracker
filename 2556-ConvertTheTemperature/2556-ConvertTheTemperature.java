// Last updated: 7/9/2026, 9:47:55 AM
class Solution {
    public double[] convertTemperature(double celsius) {
    double kelvin;
    double fahren;
        kelvin=celsius+273.15;
        fahren=celsius*1.80+32.00;
    
    return new double[]{kelvin,fahren};
    }
}