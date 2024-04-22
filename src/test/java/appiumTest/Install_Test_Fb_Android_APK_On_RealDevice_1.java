package appiumTest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;

public class Install_Test_Fb_Android_APK_On_RealDevice_1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
      DesiredCapabilities dc=new DesiredCapabilities();
      dc.setCapability("Platform", "Android");
      dc.setCapability("platformversion", "11");
      dc.setCapability("deviceName", "Xiaomi 21061119BI");
      dc.setCapability("automationName", "uiautomator2");
      dc.setCapability("app", "C:\\Users\\ASUS\\Downloads\\FbMessenger.apk");
      dc.setCapability("appWaitForLaunch", false);
      
      URL url= URI.create("http://127.0.0.1:4723/wd/hub").toURL(); 
      AndroidDriver driver=new AndroidDriver(url,dc);
      
      Thread.sleep(3000);
      
      driver.findElement(ByAndroidUIAutomator.id("com.facebook.mlite:id/sso_switch_account_button")).click();
      
      Thread.sleep(3000);

      driver.findElement(ByAndroidUIAutomator.accessibilityId("Email or phone number")).sendKeys("appium@gmail.com");
      
      Thread.sleep(3000);
      
      driver.findElement(AppiumBy.accessibilityId("Password")).sendKeys("appium@1234");
      
      Thread.sleep(3000);
      
      driver.findElement(By.id("com.facebook.mlite:id/login_login_button")).click();
      
      Thread.sleep(9000);
      
      driver.quit();
      

		
		
		
	

	}

}
