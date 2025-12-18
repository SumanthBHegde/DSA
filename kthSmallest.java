class Solution {
    
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        int temp;
        for(int j=low; j<high; j++){
            if (arr[j] < pivot){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    
    
    public static int quickSelect(int[] arr, int low, int high, int kIndex){
        if (low == high) return arr[low];
        
        int pivotIndex = partition(arr, low, high);
        if (pivotIndex == kIndex){
            return arr[pivotIndex];
        }
        else if (pivotIndex > kIndex){
            return quickSelect(arr, low, pivotIndex - 1, kIndex);
        }
        else{
            return quickSelect(arr, pivotIndex + 1, high, kIndex);
        }
     }
    
    public int kthSmallest(int[] arr, int k) {
        // Code here
        return quickSelect(arr, 0, arr.length-1, k-1);
    }
}
