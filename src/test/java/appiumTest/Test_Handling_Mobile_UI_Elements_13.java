package appiumTest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;

public class Test_Handling_Mobile_UI_Elements_13 {

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
		
		Thread.sleep(6000);
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		Thread.sleep(3000);
		
		WebElement Controls= driver.findElement(ByAndroidUIAutomator.androidUIAutomator
		("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Controls\"))"));
		
		Controls.click();
		
		Thread.sleep(3000);
		
		List<WebElement> LightTheme= driver.findElements(By.id("android:id/text1"));
		LightTheme.get(0).click();
		
		Thread.sleep(3000);
		
		List<WebElement> Checkbox= driver.findElements(ByAndroidUIAutomator.className("android.widget.CheckBox"));
		Checkbox.get(1).click();
		
		Thread.sleep(3000);
		
		driver.findElement(ByAndroidUIAutomator.xpath("//android.widget.RadioButton[@content-desc=\"RadioButton 2\"]")).click();
		
		Thread.sleep(9000);
		
		driver.quit();
		
		

	}

}
