class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<Integer> arr = new ArrayList<>();
        for(int p=0; p<nums.length; p++){
            arr.add(nums[p]);
        }
        HashSet<List<Integer>> array = new HashSet<>();
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                int sum = arr.get(i) + arr.get(j);
                int third = -sum;
                int thirdIdx = arr.lastIndexOf(third);
                if(thirdIdx > j){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr.get(i));
                    temp.add(arr.get(j));
                    temp.add(third);
                    Collections.sort(temp);
                    if(!array.contains(temp)){
                        array.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(array);
    }
}
