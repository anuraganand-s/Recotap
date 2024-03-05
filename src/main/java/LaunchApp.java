import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class LaunchApp {

	public static void main(String[] args) throws MalformedURLException {
		UiAutomator2Options cap = new UiAutomator2Options();
		cap.setPlatformName("Android");
		cap.setAppPackage("in.hamleys.www");
		cap.setAppActivity("in.hamleys.www.SplashActivity");
		cap.setNoReset(true);
		cap.setAutoGrantPermissions(true);
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), cap);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		driver.close();
	}
}
