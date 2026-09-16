class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        System.out.println("Sorted array: " + Arrays.toString(nums));

        int longest = 1;
        int current = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if ( nums[i + 1] == nums[i]) {
                continue;
            } else if (nums[i + 1] == nums[i] + 1) {
                current++;
            } else {
                int max = (longest < current) ? current : longest;
                longest = max;
                current = 1;
            }
        }
        longest = Math.max(longest, current);
        return longest;
    }
}