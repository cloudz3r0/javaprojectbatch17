package class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2 {
    public static void main(String[] args) {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
        String userName="Admin";
        String password="Hum@nhrm123";
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
//locate the text field
        WebElement userNameField=driver.findElement(By.id("txtUsername"));
        //send text into the field
        userNameField.sendKeys(userName);
//find the password field
        WebElement password1=driver.findElement(By.id("txtPassword"));
        password1.sendKeys(password);

        WebElement loginBtn=driver.findElement(By.id("btnLogin"));
        loginBtn.click();
    }
}
