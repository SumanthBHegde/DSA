class RandomizedSet {
    List<Integer> nums;
    Map<Integer, Integer> index;

    public RandomizedSet() {
        nums = new ArrayList<>();
        index = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if (index.containsKey(val)) {
            return false;
        }

        nums.add(val);
        index.put(val, nums.size() - 1);
        return true;
    }
    
    public boolean remove(int val) {
        if (!index.containsKey(val)) {
            return false;
        }

        int idx = index.get(val);
        int lastVal = nums.get(nums.size() - 1);

        nums.set(idx, lastVal);
        index.put(lastVal, idx);

        nums.remove(nums.size() - 1);
        index.remove(val);

        return true;
    }

    Random rand = new Random();
    
    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
