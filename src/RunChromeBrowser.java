import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.*;

public class RunChromeBrowser {
	private static Logger spectraLogger = LogManager.getLogger(RunChromeBrowser.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Quadri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selfcare.spectranet.com.ng/");
		spectraLogger.info("Page Opened Successfully");
		spectraLogger.error("Invalid account!");
		spectraLogger.debug("What could have gone wrong here?");

	}

}
