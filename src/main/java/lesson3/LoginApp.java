package lesson3;

public class LoginApp {

    public String expectedUsername = "admin";
    public String expectedPassword = "12345678";

    public static void main(String[] args) {
        LoginApp loginApp = new LoginApp();
//        boolean success = loginApp.verifyUser("ADMIN", "12345678");
        loginApp.stringExamples();

//        System.out.println("User authorized: " + success);
    }

    public boolean verifyUser(String username, String password){

        username = username.toLowerCase();
        password = password.toLowerCase();
        boolean success = false;

//        if(username.isEmpty() || password.isEmpty()){
        if(username == null || password == null){
            System.out.println("Username or password is NULL!");
        }

        else if(username.length() == 0 || password.length() == 0){
            System.out.println("Username or password is empty!");
        }

        else if(username.isBlank() || password.isBlank()){
            System.out.println("Username or password is empty!");
        }

//        else if(username != expectedUsername || password != expectedPassword){
        else if(!username.equals(expectedUsername) || !password.equals(expectedPassword)){
            System.out.println("Username or password is incorrect!");
        }

        else {
            success = true;
            System.out.println("Login successful!");
        }
        return success;
    }

    public void stringExamples(){

        String txt1 = "dog";
        String txt2 = "catalog";

        System.out.println(txt2.contains(txt1));
        System.out.println(txt2.replace("cat", txt1));
        System.out.println(txt1.charAt(0));
        System.out.println(txt1.charAt(2));

    }

}
