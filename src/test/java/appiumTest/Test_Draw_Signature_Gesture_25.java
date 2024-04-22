
package appiumTest;


import java.io.IOException;
import java.lang.constant.DirectMethodHandleDesc.Kind;
import java.lang.reflect.Array;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.Set;

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

public class Test_Draw_Signature_Gesture_25 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("PlatformName", "Android");
		dc.setCapability("platformversion", "11");
		dc.setCapability("deviceName","Emulator");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("app", "C:\\Users\\ASUS\\Downloads\\Android-MyDemoAppRN.1.3.0.build-244.apk");
		dc.setCapability("appWaitForLaunch", false);
		
		URL url= URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		Thread.sleep(6000);
		
		driver.findElement(ByAndroidUIAutomator.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]/android.widget.ImageView")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(ByAndroidUIAutomator.accessibilityId("menu item drawing")).click();
		
		Thread.sleep(3000);
		
		WebElement DrawingPanel=driver.findElement(ByAndroidUIAutomator.xpath("//android.webkit.WebView"));
		
		Point point= DrawingPanel.getLocation();
		System.out.println(point.x);//55
		System.out.println(point.y);//491
		System.out.println(point);
		
		
		Dimension size= DrawingPanel.getSize();
		
		int Width =size.getWidth();//970
		int Height =size.getHeight();//1474
		System.out.println(Width);
		System.out.println(Height);
		System.out.println(size);
		
		
		
		int StartX=(point.x + (size.getWidth()/2));
		System.out.println(StartX);
		
		int StartY= (point.y+50 + (size.getHeight()/2));
		System.out.println(StartY);
		
		int endX=StartX;
		System.out.println(endX);
		
		int endY=(int) (point.y+size.getHeight());
		System.out.println(endY);
		
		//pointerinput class to create sequence of action	
		PointerInput finger1 =new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		
		Sequence sequence=new Sequence(finger1, 1);
		sequence.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), StartX,StartY));
		sequence.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		sequence.addAction(finger1.createPointerMove(Duration.ofMillis(200), PointerInput.Origin.viewport(), endX,endY));
		sequence.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		
		driver.perform(Arrays.asList(sequence));
		
		
		
		Thread.sleep(9000);
        
        driver.quit();
        
      
	}

}
