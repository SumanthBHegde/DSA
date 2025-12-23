class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        if (n < 2 || n > 100000) return 0;
        int l = 0, r = n-1;
        int max_ar = 0;
        while(l < r){
            int h = Math.min(height[l],height[r]);
            int w = r - l;
            int ar = w * h;
            max_ar = Math.max(ar, max_ar);
            if (height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max_ar;
    }
}
