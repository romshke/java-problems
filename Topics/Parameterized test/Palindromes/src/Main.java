class StringUtils {
    public static boolean isPalindrome(String str) {
        // your code here
        if (str.isEmpty()) {
            return false;
        }

        str = str.replaceAll("[,' ]", "");
        str = str.toLowerCase();

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();

        return stringBuilder.toString().equals(str);
    }
}