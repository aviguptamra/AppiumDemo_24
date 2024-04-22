package appiumTest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumBy.ByAccessibilityId;
import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.AppiumBy.ById;
import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.bys.builder.AppiumByBuilder;


public class Test_Andoird_Calculator_On_RealDevice_5 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
	
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("Platform", "Android");
		dc.setCapability("platformversion","11");
		dc.setCapability("deviceName", "b161d2280508");
		dc.setCapability("automationName", "uiAutomator2");
		dc.setCapability("appPackage", "com.miui.calculator");
		dc.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		dc.setCapability("appWaitForLaunch", false);
		
		URL url= URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		Thread.sleep(6000);
		
		driver.findElement(ByAndroidUIAutomator.xpath("/hierarchy/android.widget.FrameLayout")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_5_s")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(ByAndroidUIAutomator.accessibilityId("multiply")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.miui.calculator:id/btn_2_s")).click();
		
		Thread.sleep(9000);
		
		driver.quit();
		
		
		
		

	}

}
