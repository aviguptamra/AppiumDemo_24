package appiumTest;

import java.io.IOException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Test_Handle_Mobile_ScreenOrientation_11 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("PlatformName", "Android");
		dc.setCapability("platformversion", "11");
		dc.setCapability("deviceName","b161d2280508");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("app", "C:\\Users\\ASUS\\Downloads\\android.wdio.native.app.v1.0.8.apk");
		dc.setCapability("appWaitForLaunch", false);
		
		URL url= URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		Thread.sleep(6000);
		
		ScreenOrientation Default_CurrentScreenOrientation= driver.getOrientation();
		System.out.println(Default_CurrentScreenOrientation);
		
		Thread.sleep(3000);
		
		driver.rotate(ScreenOrientation.LANDSCAPE);
		
		Thread.sleep(3000);
		
		ScreenOrientation ChangeFirstTime_CurrentScreenOrientation= driver.getOrientation();
		System.out.println(ChangeFirstTime_CurrentScreenOrientation);
		
		Thread.sleep(3000);
		
		driver.rotate(ScreenOrientation.PORTRAIT);
		
		Thread.sleep(3000);
		
		ScreenOrientation ChangeSecondTime_CurrentScreenOrientation= driver.getOrientation();
		System.out.println(ChangeSecondTime_CurrentScreenOrientation);
		
		

	}

}
