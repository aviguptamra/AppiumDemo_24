
package appiumTest;


import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;



public class Install_Test_X_Android_APK_On_RealDevice_2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
	
	
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("Platform","Android");
		dc.setCapability("platformversion", "11");
		dc.setCapability("deviceName", "b161d2280508");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("appWaitForLaunch", false);
		dc.setCapability("app", "C:\\Users\\ASUS\\Downloads\\X_10.30.0-release.0_Apkpure.apk");
		//dc.setCapability("unicodeKeyboard", true);
		URL url= URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		AndroidDriver driver= new AndroidDriver(url,dc);
		
		Thread.sleep(6000);
		
		//driver.findElement(ByAndroidUIAutomator.accessibilityId("Cancel")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(ByAndroidUIAutomator.xpath
	    ("//android.widget.Button[@resource-id=\"com.twitter.android:id/ocf_button\" and @text=\"Create account\"]")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		driver.findElement(AppiumBy.id("com.twitter.android:id/name_edit_text")).sendKeys("ShriLaxmi");
		
		Thread.sleep(3000);
		
		driver.findElement(ByAndroidUIAutomator.id("com.twitter.android:id/phone_or_email_edit_text")).sendKeys("Laxmi@12345");
		
		Thread.sleep(9000);
		
		driver.quit();
		

	}

}
