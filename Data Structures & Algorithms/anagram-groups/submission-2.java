class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            int[] count = new int[26];

            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(count);

            if (map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}