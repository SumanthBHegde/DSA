class Solution {
    public boolean canJump(int[] nums) {
        int reach = 0;
        int n = nums.length;
        int i = 0;
        while(i <= reach){
            reach = Math.max(reach, nums[i] + i);
            if(reach >= n -1) return true;
            i++;
        }
        return false;
    }
}
