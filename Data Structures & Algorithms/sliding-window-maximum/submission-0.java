class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        for (int j = 0; j <= n - k; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = j; i < j + k; i++) {
                max = Math.max(max, nums[i]);
            }
            result[j] = max;
        }

        return result;
    }
}