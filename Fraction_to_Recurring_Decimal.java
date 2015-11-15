import java.util.*;

public class Fraction_to_Recurring_Decimal {
    public static void main(String[] args) {
        String an = fractionToDecimal(1,-2147483648);
        System.out.println(an);
    }
    public static String fractionToDecimal(int numerator, int denominator) {
        LinkedHashSet<Point> ans = new LinkedHashSet<>();
        String output = "";
		long nu = numerator;
		long de = denominator;
        if(nu*de<0) {
            output = "-";
        }
        if(numerator < 0) nu = -nu;
        if(denominator < 0) de = -de;
        long vordot = nu/de;
        output = output + vordot;
        long left = nu - vordot*de;
        if(left == 0) return output;
        output += ".";
        long result=(left*10)/de;
        left = (left*10)%de;
        Point tmp = new Point(left,result);

        if(left == 0) {
            output = output + result;
            return output;
        }

        while(left != 0 && !ans.contains(tmp)) {
            ans.add(tmp);
            result = (left*10)/de;
            left = (left*10)%de;
            tmp = new Point(left,result);
        }


        if(left == 0) {
            ans.add(new Point(left,result));
            //System.out.printf(vordot + ".");
            for(Iterator<Point> k = ans.iterator(); k.hasNext();) {
                Point key = (Point)k.next();
                //System.out.printf(ans.get(key));
                output += key.y;
            }
        } else {
            Iterator<Point> k = ans.iterator();
            //System.out.printf(vordot + ".");

            while(k.hasNext()) {
                Point key = (Point)k.next();

                if(tmp.equals(key)) {
                    //System.out.printf("(" + left);
                    output = output + "(" + key.y;
                } else output = output + key.y;
                //System.out.printf(ans.get(key));
            }
            output += ")";
        }
        return output;

    }
}
class Point {
    public long x,y;
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(long a, long b) {
        this.x = a;
        this.y = b;
    }

    public String toString() {
        String s = "x = "+this.x+","+"y = "+this.y;
        return s;
    }
   

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (x ^ (x >>> 32));
		result = prime * result + (int) (y ^ (y >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}