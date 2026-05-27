class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;

        // Create new array of size 2n
        int[] ans = new int[2 * n];

        // Copy nums twice
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}