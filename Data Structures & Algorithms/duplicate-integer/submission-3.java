class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Boolean flag = false;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (nums[i] == nums[j]){
                    flag = true;
                }
            }
            if (flag == true){
                return true;
            }
        }
        return false;
    }
}