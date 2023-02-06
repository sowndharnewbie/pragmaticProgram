class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int length=1;
        int high=0;
        if(nums.length==0) return 0;
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]+1)==nums[i+1]) length++;
             else if(nums[i]==nums[i+1]) continue;
            else {
                if(length>=high) high=length;
                length=1;
            }
        }
         if(length>=high) high=length;
        return high;
    }
}