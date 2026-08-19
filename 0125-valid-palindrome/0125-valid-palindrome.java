class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {

            // Skip invalid characters from left
            char leftChar = s.charAt(left);

            if (!((leftChar >= 'A' && leftChar <= 'Z') ||
                  (leftChar >= 'a' && leftChar <= 'z') ||
                  (leftChar >= '0' && leftChar <= '9'))) {
                left++;
                continue;
            }

            // Skip invalid characters from right
            char rightChar = s.charAt(right);

            if (!((rightChar >= 'A' && rightChar <= 'Z') ||
                  (rightChar >= 'a' && rightChar <= 'z') ||
                  (rightChar >= '0' && rightChar <= '9'))) {
                right--;
                continue;
            }

            // Convert uppercase to lowercase manually
            if (leftChar >= 'A' && leftChar <= 'Z') {
                leftChar = (char)(leftChar + 32);
            }

            if (rightChar >= 'A' && rightChar <= 'Z') {
                rightChar = (char)(rightChar + 32);
            }

            // Compare
            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}