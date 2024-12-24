package configFile;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    private static WebDriver driver;   //Webdriver is an interface. we define webdriver driver globally so we can use the driver everywhere

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver() throws IOException {
        //Read, Load, Retrive
        FileInputStream obj = new FileInputStream("C:\\Users\\dpate\\SeleniumFinalProject\\src\\test\\java\\env.properties"); //fileinputstream read env.pro file

        Properties prop = new Properties(); //properties works as a hashtable like key value pair. its a java class
        prop.load(obj);  //load

        String myBrowser = prop.getProperty("browser");
        System.out.println(myBrowser);//getProperty retrive value of the key //retrive browser
        String myurl = prop.getProperty("url"); //retrive url and storing in myurl
        System.out.println(myurl);
        //if statement for cross browser testing,
        // Explain cross browser testing: In Baseclass we used if else statement to test cross browser and env.properties we can set up the browser

        if (myBrowser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(myurl);
        }

        else if (myBrowser.equalsIgnoreCase("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();


    }

}

