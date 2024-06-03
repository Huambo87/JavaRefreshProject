package Pages;


public class Page {


    private int pageId;
    private String pageName;
    private String URL;
    private String buttonName;


//    public Page(String pageName, int pageId, String URL, String buttonName){
//        this.pageName = pageName;
//        this.pageId = pageId;
//        this.URL = URL;
//        this.buttonName = buttonName;
//    }

    public Page(){

    }

    public int getPageId(){
        return pageId;
    }

    public void setPageId(int pageId){
        this.pageId = pageId;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    public void openPage(){
        System.out.println(String.format("Page %s is open.", pageName));
    }

    public void closePage(){
        System.out.println(String.format("Page %s is closed.", pageName));
        System.out.println("");
    }

    public void clickButton(){
        System.out.println(String.format("Button %s is clicked", buttonName));
    }

//    public abstract void getDeveloperName();

}
