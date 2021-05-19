package mobileTesting.demoAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class test {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "ASUS_X01AD");
		capability.setCapability("udid", "K7AAGF00580469P");
		capability.setCapability("platformName", "Android");
		capability.setCapability("platformVersion", "9");
		capability.setCapability("appPackage", "com.asus.calculator");
		capability.setCapability("appActivity", "com.asus.calculator.Calculator");
		
		URL url1 = new URL("http://127.0.0.1:4723/wd/hub");
//		URL url1 = new URL("http://localhost:4723");
		
		AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(url1, capability);
		for (int i=0; i<4;i++) {
			driver.findElement(By.id("com.asus.calculator:id/digit8")).click();
			driver.findElement(By.id("com.asus.calculator:id/plus")).click();
			driver.findElement(By.id("com.asus.calculator:id/digit5")).click();
			if (i==3)
				break;
			driver.findElement(By.id("com.asus.calculator:id/plus")).click();
		}
		
		
		driver.findElement(By.id("com.asus.calculator:id/equal")).click();
	}

}
