class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            // If already exists -> duplicate found
            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}