package appiumTest;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Test_Install_Uninstall_App_UsingAppium_12 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("PlatformName", "Android");
		dc.setCapability("platformversion", "11");
		dc.setCapability("deviceName","Emulator");
		dc.setCapability("automationName", "uiautomator2");
		//dc.setCapability("app", "C:\\Users\\ASUS\\Downloads\\FbMessenger.apk");
		dc.setCapability("appWaitForLaunch", false);
		
		URL url= URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		Thread.sleep(6000);
		

		boolean Verify_Is_App_Installed1= driver.isAppInstalled("small.size");
		System.out.println(Verify_Is_App_Installed1);//false
		
		driver.installApp("C:\\Users\\ASUS\\Downloads\\Small Size_2_Apkpure.apk");//install the app
		
		boolean Verify_Is_App_Installed2= driver.isAppInstalled("small.size");
		System.out.println(Verify_Is_App_Installed2);//true
		
		driver.removeApp("small.size");//uninstall the app
		
		boolean Verify_Is_App_Installed3= driver.isAppInstalled("small.size");
		System.out.println(Verify_Is_App_Installed3);//false
		
		Thread.sleep(3000);
		
        driver.quit();

	}

}
