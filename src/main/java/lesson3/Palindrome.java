package lesson3;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        boolean isPalindrome = palindrome.isPalindrome("kayak");

        System.out.println("The word is a palindrome: " + isPalindrome);
    }

    public boolean isPalindrome(String sourceTxt) {
        String targetTxt = "";
        int lastLetter = sourceTxt.length() - 1;
        boolean isPalindrome;

        for (int i = lastLetter; i >= 0; i--) {
            targetTxt = targetTxt + sourceTxt.charAt(i);
        }
        if (sourceTxt.equals(targetTxt)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }
        return isPalindrome;
    }




}
