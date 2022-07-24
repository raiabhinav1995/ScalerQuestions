import java.util.ArrayList;

public class GrayCode {

    public static void main(String[] args) {
        System.out.println(GrayCode.grayCode(2));
//        System.out.println(GrayCode.answer);
    }

    public static ArrayList<Integer> grayCode(int n) {
        if (n == 1) {
            ArrayList<Integer> newList = new ArrayList<Integer>();
            newList.add(0);
            newList.add(1);
            return newList;
        }
        ArrayList<Integer> nMinusOneList = grayCode(n - 1);
        ArrayList<Integer> masterList = new ArrayList<Integer>();
        for (int i = 0; i < nMinusOneList.size(); i++) {
            masterList.add(nMinusOneList.get(i));
        }
        for (int i = nMinusOneList.size() - 1; i >= 0; i--) {
            masterList.add(nMinusOneList.get(i) + (1 << n - 1));
        }
//        nMinusOneList = new ArrayList<>(answer);
        return masterList;
    }
}
