package appiumTest;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.Immutable;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;

public class Test_Handle_WebView_26 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("PlatformName", "Android");
		dc.setCapability("platformversion", "11");
		dc.setCapability("deviceName","Xiaomi 21061119BI");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("chromedriverExecutable","C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		dc.setCapability("appPackage", "com.lexa.fakegps");
		dc.setCapability("appActivity", "com.lexa.fakegps.ui.Main");
		dc.setCapability("appWaitForLaunch", false);
		
		URL url= URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		Thread.sleep(9000);
		
		driver.findElement(ByAndroidUIAutomator.accessibilityId("Open navigation drawer")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(ByAndroidUIAutomator.xpath("//android.widget.CheckedTextView[@resource-id=\"com.lexa.fakegps:id/design_menu_item_text\" and @text=\"FAQ\"]"))
        .click();
		
		Thread.sleep(3000);
		
         Set<String> AfterWebView= driver.getContextHandles();
		 
		 for(String Newhandles : AfterWebView)
			 
		 {
			 System.out.println("AfterWebView context is : " + Newhandles);
		 }
		 
		 Thread.sleep(3000);
		 
			
			  driver.context("WEBVIEW_chrome");
			  
			  Thread.sleep(3000);
			  
			  String CurrentWebView=driver.getContext();
			  System.out.println("CurrentWebView context is : " + CurrentWebView);
			  
			  Thread.sleep(6000);
			  
			  
			String Text=driver.findElement(By.xpath("//a[contains(text(),'One')]")).getText();
			System.out.println(Text);
			 
		
		Thread.sleep(3000);
        
        driver.quit();
        
      
	}

}
