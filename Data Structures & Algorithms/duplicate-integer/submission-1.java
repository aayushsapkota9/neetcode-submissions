class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer> unique=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            boolean isAdded=unique.add(nums[i]);
            if(!isAdded){
                return true;
            }
        }
        return false;
    }
}