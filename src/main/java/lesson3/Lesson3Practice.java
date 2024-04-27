package lesson3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson3Practice {
    public static void main(String[] args) {
        Lesson3Practice lesson3Practice = new Lesson3Practice();
        String targetWord = lesson3Practice.addLastLetter("dog");
        System.out.println(targetWord);

        boolean iMax = lesson3Practice.maxStart("paz eternal");
        System.out.println("It starts from max: " + iMax);

        String output = lesson3Practice.fizzBuzz("obo");
        System.out.println(output);

        boolean isBigThere = lesson3Practice.ifBigThere("aknbb45");
        System.out.println("Contains bib: " + isBigThere);

        String target = lesson3Practice.stringTimes("Hi", 3);
        System.out.println(target);

        boolean isPlural = lesson3Practice.ifPlural("dogs");
        System.out.println("This word is in plural: " + isPlural);


    }

    public String addLastLetter(String sourceWord) {

        char lastLetter = sourceWord.charAt(sourceWord.length() - 1);
        String targetWord = lastLetter + sourceWord + lastLetter;
        return targetWord;
    }

    public boolean maxStart(String str) {

        boolean isMax;
        char second = str.charAt(1);
        char third = str.charAt(2);

        if (second == 'a' && third == 'x') {
            isMax = true;
        } else {
            isMax = false;
        }
        return isMax;
    }

    public String fizzBuzz(String triplet) {
        char firstLetter = triplet.charAt(0);
        char lastLetter = triplet.charAt(triplet.length() - 1);
        String output;

        if (firstLetter == 'f' && lastLetter != 'b') {
            output = "Fizz";
        } else if (firstLetter != 'f' && lastLetter == 'b') {
            output = "Buzz";
        } else if (firstLetter == 'f' && lastLetter == 'b') {
            output = "FizzBuzz";
        } else {
            output = "Error";
        }
        return output;
    }

    public boolean ifBigThere(String txt) {
        boolean isBigThere = false;
        int len = txt.length();

        if (len >= 3) {

            for (int i = 0; i < len - 2; i++) {

                if (txt.charAt(i) == 'b' && txt.charAt(i + 2) == 'b') {

                    isBigThere = true;
                }
            }
        }
        return isBigThere;
    }

    public String stringTimes(String string, int i) {
        String target = string.repeat(i);
        return target;
    }

    public boolean ifPlural(String txt) {
        boolean isPlural = false;
        char lastLetter = txt.charAt(txt.length() - 1);

        if (lastLetter == 's') {
            isPlural = true;
        }
        return isPlural;
    }
}




