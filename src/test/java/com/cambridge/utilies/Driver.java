package com.cambridge.utilies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
private Driver(){
}
private static InheritableThreadLocal<WebDriver> driverPool =new InheritableThreadLocal<>();

public static WebDriver getDriver(){
if (driverPool.get()==null){
    String browserType = System.getProperty("browser") != null ? System.getProperty("browser") : ConfigurationReader.getProperty("browser");

            /*
            Depending on the browserType that will be return from configuration.properties file
            switch statement will determine the case, and open the matching browser
            */

    switch (browserType) {
        case "chrome":
            WebDriverManager.chromedriver().setup();
            driverPool.set(new ChromeDriver());
            driverPool.get().manage().window().maximize();
            driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            break;
        case "chrome-headless":
            WebDriverManager.chromedriver().setup();
            driverPool.set(new ChromeDriver(new ChromeOptions().setHeadless(true)));
            break;
        case "firefox":
            WebDriverManager.firefoxdriver().setup();
            driverPool.set(new FirefoxDriver());
            driverPool.get().manage().window().maximize();
            driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            break;

}
}
return driverPool.get();

}
    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit();//this line will terminate the existing session. value will not be null
            driverPool.remove();
        }
    }
}
