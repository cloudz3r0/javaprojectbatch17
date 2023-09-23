package class22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTester {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver w=new FireFoxDriver();
        //WebDriver w=new EdgeDriver();
        //WebDriver w=new ChromeDriver();
        //interface allows us to use multiple classes with methods that
        //each class is implementing.
        //also user Webdriver w=new AnyDriver instead of AnyDriver=new AnyDriver
        WebDriver[] browsers = {new EdgeDriver(), new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver w : browsers) {
            w.manage().window().maximize();
            Thread.sleep(2000);
            w.navigate().to("https://amazon.com");
            System.out.println(w.getTitle());
            Thread.sleep(2000);
            w.close();
        }
    }
}
