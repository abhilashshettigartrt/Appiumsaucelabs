import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Caps {
public static AndroidDriver<AndroidElement> Capabilities()  {
	AndroidDriver<AndroidElement> driver=null;	
	 String USERNAME = "abhilash19995";
	 String ACCESS_KEY = "8471ae92-4efe-4934-9b49-e2f1f034b25a";
	  String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	  
	try {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		File apps = new File("src");
		File app = new File(apps,"sauce-storage:Key.apk");
		
//			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Test");
			caps.setCapability("automationName", "Appium");
			 caps.setCapability("platformName", "Android");
			    caps.setCapability("deviceName", "Google Pixel GoogleAPI Emulator");
			    caps.setCapability("platformVersion", "7.0");
			    caps.setCapability("app", "sauce-storage:Key.apk");
			    caps.setCapability("deviceOrientation", "portrait");
			    caps.setCapability("appiumVersion", "1.7.2");
		//caps.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		//caps.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, "true");
		 driver = new AndroidDriver<>(new URL(URL),caps);
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 
		 return driver;
		} catch(MalformedURLException exception) {
			return null;
		} 	
		
	}
}
