
class Solution {
    public void rotate(int[] arr) {
        // code here
        int n =arr.length-1;
        int temp = arr[n];
        for (int i=n;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
}
