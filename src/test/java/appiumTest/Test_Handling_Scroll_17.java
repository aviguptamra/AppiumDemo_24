package appiumTest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;

public class Test_Handling_Scroll_17 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("Platform","Android");
		dc.setCapability("platformversion","11");
		dc.setCapability("deviceName", "Emulator");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("app", "C:\\Users\\ASUS\\Downloads\\ApiDemos-debug (2).apk");
		
		URL url= URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		driver.findElement(ByAndroidUIAutomator.accessibilityId("Views")).click();
		
		Thread.sleep(3000);
        
       WebElement Visibility= driver.findElement(ByAndroidUIAutomator.androidUIAutomator
       ("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Visibility\"))"));
        
        
        Visibility.click();
        
        Thread.sleep(9000);
		
		driver.quit();
		

	}

}
