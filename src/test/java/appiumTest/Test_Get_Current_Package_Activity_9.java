package appiumTest;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class Test_Get_Current_Package_Activity_9 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("Platform", "Android");
		dc.setCapability("platformversion", "11");
		dc.setCapability("deviceName", "Emulator");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("appWaitForLaunch", false);
		dc.setCapability("appPackage", "com.saucelabs.mydemoapp.rn");
		dc.setCapability("appActivity", "com.saucelabs.mydemoapp.rn.MainActivity");
		
		URL url= URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		Thread.sleep(6000);
		
		String getAppCurrentPackageName= driver.getCurrentPackage();
		System.out.println("getAppCurrentPackageName is : " + getAppCurrentPackageName);
		
		String getAppCurrentActivityName= driver.currentActivity();
		System.out.println("getAppCurrentActivityName is : " + getAppCurrentActivityName);
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
