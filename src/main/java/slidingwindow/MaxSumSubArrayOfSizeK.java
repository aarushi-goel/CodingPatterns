package slidingwindow;

public class MaxSumSubArrayOfSizeK {
    public static int findMaxSumSubArray(int k, int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int i=0, j=i+k-1, windowSum=0, maxSum=0;

        for (int m=0; m<k ;m++) {
            maxSum += arr[m];
        }
        windowSum = maxSum;

        while(j<arr.length-1) {
            windowSum = windowSum - arr[i] + arr[j+1];
            maxSum = Math.max(maxSum, windowSum);
            i++;
            j++;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("Maximum sum of a subarray of size K: "
                + MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
        System.out.println("Maximum sum of a subarray of size K: "
                + MaxSumSubArrayOfSizeK.findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));
    }
}
