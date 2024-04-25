package lesson3;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverseWord("Maxim");
    }

    public void reverseWord(String wordToReverse){

        for (int i = wordToReverse.length() -1; i>= 0; i--){
            System.out.print(wordToReverse.charAt(i));
        }
    }
}
