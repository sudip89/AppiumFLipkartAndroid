import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class OpenFlipKartAndroid {

	
public AndroidDriver<AndroidElement> adriver;	
	
	public AndroidDriver driver;	
	
	public void openapp(){
				
				
	//Comments Again
	System.out.println("Opening App");
	File app =new File(System.getProperty("user.dir")+"\\apks\\Flipkart-7.3.apk");
	DesiredCapabilities capabilities =new DesiredCapabilities();
	capabilities.setCapability("deviceName","AgdumBagdum");
	capabilities.setCapability(CapabilityType.BROWSER_NAME,"");
	capabilities.setCapability("platformVersion","10");
	capabilities.setCapability("platformName","Android");
	capabilities.setCapability("noReset","true");
	capabilities.setCapability("fullReset","false");
				
	capabilities.setCapability("appPackage","com.flipkart.android");
	capabilities.setCapability("appActivity","com.flipkart.android.activity.HomeFragmentHolderActivity");
	capabilities.setCapability("app", app.getAbsolutePath());		
		
	try {
		System.out.println("Opening App 1");
		adriver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities); 
	   } catch (MalformedURLException e) {

	e.printStackTrace();
					
	Assert.fail("Driver failed to start" + e.getMessage());
		}
	adriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);							
			}

	public static void main(String[] args) {
	
		OpenFlipKartAndroid openFlipKartAndroid=new OpenFlipKartAndroid();
		
		openFlipKartAndroid.openapp();

	}

}
