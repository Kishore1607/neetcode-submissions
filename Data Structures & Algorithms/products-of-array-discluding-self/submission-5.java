class Solution {

    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        // Left products
        int product = 1;

        for (int i = 0; i < nums.length; i++) {

            result[i] = product;

            product *= nums[i];
        }

        // Right products
        product = 1;

        for (int i = nums.length - 1; i >= 0; i--) {

            result[i] *= product;

            product *= nums[i];
        }

        return result;
    }
}