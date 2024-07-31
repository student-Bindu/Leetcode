
class Solution {
    public int triangleNumber(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return 0;
        }
        Arrays.sort(nums);

        int[] indexMap = new int[2001];
        for (int i = 0; i < indexMap.length; ++i) {
            indexMap[i] = -1;
        }
        for (int i = 0; i < nums.length; ++i) {
            indexMap[nums[i]] = i;
        }
        for (int i = 1; i < indexMap.length; ++i) {
            if (indexMap[i] == -1) {
                indexMap[i] = indexMap[i - 1];
            }
        }
        int res = 0;
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] - 1 >= 0 && nums[i] + nums[j] - 1 <= 2000) {
                    res += Math.max(0, indexMap[nums[i] + nums[j] - 1] - j);
                }
            }
        }
        return res;
    }
}