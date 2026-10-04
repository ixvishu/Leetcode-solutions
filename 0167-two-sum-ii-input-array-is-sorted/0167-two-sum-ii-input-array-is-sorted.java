class Solution {
    public int[] twoSum(int[] numbers, int target) {

        ArrayList<Integer> arr = new ArrayList<>();
        int first = 0;
        int last = numbers.length - 1;

        while(first < last)
        {
            int sum = numbers[first] + numbers[last];

            if(sum == target)
            {
                return new int[]{first + 1, last + 1};
            }
            else if(sum > target)
            {
                last--;
            }
            else
            {
                first++;
            }
        }

        return new int[]{};
    }
}

