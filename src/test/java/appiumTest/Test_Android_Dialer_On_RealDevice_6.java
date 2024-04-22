package appiumTest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;

public class Test_Android_Dialer_On_RealDevice_6 {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("Platform", "Android");
		dc.setCapability("platformversion", "11");
		dc.setCapability("deviceName", "b161d2280508");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("appWaitForLaunch", false);
		dc.setCapability("appPackage","com.google.android.dialer");
		dc.setCapability("appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");
		
		URL url= URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		Thread.sleep(3000);
		
		driver.findElement(AppiumBy.accessibilityId("key pad")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(ByAndroidUIAutomator.accessibilityId("9,WXYZ")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(ByAndroidUIAutomator.accessibilityId("8,TUV")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"6,MNO\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.google.android.dialer:id/six")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(ByAndroidUIAutomator.accessibilityId("7,PQRS")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.google.android.dialer:id/four")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"0\"]")).click();
		
        Thread.sleep(3000);
		
		driver.findElement(ByAndroidUIAutomator.accessibilityId("2,ABC")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.google.android.dialer:id/three")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"7,PQRS\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(ByAndroidUIAutomator.accessibilityId("dial")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(AppiumBy.accessibilityId("End call")).click();
		
		
		Thread.sleep(9000);
		
		driver.quit();
		
		

	}

}
