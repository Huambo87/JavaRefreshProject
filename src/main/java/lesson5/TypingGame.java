package lesson5;

import java.util.Arrays;

public class TypingGame {

    public static void main(String[] args) {
        String[] userTypedArray = {"cat", "blue", "skt", "umbrells", "paddy"};
        String[] correctArray = {"cat", "blue", "sky", "umbrella", "padday"};

        TypingGame typingGame = new TypingGame();
        int[] result = typingGame.compareWords(userTypedArray, correctArray);
        System.out.println(Arrays.toString(result));
    }

    public int[] compareWords(String[] userTypedArray, String[] correctArray){
        int[] result = new int[userTypedArray.length];
        for (int i = 0; i < userTypedArray.length; i++){
            if(userTypedArray[i].equals(correctArray[i])){
                result[i] = 1;
            }else {
                result[i] = -1;
            }
        }
        return result;
    }
}
