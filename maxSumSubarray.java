package Important;

import java.util.Arrays;

public class maxSumSubarray {
    public static void main(String[] args) {
        int[] arr = {-5, 2, -4, -5, 3, -1, 2, -3, 1};
        int[] result = maxSubarray(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] maxSubarray(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];
        int start = 0;
        int end = 0;
        int currentStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                currentStart = i;
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = currentStart;
                end = i;
            }
        }

        return Arrays.copyOfRange(arr, start, end + 1);
    }
}
