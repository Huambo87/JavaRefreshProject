package Pages;

public class PagesMain {
    public static void main(String[] args) {

//        Page loginScreen = new Page("Login", 1, "www.legionit.com/login", "Exit");
//        loginScreen.pageId = 1;
//        loginScreen.pageName = "Login";
//        loginScreen.URL = "www.legionit.com/login";

//        loginScreen.openPage();
//        loginScreen.clickButton();
//        loginScreen.closePage();
//
//        Page aboutScreen = new Page();
////        aboutScreen.setPageId(2);
//        System.out.println(aboutScreen.getPageId());
//        aboutScreen.setPageName("About");
//        aboutScreen.setURL("www.legionit.com/about");
//
//        aboutScreen.openPage();
//        aboutScreen.clickButton();
//        aboutScreen.closePage();

//        LoginPage loginPage = new LoginPage();
//
//        loginPage.setPageName("Login Page");
//        loginPage.setURL("www.legionit.com/loginpage");
//
//        loginPage.openPage();
//        loginPage.setUsername("Huambo");
//        loginPage.setPassword("*********");
//        loginPage.populateCredentials();
//
//        AboutPage aboutPage = new AboutPage();
//        System.out.println(aboutPage.disclaimer);



//     Page page = new Page();
//     page.getDeveloperName();

     LoginPage loginPage = new LoginPage();
     loginPage.setPageId(1);
     loginPage.setPageName("Login");
     loginPage.getDeveloperName();

     AboutPage aboutPage = new AboutPage();
     aboutPage.getDeveloperName();


    }

}
