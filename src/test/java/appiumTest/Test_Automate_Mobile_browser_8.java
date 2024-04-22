package appiumTest;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;

public class Test_Automate_Mobile_browser_8 {

	public static void main(String[] args) throws InterruptedException, IOException, ParseException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("Platform", "Android");
		dc.setCapability("platformversion", "11");
		dc.setCapability("deviceName", "b161d2280508");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("browserName", "Chrome");
		dc.setCapability("chromedriverExecutable", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        dc.setCapability("appWaitForLaunch", false);
        
      URL url=  URI.create("http://127.0.0.1:4723/wd/hub").toURL();
      AndroidDriver driver =new AndroidDriver(url,dc);
      
      Thread.sleep(3000);
      
      driver.get("https://www.youtube.com");
      
      Thread.sleep(3000);
      
      driver.findElement(AppiumBy.xpath("//div[@aria-label='Explore']")).click();
      
      Thread.sleep(9000);
      
      driver.quit();
        
        
        
        
        

		
        
      
	}

}
