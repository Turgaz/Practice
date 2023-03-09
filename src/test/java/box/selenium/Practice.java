package box.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Practice {
    public static void main(String[] args) {
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver1=new FirefoxDriver();
//        driver1.get("https://automationexercise.com/");
//        driver1.close();


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.close();

//          WebDriverManager.edgedriver().setup();
//          WebDriver driver4=new EdgeDriver();
//          driver4.get("https://automationexercise.com/");
//          driver4.close();

//        WebDriverManager.safaridriver().setup();
//        WebDriver driver2=new SafariDriver();
//        driver2.get("https://automationexercise.com/");
//        driver2.close();

//        WebDriverManager.operadriver().setup();
//        WebDriver driver3=new OperaDriver();
//        driver3.get("https://automationexercise.com/");
//        driver3.close();
//

    }
}
