package appiumTest;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Test_Handle_Permission_Popups_15 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("PlatformName", "Android");
		dc.setCapability("platformversion", "11");
		dc.setCapability("deviceName","Emulator");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("autoGrantPermissions", true);
		dc.setCapability("app", "C:\\Users\\ASUS\\Downloads\\APKPure_v3.19.7901_apkpure.com.apk");
		dc.setCapability("appWaitForLaunch", false);
		
		URL url= URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		Thread.sleep(18000);
		
        driver.quit();

	}

}
