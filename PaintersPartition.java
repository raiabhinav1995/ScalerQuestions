public class PaintersPartition {
    public static void main(String[] args) {
        int[] paintArray = new int[]{449, 792, 564, 261, 584, 798, 514, 616};
        int painters = 2;
        int timeToPaint = 10;
        int max = 0;
        int arrayMax = Integer.MIN_VALUE;
        for (int i = 0; i < paintArray.length; i++) {
            paintArray[i] *= timeToPaint;
            max += paintArray[i];
            arrayMax = Math.max(arrayMax, paintArray[i]);
        }
        int low = arrayMax;
        int high = max;
        int ans = max;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isPossibleToPaint(paintArray, painters, mid)) {
                high = mid - 1;
                ans = Math.min(ans, mid);
            } else {
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean isPossibleToPaint(int[] paintArray, int painter, int maxTime) {
        int totalWorker = 0;
        int workAllocated = 0;
        for (int paintArea : paintArray) {
            if (workAllocated + paintArea >= maxTime) {
                totalWorker++;
                if (workAllocated + paintArea == maxTime) {
                    workAllocated = 0;
                } else {
                    workAllocated = paintArea;
                    totalWorker--;
                }
            } else {
                workAllocated += paintArea;
            }
        }
        if (totalWorker <= painter) {
            return true;
        }
        return false;
    }
}
