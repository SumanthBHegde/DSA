class Solution {
    public int trap(int[] height) {
        int res = 0;
        int n = height.length;
        int lres=0;
        int rres=0;
        int l = 0;
        int r = n-1;
        while(l < r){
            if (height[l] <= height[r]){
                if(height[l] >= lres){
                    lres = height[l];
                }
                else{
                    res += lres - height[l];
                }
                l++;
            }
            else{
                if(height[r] >= rres){
                    rres = height[r];
                }
                else{
                    res += rres - height[r];
                }
                r--;
            }
        }
        return res;
    }

}
