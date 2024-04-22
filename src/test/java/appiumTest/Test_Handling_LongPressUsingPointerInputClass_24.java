package appiumTest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;


public class Test_Handling_LongPressUsingPointerInputClass_24 {
	
	 static AndroidDriver driver;
	
	 public static void LongPres( WebElement ele)
 	
     {
     	
     Point WebElementLocation= ele.getLocation();
     System.out.println(WebElementLocation);
     
     PointerInput finger=new PointerInput(PointerInput.Kind.TOUCH,"finger1");
     
     Sequence longpress =new Sequence(finger, 1);
     
     longpress.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), WebElementLocation.getX(),WebElementLocation.getY()));
     longpress.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
     longpress.addAction(finger.createPointerMove(Duration.ofSeconds(6), PointerInput.Origin.viewport(), WebElementLocation.getX(),WebElementLocation.getY()));
     longpress.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
     
     driver.perform(Arrays.asList(longpress));
     

     }

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("Platform","Android");
		dc.setCapability("platformversion","11");
		dc.setCapability("deviceName", "Emulator");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("app", "C:\\Users\\ASUS\\Downloads\\ApiDemos-debug (2).apk");
		
		URL url= URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		driver=new AndroidDriver(url,dc);
		
		Thread.sleep(9000);
		
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		
		Thread.sleep(3000);

	     driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Fragment\"]")).click();

	     Thread.sleep(3000);

	    driver.findElement(AppiumBy.accessibilityId("Context Menu")).click();

        Thread.sleep(6000);

        WebElement LongPressbutton=driver.findElement(By.id("io.appium.android.apis:id/long_press"));
        
        Thread.sleep(3000);
        
       LongPres(LongPressbutton);
        
    	Thread.sleep(3000);
    	
    	driver.findElement(ByAndroidUIAutomator.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Menu B\"]")).click();
        
        Thread.sleep(9000);
		
		driver.quit();
		

	}
	
	

}
