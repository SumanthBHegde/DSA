class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int sum=arr[0];
        int max_sum = sum;
        for(int i = 1; i< arr.length;i++){
            sum = Math.max(arr[i], sum+arr[i]);
            max_sum = Math.max(sum, max_sum);
        }
        return max_sum;
    }
}
