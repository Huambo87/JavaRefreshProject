package lesson2;

public class Lesson2Practice {
    public static void main(String[] args) {
        Lesson2Practice practice = new Lesson2Practice();
        practice.nearHundred(97);
        practice.nearHundred(89);
        practice.nearHundred(111);
        practice.nearHundred(110);
        practice.nearHundred(90);
        practice.lastDigit(7, 15);
        practice.lastDigit(77, 17);
        practice.lastDigit(7, 17);
        practice.largestNumber(15, 25, 10);
        practice.trueSeven(3, 5);
        practice.answerCall(true, false, false);
        practice.equalSlices(11, 6, 2);
        practice.straightPyramid(9);
        practice.reversePyramid(9);
    }

    public void nearHundred(int n) {
        boolean isNearHundred;

        if (n >= 90 & n <= 110) {
            isNearHundred = true;

            System.out.println("Number " + n + " is near hundred: " + isNearHundred);
        } else {
            isNearHundred = false;
            System.out.println("Number " + n + " is near hundred: " + isNearHundred);
        }
    }

    public void lastDigit(int a, int b) {
        boolean isSeven;

        if (a % 10 == 7 & b % 10 == 7) {
            isSeven = true;
            System.out.println("Both numbers yield seven: " + isSeven);
        } else {
            isSeven = false;
            System.out.println("Both numbers yield seven: " + isSeven);
        }
    }

    public void largestNumber(int a, int b, int c) {
        if (a > b & a > c) {
            System.out.println(a);
        } else if (b > a & b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    public void trueSeven(int a, int b) {

        boolean isTrueSeven;

        if (a == 7 || b == 7 || a + b == 7) {
            isTrueSeven = true;
            System.out.println("It is true seven: " + isTrueSeven);
        } else {
            isTrueSeven = false;
            System.out.println("It is true seven: " + isTrueSeven);
        }
    }

    public void answerCall(boolean isMorning, boolean isMom, boolean isAsleep) {

        boolean isAnswerCall;

        if (isAsleep == true) {
            isAnswerCall = false;
            System.out.println("I'm asleep. Please call later." + isAnswerCall);
        }
        else if (isMorning == true) {

            if (isMom == false) {
                isAnswerCall = false;
                System.out.println("I'm busy now. Please call later. " + isAnswerCall);
            }
            if (isMom == true) {
                isAnswerCall = true;
                System.out.println("Hello, Mom! " + isAnswerCall);
        }
        } else {
            isAnswerCall = true;
            System.out.println("Hi, how can I help you? " + isAnswerCall);
        }
    }

    public void equalSlices(int totalSlices, int totalEaters, int slicesEach){
        boolean isEqual;

        if(slicesEach * totalEaters <= totalSlices){
            isEqual = true;
            System.out.println("It's fair! " + isEqual);
        }
        else {
            isEqual = false;
            System.out.println("It's unfair! " + isEqual);
        }
    }

    public void straightPyramid(int rows){
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public void reversePyramid(int lines){
        for (int i = 9; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

}
