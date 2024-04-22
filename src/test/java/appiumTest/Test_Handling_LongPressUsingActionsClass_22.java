package appiumTest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;

public class Test_Handling_LongPressUsingActionsClass_22 {

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
		
		Thread.sleep(9000);
		
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		
		Thread.sleep(3000);

	     driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Fragment\"]")).click();

	     Thread.sleep(3000);

	    driver.findElement(AppiumBy.accessibilityId("Context Menu")).click();

        Thread.sleep(3000);

        WebElement LongPress=driver.findElement(By.id("io.appium.android.apis:id/long_press"));
        
        Thread.sleep(3000);
        
        Actions act=new Actions(driver);
        act.clickAndHold(LongPress).perform();
        
        Thread.sleep(9000);
		
		driver.quit();
		

	}

}
