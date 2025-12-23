class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        if (n > 0 && n < 100000){
            int first = 0, last = n-1;
        while(first < last){
            char temp = s[last];
            s[last] = s[first];
            s[first] = temp;
            first++;
            last--;
        }
        }
    }
}
