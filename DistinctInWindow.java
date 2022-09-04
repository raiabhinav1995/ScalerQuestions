import java.util.ArrayList;
import java.util.HashMap;

public class DistinctInWindow {
    public static int[] distinctElements(int[] arr, int windowSize) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < windowSize; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        list.add(map.size());
        int i = 1;
        int j = windowSize;
        while (j < arr.length) {
            if (map.containsKey(arr[j])) {
                int count = map.get(arr[j]);
                map.put(arr[j], count + 1);
            } else {
                map.put(arr[j], 1);
            }
            if (map.containsKey(arr[i - 1])) {
                int count = map.get(arr[i - 1]);
                if (count == 1) {
                    map.remove(arr[i - 1]);
                } else {
                    map.put(arr[i - 1], count - 1);
                }
            }
            j++;
            i++;
            list.add(map.size());
        }
        return list.stream().mapToInt(a -> a).toArray();
    }

    public static void main(String[] args) {
        int[] arr = DistinctInWindow.distinctElements(new int[]{1, 2, 1, 3, 4, 3}, 3);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
