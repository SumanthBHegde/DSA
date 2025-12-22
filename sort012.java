class Solution {
    public void sort012(int[] arr) {
        int min = 0, max = arr.length - 1, mid = 0, temp;
        while(mid <= max){
            if (arr[mid] == 0){
                temp = arr[min];
                arr[min] = arr[mid];
                arr[mid] = temp;
                min++;
                mid++;
            }
           else if (arr[mid] == 1){
                mid++;
            }
            else if (arr[mid] == 2){
                temp = arr[max];
                arr[max] = arr[mid];
                arr[mid] = temp;
                max--;
            }
        }
    }
}
