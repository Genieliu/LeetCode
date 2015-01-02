/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Merge_Intervals {
    public static List<Interval> merge(List<Interval> intervals) {
        Collections.sort
        (intervals,new Comparator<Interval> () {
            public int comparator(Interval a,Interval b) {
                if(a.start < b.start) return 1;
                else return 0;
            }
        }
        );

        return intervals;
    }
}