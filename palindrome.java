// Möglichkeit 1
public static boolean isPalindrome(final String text) {
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

// Möglichkeit 2
public static boolean isPalindrome(final String text) {
    final StringBuilder original = new StringBuilder(text.toLowerCase());
    final StringBuilder reverted = original.reverse();

    return original.equals(reverted);
}
