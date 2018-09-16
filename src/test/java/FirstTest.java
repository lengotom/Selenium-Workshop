import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	private static final String PAGE_URL = "http://newtours.demoaut.com";
	private static final String GECKODRIVER_PATH = "src/main/resources/drivers/geckodriver-v0.22.0-win64/geckodriver.exe";

	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", GECKODRIVER_PATH);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(PAGE_URL);
	}

	@Test
	public void firstTest() {
		String signOnLink = driver.findElement(By.linkText("SIGN-ON")).getText();
		assertEquals("Sign On Text Link Name is incorrect", "SIGN-ON", signOnLink);
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}