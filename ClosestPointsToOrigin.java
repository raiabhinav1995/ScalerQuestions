import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ClosestPointsToOrigin {
    ArrayList<ArrayList<Pair>> listOfPairs = new ArrayList<>();


    public static void main(String[] args) {
        Pair p1 = new Pair(18, 28);
        Pair p2 = new Pair(26, 41);
        Pair p3 = new Pair(40, 47);
        Pair p4 = new Pair(47, 7);
        Pair p5 = new Pair(50, 34);
//        Pair p6 = new Pair(0, 0);
        Pair[] arr = new Pair[]{p1, p2, p3, p4, p5};
        Arrays.sort(arr, new PairComparator());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].x + " " + arr[i].y + " " + arr[i].findDistanceFromOrigin(arr[i]));
        }
    }
}

class PairComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair o1, Pair o2) {
        double d1 = o1.findDistanceFromOrigin(o1);
        double d2 = o2.findDistanceFromOrigin(o2);
        double distance = o1.findDistanceFromOrigin(o1) - o2.findDistanceFromOrigin(o2);
        if (distance < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}

class Pair {
    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double findDistanceFromOrigin(Pair p) {
        return Math.sqrt(returnSquare(p.x) + returnSquare(p.y));
    }

    int returnSquare(int x) {
        return x * x;
    }
}
