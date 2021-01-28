package screenShotUtil;


	import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	
	
	
	public void takeSnapShot(WebDriver driver, String screenShotName) {

		try {

		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("./Snapshots/ " +screenShotName+ ".jpeg"));



		Thread.sleep(2000);
		System.out.println(" snap shot is taken of TestNg google Search");

		}catch(Exception e) {
		e.getStackTrace();
		}
		}}



	
	


