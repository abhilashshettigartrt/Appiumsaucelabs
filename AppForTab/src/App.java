import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class App extends Caps {
	AndroidDriver<AndroidElement> driver = Capabilities();

	@Test
	public void DownloadContent() throws MalformedURLException {

		driver.findElementById("com.keysight.keysightpartnerapps:id/md_buttonDefaultPositive").click();
		driver.findElementById("com.keysight.keysightpartnerapps:id/btn_download").click();

	}

	@Test
	public void HardwareMenu() {
		AndroidElement Hardware = driver.findElementByXPath("//android.widget.TextView[@text='DATA']");
		Assert.assertEquals("1. Hardware", Hardware.getText(), "The Menu is Matched");
		Hardware.click();
		System.out.println("Hardware Page");
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"PXI Products & Solutions\").instance(0))");
		driver.findElementByXPath("//android.widget.TextView[@text='PXI Products & Solutions']").click();
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"PXI Vector Network Analyzers\").instance(0))");
		driver.findElementByXPath("//android.widget.TextView[@text='PXI Vector Network Analyzers']").click();
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"M9375A\").instance(0))");
		driver.findElementByXPath("//android.widget.TextView[@text='M9375A']").click();

		AndroidElement ProductTitle = driver.findElementById("com.keysight.keysightpartnerapps:id/txt_title");
		Assert.assertEquals("PXI Vector Network Analyzers", ProductTitle.getText(), "The title is Matched");

		System.out.println("Product page");

		// Getting sales Tab
		driver.findElementById("com.keysight.keysightpartnerapps:id/btn_product_option").click();// 'i' clicking on
																									// button
		driver.findElementByXPath("//android.widget.TextView[@text='Sales Tips']").click();
		AndroidElement saleHeader = driver.findElementById("com.keysight.keysightpartnerapps:id/txt_header");
		Assert.assertEquals("Sales Tips", saleHeader.getText(), "The title is Matched");
		System.out.println("sales");
		// Getting Video tab
		driver.findElementById("com.keysight.keysightpartnerapps:id/btn_product_option").click();// 'i' clicking on
																									// button
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Videos\").instance(0))");
		driver.findElementByXPath("//android.widget.TextView[@text='Videos']").click();
		AndroidElement video = driver.findElementById("com.keysight.keysightpartnerapps:id/txt_header");
		Assert.assertEquals("Videos", video.getText(), "The title is Matched");
		System.out.println("video");
		driver.findElementByAccessibilityId("Open").click();
		driver.findElementById("com.keysight.keysightpartnerapps:id/txt_name").click();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")
				.click();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout")
				.click();
		driver.findElementById("android:id/search_bar").sendKeys("Third rock");
		driver.findElementById("com.keysight.keysightpartnerapps:id/txt_name").click();
		driver.pressKeyCode(AndroidKeyCode.BACK);
	}

	@Test
	public void Tour() {
		System.out.println("appium");
		driver.findElementByAccessibilityId("Open").click();
		driver.findElementById("com.keysight.keysightpartnerapps:id/txt_name").click();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")
				.click();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout")
				.click();
		driver.findElementById("android:id/search_bar").sendKeys("Third rock");
		driver.findElementById("com.keysight.keysightpartnerapps:id/txt_name").click();

	}

	@Test
	public void TechMenu() {
		driver.pressKeyCode(AndroidKeyCode.BACK);
		System.out.println("Tech Page");
		AndroidElement Tech = driver
				.findElementByXPath("//android.widget.TextView[@text='2. Industries & Technologies']");
		Assert.assertEquals("2. Industries & Technologies", Tech.getText(), "The Menu is Matched");
		driver.quit();
	}

}
