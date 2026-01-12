class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] cnt = new int[n+1];
        for(int ci : citations){
            if (ci >= n) cnt[n]++;
            else cnt[ci]++;
        }
        int sum =0 ,i;
        for (i=n; i>=0;i--){
            sum = sum + cnt[i];
            if(sum >= i) return i;
        }
        return i;
    }
}
