import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class OpenWebBrowser {

	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions(); //
		// options.addArguments("-incognito");
		options.addArguments("--disable-popup-blocking");

		// DesiredCapabilities caps = DesiredCapabilities.chrome();
		// caps.setCapability("chrome.switches", Arrays.asList("--disable-javascript"));

		driver = new ChromeDriver(options);

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");

		// driver.get("https://www.redbus.com/");
		// driver.findElement(By.id("go")).click();

		driver.findElement(By.id("src")).click();
		driver.findElement(By.id("src")).sendKeys("Mumbai (All Locations)");
		driver.findElement(By.id("src")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("dest")).click();
		driver.findElement(By.id("dest")).sendKeys("Pune (All Locations)");
		driver.findElement(By.id("dest")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='fl search-box date-box gtm-onwardCalendar']")).click();
		String month = "Apr 2019";
		String date = "28";
		String getMonth = driver.findElement(By.xpath("//div[@class='rb-calendar']//td[@class='monthTitle']"))
				.getText();
		System.out.println(getMonth);
		try {
			while (true) {
				if (!(getMonth.equalsIgnoreCase(month))) {
					driver.findElement(By.xpath("//div[@class='rb-calendar']/*//td[@class='next']")).click();
					break;
				}
			}
			driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody//td[text()='" + month
					+ "']/../..//td[text()='" + date + "']")).click();
		} catch (Exception e) {
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@class='button view-seats fr']")).click();
	}
}

/*
 * ChromeOptions options = new ChromeOptions(); //
 * options.addArguments("-incognito");
 * options.addArguments("--disable-popup-blocking");
 * 
 * DesiredCapabilities caps = DesiredCapabilities.chrome();
 * caps.setCapability("chrome.switches", Arrays.asList("--disable-javascript"));
 * 
 * driver = new ChromeDriver(options);
 * 
 * System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
 * 
 * 
 * driver.manage().deleteAllCookies(); driver.manage().window().maximize();
 * 
 * driver.get("https://www.redbus.in/");
 * 
 * // driver.get("https://www.redbus.com/"); //
 * driver.findElement(By.id("go")).click();
 * 
 * driver.findElement(By.id("src")).click();
 * driver.findElement(By.id("src")).sendKeys("Mumbai (All Locations)");
 * driver.findElement(By.id("src")).click(); Thread.sleep(1000);
 * 
 * driver.findElement(By.id("dest")).click();
 * driver.findElement(By.id("dest")).sendKeys("Pune (All Locations)");
 * driver.findElement(By.id("dest")).click(); Thread.sleep(1000);
 * 
 * // driver.findElement(By.id("onward_cal")).getAttribute("data-caleng");
 * JavascriptExecutor js = (JavascriptExecutor) driver; js.
 * executeScript("document.getElementById('onward_cal').setAttribute('data-caleng', '18-Mar-2019')"
 * );
 * 
 * // ((JavascriptExecutor)driver).executeScript
 * ("document.getElementById('onward_cal').removeAttribute('readonly',0);"); //
 * WebElement OnwardDate= driver.findElement(By.id("onward_cal")); //
 * OnwardDate.clear(); // OnwardDate.sendKeys("18-Mar-2019"); // //
 * ((JavascriptExecutor)driver).executeScript
 * ("document.getElementById('return_cal').removeAttribute('readonly',0);"); //
 * WebElement ReturnDate= driver.findElement(By.id("return_cal")); //
 * ReturnDate.clear(); // ReturnDate.sendKeys("28-Mar-2019");
 * 
 * driver.findElement(By.id("search_btn")).click(); Thread.sleep(1000);
 * 
 * // List<WebElement> listOfElements =
 * driver.findElements(By.xpath(".//div[@class=bus-items]")); // driver.quit();
 * } }
 */