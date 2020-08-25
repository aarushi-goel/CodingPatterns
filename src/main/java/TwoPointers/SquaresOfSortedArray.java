package TwoPointers;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] A) {
        // First smallest squared number
        int pivot = 0;
        int[] output = new int[A.length];

        for (; pivot<A.length; pivot++) {
            if (A[pivot] >= 0) {
                break;
            }
        }

        // If all numbers in A are less than 0
        if (pivot == A.length) {
            pivot--;
        }

        int left = pivot-1;
        int right = pivot;
        int index = 0;

        while (left >= 0 && right < A.length) {
            int leftNum = A[left]*A[left];
            int rightNum = A[right]*A[right];

            if (leftNum < rightNum) {
                output[index] = leftNum;
                left--;
            } else {
                output[index] = rightNum;
                right++;
            }

            index++;
        }

        while (left >= 0) {
            output[index] = A[left]*A[left];
            index++;
            left--;
        }

        while (right < A.length) {
            output[index] = A[right]*A[right];
            index++;
            right++;
        }

        return output;
    }
}