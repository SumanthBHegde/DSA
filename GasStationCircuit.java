class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int fuel = 0;
        int sum_gas = 0;
        int sum_cost = 0;
        for (int i=0; i<gas.length; i++){
            sum_gas +=  gas[i];
            sum_cost += cost[i];
            fuel += gas[i] - cost[i];
            if(fuel < 0){
                start = i+1;
                fuel = 0;
            }
        }
        return sum_gas < sum_cost ? -1 : start; 
    }
}
