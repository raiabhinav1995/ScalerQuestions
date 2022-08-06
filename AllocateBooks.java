public class AllocateBooks {
    public static void main(String[] args) {
//        int[] books = new int[]{12, 34, 67, 90};
        int numberOfBooks = 2;
        int[] books = new int[]{12, 34, 67, 90};
        int a = AllocateBooks.findBooks(books, numberOfBooks);
        System.out.println(a);
    }

    private static boolean checkPages(int maxpages, int[] A, int students) {
        int sumPages = 0, count = 0;

        for (int i = 0; i < A.length; i++) {
            sumPages += A[i];
            if (sumPages > maxpages) {
                count++;
                sumPages = A[i];
            }
        }
        if (sumPages != 0) count++;

        if (count <= students) {
            return true;
        } else {
            return false;
        }
    }

    public static int books(int[] A, int B) {
        int N = A.length;

        if (B > N) return -1;

        //building start and end for Binary Search
        int start = A[0], end = 0;
        for (int i = 0; i < N; i++) {
            start = Math.max(A[i], start);
            end += A[i];
        }

        int ans = end;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (checkPages(mid, A, B)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int findBooks(int[] books, int numberOfBooks) {

        int low = Integer.MIN_VALUE;
        int high = 0;
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < books.length; i++) {
            if (books[i] > low) {
                low = books[i];
            }
            high += books[i];
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (returnAnswer(books, mid, numberOfBooks)) {

                high = mid - 1;


                answer = Math.min(answer, mid);
            } else {

                low = mid + 1;
            }
        }

        return answer;

    }

    public static boolean returnAnswer(int[] books, int pages, int distance) {
        int numberOfBooks = 0;
        int currentPages = 0;
        for (int i = 0; i < books.length; i++) {
            if ((currentPages + books[i]) >= pages) {
                if (currentPages + books[i] == pages) {
                    currentPages = 0;
                } else {
                    currentPages = books[i];
                }
                numberOfBooks++;
            } else {
                currentPages += books[i];
            }
        }
        if (currentPages != 0) {
            numberOfBooks++;
        }
        if (numberOfBooks <= distance) {
            return true;
        } else {
            return false;
        }
    }

}
