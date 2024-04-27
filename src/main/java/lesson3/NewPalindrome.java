package lesson3;

public class NewPalindrome {
    public static void main(String[] args) {
        NewPalindrome newPalindrome = new NewPalindrome();
        boolean ifPalindrome = newPalindrome.ifPalindrome("radan");

        System.out.println("The word is a palindrome: " + ifPalindrome);


    }

    public boolean ifPalindrome(String sourceWord){
        String targetWord = "";
        boolean ifPalindrome;

        for(int i = sourceWord.length() -1; i >= 0; i--){
            targetWord = targetWord + sourceWord.charAt(i);
        }
        if(sourceWord.equals(targetWord)){
            ifPalindrome = true;
        }
        else {
            ifPalindrome = false;
        }
        return ifPalindrome;
    }
}
