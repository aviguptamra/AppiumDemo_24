package appiumTest;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;

public class Test_Handle_Cache_APP_Install_10 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("Platform", "Android");
		dc.setCapability("platformversion", "11");
		dc.setCapability("deviceName", "Emulator");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("appWaitForLaunch", false);
		dc.setCapability("app", "C:\\Users\\ASUS\\Downloads\\APKPure_v3.19.7901_apkpure.com.apk");
		//dc.setCapability("noReset", true);//do not clear the cache
		dc.setCapability("fullReset", false);// do not install the app again if it is installed and if fullReste value is true then always uninstall the app after test
		
		URL url= URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		Thread.sleep(9000);
		
		driver.quit();

	}

}
