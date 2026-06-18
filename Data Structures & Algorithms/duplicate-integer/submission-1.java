class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> items = new HashSet<>();
        for (int num : nums){
            if(!items.add(num)){
                return true;
            }
        }
        return false;
    }
}