class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> items = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if(items.size()!=nums.length){
            return true;
        }
        else{
            return false;
        } 

    }
}