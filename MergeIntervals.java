import java.util.ArrayList;

public class MergeIntervals {
    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 10));
        intervals.add(new Interval(2, 9));
        intervals.add(new Interval(3, 8));
        intervals.add(new Interval(4, 7));
        intervals.add(new Interval(5, 6));
        intervals.add(new Interval(6, 6));

        ArrayList<Interval> answer = mergeIntervals(intervals);
        for (Interval i : answer) {

            System.out.println(i.start + " " + i.end);
        }
    }

    private static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervals) {
        Interval mergedInterval = new Interval(intervals.get(0).start, intervals.get(0).end);
        ArrayList<Interval> mergedIntervals = new ArrayList<Interval>();
        for (int i = 1; i < intervals.size(); i++) {
            Interval currentInterval = intervals.get(i);
            int newStart = currentInterval.start < mergedInterval.start ? currentInterval.start : mergedInterval.start;
            int newEnd = currentInterval.end > mergedInterval.end ? currentInterval.end : mergedInterval.end;
            if ((currentInterval.start > mergedInterval.start && currentInterval.start < mergedInterval.end) || (currentInterval.end > mergedInterval.start && currentInterval.end < mergedInterval.end)) {
                mergedInterval.start = newStart;
                mergedInterval.end = newEnd;
            } else {
                mergedIntervals.add(currentInterval);
            }

        }
        mergedIntervals.add(new Interval(mergedInterval.start, mergedInterval.end));
        return mergedIntervals;
    }

}

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}
