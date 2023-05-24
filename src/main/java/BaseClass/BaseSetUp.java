package BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.*;
import static io.appium.java_client.remote.MobileCapabilityType.*;


public class BaseSetUp {
    public static AppiumDriver<MobileElement> driver;

    public static void setup() throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(PLATFORM_NAME, "Android");
            caps.setCapability(DEVICE_NAME, "RR8M50B5JNA");
            caps.setCapability(APP_PACKAGE, "com.pmaapp.ehashtag");
            caps.setCapability(APP_ACTIVITY, "com.pmaapp.ehashtag.MainActivity");
            caps.setCapability(NO_RESET, true);
            caps.setCapability(AUTO_GRANT_PERMISSIONS, true);

        URL url = new URL("http://localhost:4723/wd/hub");
            driver = new AndroidDriver<>(url, caps);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public static void teardown() {
            driver.quit();
    }

    public static void reset() {
        driver.resetApp();
    }

    public void click(By by) {
        MobileElement element = driver.findElement(by);
        element.click();
    }

    public void input(By by, String text) {
        MobileElement element = driver.findElement(by);
        element.sendKeys(text);
    }

    public void displayed(By by) {
        MobileElement element = driver.findElement(by);
        element.isDisplayed();
    }



}
