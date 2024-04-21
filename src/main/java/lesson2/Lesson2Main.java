package lesson2;

public class Lesson2Main {
    public static void main(String[] args) {
        boolean isBonusAvailable = true;
        Lesson2Main lesson2Main = new Lesson2Main();
        lesson2Main.printUserInfo("John Doe", 1);
        lesson2Main.checkScore("Max Gladkov", 2, 75, isBonusAvailable);
        lesson2Main.checkScore("Max McLead", 3, 25, isBonusAvailable);
        lesson2Main.checkScore("Ann Smith", 4, 45, isBonusAvailable);
    }

    public void printUserInfo(String userName, int userId) {

        System.out.println("User name is " + userName);
        System.out.println("User ID is " + userId);
    }

    public void checkScore (String userName, int userId, int userScore, boolean isBonusAvailable) {

        if(userName.contains("Max McLead")) {
            userScore = userScore + 20;
        }

        if(isBonusAvailable) {
            userScore = userScore + 10;
        }

        if(userScore >= 60) {
            System.out.println(userName + " Passed!");
        }

        else {
            System.out.println(userName + " Failed!");
        }

    }


}
