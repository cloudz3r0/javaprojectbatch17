package review10;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AnimalTester {
    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.speak();
        dog.eat();
        //do this instead of repeating code like we did above.
        Animal [] arr={new Cat(),new Dog()};
        for(Animal a:arr){
            a.eat();
            a.speak();
        }
        /*ChromeDriver c=new ChromeDriver();
        c.manage().window().maximize();
        c.get("https://www.amazon.com");
        c.getTitle();*/

//same here
        WebDriver[] webDrivers={new EdgeDriver(),new ChromeDriver()};
        for (int i = 0; i < webDrivers.length; i++) {
WebDriver w=webDrivers[i];
w.manage().window().maximize();
w.get("https://www.amazon.com");
            System.out.println(w.getTitle());
            w.quit();
        }
    }
}
