package class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E3 {
    public static void main(String[] args) throws IOException {
       //we used the method below to get these properties from our config properties file.
        String url = getProperty("URL");
        String userName = getProperty("userName");
        String password = getProperty("password");
        //a secure way to put username and password without people being able to see it.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        //locate the text field
        WebElement userNameField = driver.findElement(By.id("txtUsername"));
        //send text into the field
        userNameField.sendKeys(userName);
        //find the password field
        WebElement password1 = driver.findElement(By.id("txtPassword"));
        password1.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        loginBtn.click();

    }

    public static String getProperty(String propKey) throws IOException {
        //Our method to access our Config.properties file.
        //getting the file information by using its locator
        String path = System.getProperty("user.dir") + "\\Files\\Config.properties";
        //convert it from permanent storage into ram. Data gets stored into the variable fis
        FileInputStream fis = new FileInputStream(path);

        Properties prop = new Properties();
        prop.load(fis);

        String value = prop.getProperty(propKey);
        return value;
    }
}