class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        backtrack(0, nums, res, curr);

        return res;
    }

    public void backtrack(int idx, int[] nums,
                          List<List<Integer>> res,
                          List<Integer> curr) {

        if (idx == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        // Take
        curr.add(nums[idx]);
        backtrack(idx + 1, nums, res, curr);

        // Don't take
        curr.remove(curr.size() - 1);
        backtrack(idx + 1, nums, res, curr);
    }
}