class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        // Arraylist c = new Arraylist();
        // int i = 0;
        // while (a[i] == b[i] && i < Math.min(a.length,b.length)){
        //     if (c/*need tp add the logic of not already present */){
        //         c.add(a[i]);
        //     }
        //     i++;
        // }
        
        HashSet<Integer> set = new HashSet<>();
        for(int i : a){
            set.add(i);
        }
        
        for(int i : b){
            set.add(i);
        }
        
        return new ArrayList<>(set);
    }
}
