class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        for(int i=0; i<heights.length; i++){
            int imax = 0;
            for(int j=heights.length-1; j>i; j--){
                int small = (heights[i]<heights[j])? heights[i]*(j-i) : heights[j]*(j-i);
                imax = Math.max(small, imax);
            }
            max = Math.max(imax, max);
        }
        return max;
    }
}
