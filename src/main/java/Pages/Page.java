package Pages;

public class Page {

    String pageName;
    int pageId;
    String URL;

    public void openPage(){
        System.out.println(String.format("Page %s is open.", pageName));
    }

}
