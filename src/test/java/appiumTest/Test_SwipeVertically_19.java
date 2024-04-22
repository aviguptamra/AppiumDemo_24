
package appiumTest;


import java.io.IOException;
import java.lang.constant.DirectMethodHandleDesc.Kind;
import java.lang.reflect.Array;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.Set;

import javax.lang.model.util.Elements.Origin;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.Immutable;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;

public class Test_SwipeVertically_19 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("PlatformName", "Android");
		dc.setCapability("platformversion", "11");
		dc.setCapability("deviceName","Xiaomi 21061119BI");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		dc.setCapability("appWaitForLaunch", false);
		
		URL url= URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		Thread.sleep(6000);
		
		 driver.findElement(ByAndroidUIAutomator.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		
		Thread.sleep(3000);
		
		Dimension ScreenSize= driver.manage().window().getSize();
		System.out.println(ScreenSize);
		
		
		int StartX= ScreenSize.getWidth()/2;  
		System.out.println(StartX);
		
		int StartY= ScreenSize.getHeight()/2; 
		System.out.println(StartY);
		
		int EndX= StartX;
		System.out.println(EndX);
		
		int EndY= (int) (StartY* 0.10);
		System.out.println(EndY);
		
		
		PointerInput finger=new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		
		Sequence seq=new Sequence(finger, 1);
		seq.addAction(finger.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),StartX,StartY));
		seq.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		seq.addAction(finger.createPointerMove(Duration.ofMillis(200), PointerInput.Origin.viewport(), EndX,EndY));
		seq.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		
		driver.perform(Arrays.asList(seq));
		
		
		
		Thread.sleep(9000);
        
        driver.quit();
        
      
	}

}
