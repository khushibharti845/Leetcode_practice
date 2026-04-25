class Solution {
    public boolean canJump(int[] nums) {

        int maxlen = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxlen) return false;
            if (i + nums[i] > maxlen) {
                maxlen = nums[i] + i;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {2, 3, 1, 1, 4};

        boolean result = obj.canJump(nums);

        System.out.println("Can reach last index: " + result);
    }
}
