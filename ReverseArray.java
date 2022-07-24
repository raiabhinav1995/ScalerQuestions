public class ReverseArray {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int[] solve(final int[] A) {
        int[] B=new int[A.length];
        for(int i=A.length-1;i>=0;i--){
            int j=A.length-1-i;
            B[j]=A[i];
        }
        return B;
    }

    public static void main(String[] args) {
        int[] answer=ReverseArray.solve(new int[]{1,2,3,4,5});
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }
}
