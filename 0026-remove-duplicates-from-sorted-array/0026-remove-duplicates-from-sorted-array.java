class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0, size=nums.length;
        for(int j=1;j<size;j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
}