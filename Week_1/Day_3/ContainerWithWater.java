class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int i= 0 ;
        int j = height.length -1;
        while(i<j){
            int width = j-i;
            int vol = Math.min(height[i],height[j]) * width;
            // area = Math.max(area, vol);
            if(area<vol){
                area = vol;
            }
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return area ;
    }
}