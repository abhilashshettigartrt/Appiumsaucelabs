
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.URL;

public class SampleSauceTest {

  public static final String USERNAME = "abhilash19995";
  public static final String ACCESS_KEY = "***************************************";
  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

  public static void main(String[] args) throws Exception {

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("automationName", "Appium");
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("deviceName", "Google Pixel GoogleAPI Emulator");
    capabilities.setCapability("platformVersion", "7.0");
    capabilities.setCapability("app", "sauce-storage:Key.apk");
    capabilities.setCapability("deviceOrientation", "portrait");
    capabilities.setCapability("appiumVersion", "1.7.2");

    AndroidDriver<AndroidElement>  driver = new AndroidDriver<>(new URL(URL), capabilities);

    /**
     * Test Actions here...
     */

    driver.quit();
  }
}
