
package appiumTest;


import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Test_SwipeHorizontal_20 {
	
	
	
	
	
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		String appiumserviceUrl="http://127.0.0.1:4723/wd/hub";
		
		AppiumDriverLocalService appiumservice=AppiumDriverLocalService.buildDefaultService();
		appiumservice.start();
		boolean isRunning = appiumservice.isRunning();
		System.out.println(isRunning);
		
		appiumserviceUrl=appiumservice.getUrl().toString();
		System.out.println("appiumserviceUrl is : " + appiumserviceUrl);
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("PlatformName", "Android");
		dc.setCapability("platformversion", "11");
		dc.setCapability("deviceName","b161d2280508");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("appPackage", "com.google.android.apps.messaging");
		dc.setCapability("appActivity", "com.google.android.apps.messaging.ui.ConversationListActivity");
		//dc.setCapability("unicodeKeyboard", true);
		dc.setCapability("appWaitForLaunch", false);
		
		
		 AndroidDriver driver=new AndroidDriver(new URL(appiumserviceUrl),dc);
		
		Thread.sleep(6000);
		
		Dimension ScreenSize = driver.manage().window().getSize();
		System.out.println("Screen Width is : " + ScreenSize.getWidth());
		System.out.println("Screen Height is : " + ScreenSize.getHeight());
		
		 int StartX=ScreenSize.getWidth()/2;
		 System.out.println("StartX is : " + StartX);
		 
		 int StartY=ScreenSize.getHeight()/2;
		 System.out.println("StartY is : " + StartY);
		
		 int EndX= (int)  (ScreenSize.getWidth()*0.25);
		 System.out.println("EndX is : " + EndX);
		 int EndY= StartY;
		 System.out.println("EndY is : " + EndY);
		 
		 PointerInput finger=new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		 
		 Sequence seq=new Sequence(finger, 1);
		 seq.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(),StartX,StartY));
		 seq.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		 seq.addAction(finger.createPointerMove(Duration.ofMillis(100),PointerInput.Origin.viewport(), EndX,EndY));
		 seq.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		 
		 driver.perform(Arrays.asList(seq));
		
		
		Thread.sleep(9000);
        
        driver.quit();
        
        appiumservice.stop();
        
        boolean AfterStopisRunning = appiumservice.isRunning();
		System.out.println(AfterStopisRunning);
        
      
	}

}
