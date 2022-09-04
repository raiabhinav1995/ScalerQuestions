import java.util.Arrays;

class CapacityToShipLeetCode {
    //    Question link:https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
    public static int daysToShip(int[] weights, int days, int maxWeight) {
        int totalLuggageWhichCanBeShipped = 0;
        int numberOfDaysToShip = 0;
        for (int weight : weights) {
            if (totalLuggageWhichCanBeShipped + weight < maxWeight) {
                totalLuggageWhichCanBeShipped += weight;
            } else {
                if (totalLuggageWhichCanBeShipped + weight == maxWeight)
                    totalLuggageWhichCanBeShipped = 0;
                else
                    totalLuggageWhichCanBeShipped = weight;
                numberOfDaysToShip++;
            }
        }
        if (totalLuggageWhichCanBeShipped > 0) {
            numberOfDaysToShip++;
        }
        return numberOfDaysToShip;
    }

    public static void main(String[] args) {
        System.out.println(CapacityToShipLeetCode.shipWithinDays(new int[]{1, 2, 3, 1, 1}, 4));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int max = weights[0];
        int total = 0;
        Arrays.sort(weights);
        for (int i = 0; i < weights.length; i++) {
            max = Math.max(max, weights[i]);
            total += weights[i];
        }
        int low = max;
        int answer = Integer.MAX_VALUE;
        int high = total;
        while (low <= high) {
            int mid = (low + high) / 2;
            int daysToShip = daysToShip(weights, days, mid);
            if (daysToShip > days) {

                low = mid + 1;
            } else if (daysToShip <= days) {
                high = mid - 1;

                answer = Math.min(answer, mid);
            } else {
//                low = mid + 1;
            }
        }
        return answer;

    }

}