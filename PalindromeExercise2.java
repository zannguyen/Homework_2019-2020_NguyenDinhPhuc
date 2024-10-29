public class PalindromeExercise2 {
    public static boolean isPalindrome(String str) {
        return isPalindromeRecursive(str, 0, str.length() - 1);
    }

    private static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true; 
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false; 
        }
        return isPalindromeRecursive(str, start + 1, end - 1); 
    }

    public static void main(String[] args) {
        String word = "car"; 
        System.out.println("Is " + word + " a palindrome? " + isPalindrome(word));
    }
}
