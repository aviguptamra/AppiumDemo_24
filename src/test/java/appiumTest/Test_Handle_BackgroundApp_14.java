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
import io.appium.java_client.appmanagement.ApplicationState;

public class Test_Handle_BackgroundApp_14 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("PlatformName", "Android");
		dc.setCapability("platformversion", "11");
		dc.setCapability("deviceName","b161d2280508");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("app", "C:\\Users\\ASUS\\Downloads\\APKPure_v3.19.7901_apkpure.com.apk");
		dc.setCapability("appWaitForLaunch", false);
		//dc.setCapability("fullReset", true);		
		URL url= URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		Thread.sleep(6000);
		
		 System.out.println(driver.queryAppState("com.apkpure.aegon"));//Run in Foreground
		    
		   // driver.runAppInBackground(Duration.ofSeconds(9));//back to the mobile device home screen and again come into the app and app should opened
		    
		    Thread.sleep(3000);
		    
		   driver.terminateApp("com.apkpure.aegon");//minimize the app and run in the background and app should opened
		   //("failed here") 
		   
		    Thread.sleep(9000);
		    
		    
		    
		    System.out.println(driver.queryAppState("com.apkpure.aegon"));//Run in Background
		    
		    Thread.sleep(9000);
		    
		    driver.activateApp("com.apkpure.aegon");//open the app and should be in background else exception
		    
		    Thread.sleep(9000);
		    
		    System.out.println(driver.queryAppState("com.facebook.mlite"));//Not running
		    
		    Thread.sleep(9000);
		   
		    System.out.println(driver.queryAppState("com.facebook.mlitssssse"));//Not Installed
		 
	   
	        Thread.sleep(9000);
		
	        driver.quit();
		
		

	}

}
