class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int k = 0;
        for (int i = 0; i< nums.length; i++){
            if(cnt == 0){
                k = nums[i];
                cnt++;
            }
            else if(k == nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return k;
    }
}
