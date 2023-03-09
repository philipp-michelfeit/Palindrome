class Palindrome {
    // Solution 1
    public static boolean isPalindrome1(final String text) {
        final String str = text.toLowerCase();
        int forward = 0;
        int backward = str.length() - 1;
        while (backward > forward) {
            char forwardChar = str.charAt(forward++);
            char backwardChar = str.charAt(backward--);

            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

    // Solution 2
    public static boolean isPalindrome2(final String text) {
        final String str = text.toLowerCase();
        final StringBuilder original = new StringBuilder(str);
        final StringBuilder reverse = original.reverse();
        return reverse.toString().equals(str);
    }
}


