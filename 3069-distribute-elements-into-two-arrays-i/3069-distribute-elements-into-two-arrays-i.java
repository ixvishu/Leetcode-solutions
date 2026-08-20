class Solution {
    public int[] resultArray(int[] nums) {

        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        int i = 0;
        int j = 0;

        for (int k = 2; k < n; k++) {

            if (arr1[i] > arr2[j]) {
                i++;
                arr1[i] = nums[k];
            } 
            else {
                j++;
                arr2[j] = nums[k];
            }
        }

        // Add arr2 at the end of arr1
        for (int k = 0; k <= j; k++) {
            i++;
            arr1[i] = arr2[k];
        }

        return arr1;
    }
}