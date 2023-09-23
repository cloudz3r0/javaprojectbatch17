package class21;

public class WebDriverTester {
    public static void main(String[] args) {
        //since the class is abstract we cant create the object of method
        WebDriver[] arr={new ChromeDriver(),new FireFoxDriver()};
        for(WebDriver d:arr){
            d.openBrowser();
            d.loadUrl("Amazon.com");
            d.performTesting();
            d.close();

        }
    }
}
