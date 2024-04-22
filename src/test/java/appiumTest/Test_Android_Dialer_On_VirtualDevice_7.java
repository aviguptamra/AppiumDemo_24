	package appiumTest;
	
	import java.net.MalformedURLException;
	import java.net.URI;
	import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
	
	import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
	import io.appium.java_client.android.AndroidDriver;
	
	public class Test_Android_Dialer_On_VirtualDevice_7 {
	
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			// TODO Auto-generated method stub
			
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability("PlatformName", "Android");
			dc.setCapability("platformversion", "11");
			dc.setCapability("deviceName", "Emulator");
			dc.setCapability("automationName", "uiautomator2");
			dc.setCapability("appPackage", "com.android.dialer");
			dc.setCapability("appActivity", "com.android.dialer.main.impl.MainActivity");
			
			URL url= URI.create("http://127.0.0.1:4723/wd/hub").toURL();
			AndroidDriver driver=new AndroidDriver(url,dc);
			
			
			driver.findElement(ByAndroidUIAutomator.accessibilityId("key pad")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(ByAndroidUIAutomator.accessibilityId("9,WXYZ")).click();
			
			Thread.sleep(3000);
			
	        driver.findElement(ByAndroidUIAutomator.accessibilityId("8,TUV")).click();
			
			Thread.sleep(3000);
			
	       driver.findElement(ByAndroidUIAutomator.accessibilityId("6,MNO")).click();
			
			Thread.sleep(3000);
			
	       driver.findElement(ByAndroidUIAutomator.accessibilityId("6,MNO")).click();
			
			Thread.sleep(3000);
			
	       driver.findElement(ByAndroidUIAutomator.accessibilityId("7,PQRS")).click();
			
			Thread.sleep(3000);
			
	      driver.findElement(ByAndroidUIAutomator.accessibilityId("4,GHI")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(ByAndroidUIAutomator.accessibilityId("0")).click();
					
			Thread.sleep(3000);
					
		  driver.findElement(ByAndroidUIAutomator.accessibilityId("2,ABC")).click();
					
			Thread.sleep(3000);
					
		  driver.findElement(ByAndroidUIAutomator.accessibilityId("3,DEF")).click();
					
		   Thread.sleep(3000);
					
		  driver.findElement(ByAndroidUIAutomator.accessibilityId("7,PQRS")).click();
					
		   Thread.sleep(3000);
		   
		  driver.findElement(ByAndroidUIAutomator.accessibilityId("dial")).click();
		  
		  Thread.sleep(3000);
		  
          driver.findElement(ByAndroidUIAutomator.accessibilityId("End call")).click();
		  
		  Thread.sleep(3000);
					
			
		 driver.quit();
	
		}
	
	}
