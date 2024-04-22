package appiumTest;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;

public class Test_Handle_Context_16 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("PlatformName", "Android");
		dc.setCapability("platformversion", "11");
		dc.setCapability("deviceName", "b161d2280508");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("app", "C:\\Users\\ASUS\\Downloads\\FbMessenger.apk");
		dc.setCapability("appWaitForLaunch", false);
		dc.setCapability("chromedriverExecutable","C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		URL url = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		AndroidDriver driver = new AndroidDriver(url, dc);

		Thread.sleep(6000);

		driver.findElement(ByAndroidUIAutomator.id("com.facebook.mlite:id/sso_switch_account_button")).click();

		Thread.sleep(6000);
		
		 String BeforWebView= driver.getContext();
		  System.out.println(BeforWebView);

		driver.findElement(ByAndroidUIAutomator.id("com.facebook.mlite:id/create_account_button")).click();

		Thread.sleep(3000);
		  
			/*
			 * driver.findElement(ByAndroidUIAutomator.androidUIAutomator
			 * ("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"WebView\"))"
			 * ));
			 */ 
		  
		  
		 // driver.findElement(ByAndroidUIAutomator.accessibilityId("WebView")).click();
		  

		  
		  Set<String> AfterWebView= driver.getContextHandles();
			 
			 for(String Newhandles : AfterWebView)
				 
			 {
				 System.out.println("AfterWebView context is : " + Newhandles);
				 
				 if (Newhandles.contentEquals("WEBVIEW_chrome")) {
					 
					 driver.context(Newhandles);
					 break;
					
				}
				 
				 
			 }
			 
			 Thread.sleep(6000);
			 
			
				 // driver.context("WEBVIEW_chrome");
				  
				  Thread.sleep(6000);
				  
				  String CurrentWebView=driver.getContext();
				  System.out.println("CurrentWebView context is : " + CurrentWebView);
				  
				  Thread.sleep(6000);
				  
					List<WebElement> web= driver.findElements(By.xpath("//div[@role='button']"));
					web.get(1).click();
					
					Thread.sleep(6000);
		 
		List<WebElement> ele= driver.findElements(By.xpath("//div[@aria-label='आगे बढ़ें']"));
		ele.get(0).click();
		Thread.sleep(6000);
	
		/*
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.id("i am a link"));
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.context("NATIVE_APP");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.navigate().back();
		 * 
		 * Thread.sleep(9000);
		 * 
		 * driver.findElement(ByAndroidUIAutomator.accessibilityId("WebView2")).click();
		 */
		
		//driver.close();
		
		//driver.removeApp("");

		driver.quit();

	}

}
