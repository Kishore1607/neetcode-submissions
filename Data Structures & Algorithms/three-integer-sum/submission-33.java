class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> allValue = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2; i++){
            int j=i+1;
            int k=nums.length-1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while(i<j && j<k){
                if(nums[i]+nums[j]+nums[k] == 0){
                    List<Integer> index = new ArrayList<>();
                    index.add(nums[i]);
                    index.add(nums[j]);
                    index.add(nums[k]);
                    allValue.add(index);
                    j++;
                    k--;
                }else if(nums[i]+nums[j]+nums[k] < 0){
                    j++;
                }else if(nums[i]+nums[j]+nums[k] > 0){
                    k--;
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < allValue.size(); i++) {
            if (result.contains(allValue.get(i))) {
                continue;
            }
            result.add(allValue.get(i));
        }
        return result;
    }
}
