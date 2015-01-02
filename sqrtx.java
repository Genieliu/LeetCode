public class Solution {
    public int sqrt(int x) {

        double ans = 0.5;
		double x0 = 0;
		double y0;
        while(abs(ans - x0) > 0.001) {
			x0 = ans;
			y0 = x0*x0 - x;
            ans = x0 - y0/(2*x0);
        }
        return (int) ans;
    }
}