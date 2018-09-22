import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.easetech.easytest.annotation.Converters;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Parallel;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.loader.LoaderType;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import converters.UserConverter;
import pages.PageObjectManager;
import vo.User;


@RunWith(DataDrivenTestRunner.class)
@Converters({UserConverter.class})
@DataLoader(filePaths = {"src/test/resources/registrationUser.xml"}, loaderType = LoaderType.XML, writeData = false)
@Parallel(threads=3)
public class RegistrationTest {
	
	private static final String PAGE_URL = "http://newtours.demoaut.com";
	private static final String GECKODRIVER_PATH = "src/main/resources/drivers/windows/geckodriver-v0.22.0-win64/geckodriver.exe";

	private WebDriver driver;
	private PageObjectManager manager;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", GECKODRIVER_PATH);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(PAGE_URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		manager = new PageObjectManager(driver);
	}
		
	@Test
	public void registrationsTest(User user) {
		manager.getHomePage().clickOnRegisterLink();
		manager.getRegisterPage().inputContactInfo(user.getFirstName(), user.getLastName(), user.getPhone(), user.getEmail());
		manager.getRegisterPage().inputMailingInfo(user.getAddress1(), user.getAddress2(), user.getCity(), user.getState(), user.getPostalCode(), user.getCountry());
		manager.getRegisterPage().inputUserInfo(user.getUserName(), user.getPassword());
		manager.getRegisterPage().submitRegisterForm();
		assertTrue(manager.getRegisteredUserPage().verifyLoggedStatus());
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
