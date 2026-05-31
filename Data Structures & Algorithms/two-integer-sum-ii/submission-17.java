class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int balance = target - numbers[i];

            if (map.containsKey(balance)) {
                return new int[]{map.get(balance) + 1, i + 1};
            }

            map.put(numbers[i], i);
        }

        return new int[]{};
    }
}