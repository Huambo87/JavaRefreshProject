package lesson3;

public class SelfTest {

    public static void main(String[] args) {
        SelfTest selfTest = new SelfTest();
        selfTest.isPartOf("category", "cats");
        selfTest.compareStrings("category", null);
    }

    public void isPartOf(String a, String b) {
        if (a.contains(b)) {
            System.out.println("The word " + b + " is part of the word " + a);
        } else {
            System.out.println("The word " + b + " is not part of the word " + a);
        }
    }

    public void compareStrings(String str1, String str2){

        if(str1.equals(str2)){
            System.out.println("The strings are the same.");
        }else if(str1 == null || str2 == null){
            System.out.println("The strings cannot be compared.");
        }else{
            System.out.println("The strings are different.");
        }
    }
}
