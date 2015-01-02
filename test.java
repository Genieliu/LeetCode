import java.util.*;
import java.lang.*;

public class test {
    public static void main(String[] args) {

		List<Interval> test = new ArrayList<>();
        Interval a = new Interval(2,3);
		test.add(a);
		Interval b = new Interval(1,4);
		test.add(b);
		Interval c = new Interval(3,3);
		test.add(c);
		
		System.out.println("Before: " + test);
		System.out.println("After: " + Merge_Intervals.merge(test));


    }

}


//Definition for an interval.
class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
