package appiumTest;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;

public class Test_ScreenRecordingUsingAppium_18 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("PlatformName", "Android");
		dc.setCapability("platformversion", "11");
		dc.setCapability("deviceName","Emulator");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("app", "C:\\Users\\ASUS\\Downloads\\X_10.30.0-release.0_Apkpure.apk");
		dc.setCapability("appWaitForLaunch", false);
		
		URL url= URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		Thread.sleep(6000);
		
		driver.startRecordingScreen();
		AndroidStartScreenRecordingOptions opt=new AndroidStartScreenRecordingOptions();
		opt.withVideoSize("1260x740");
		opt.withTimeLimit(Duration.ofSeconds(36));
		
		
		List<WebElement> LoginScreenButton= driver.findElements(ByAndroidUIAutomator.id("com.twitter.android:id/ocf_button"));
		WebElement CreateAccount= LoginScreenButton.get(1);
		CreateAccount.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		driver.findElement(ByAndroidUIAutomator.id("com.twitter.android:id/name_edit_text")).sendKeys("ShriLaxmi");
		
		Thread.sleep(3000);
		
		driver.findElement(ByAndroidUIAutomator.id("com.twitter.android:id/name_edit_text")).clear();
		
		Thread.sleep(3000);
		
        driver.findElement(ByAndroidUIAutomator.id("com.twitter.android:id/phone_or_email_edit_text")).sendKeys("8882100990");
        
        Thread.sleep(3000);
        
        driver.findElement(ByAndroidUIAutomator.id("com.twitter.android:id/phone_or_email_edit_text")).clear();
		
		
        Thread.sleep(3000);
		
		driver.findElement(ByAndroidUIAutomator.id("com.twitter.android:id/phone_or_email_edit_text")).sendKeys("MahaLaxmi");
		
        Thread.sleep(3000);
        
        String Video= driver.stopRecordingScreen();
        byte[] decodeVideo= Base64.getDecoder().decode(Video);
        FileUtils.writeByteArrayToFile(new File("17March24.mp4"), decodeVideo);
        
		
        driver.findElement(ByAndroidUIAutomator.id("com.twitter.android:id/phone_or_email_edit_text")).sendKeys("9866740237");

        Thread.sleep(6000);
        
        driver.quit();

	}

}
