class Solution {
        HashMap<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if(map.containsKey(n)){
            return map.get(n);
        }
        
        int result;
        if(n<=2) result = n;
        else{
            result = climbStairs(n-1)+climbStairs(n-2);
        }
        map.put(n,result);
        return result;
    }
}