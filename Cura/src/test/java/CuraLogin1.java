import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.CuraHealthCare.pom.LoginPage;
import com.CuraHealthCare.pom.Welcomepage;

public class CuraLogin1 {
	public static void main(String[] args) {

		try
		{
			FileInputStream fis=new FileInputStream("./Common Data/CuraProperty.properties");
			Properties property= new Properties();
			property.load(fis);
			String browser= property.getProperty("browser");
			String url= property.getProperty("url");
			String username= property.getProperty("username");
			String password= property.getProperty("password");

			WebDriver driver = null;
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("Edge"))
			{
				driver=new EdgeDriver();
			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get(url);

			Welcomepage welcome = new Welcomepage(driver);
			welcome.getAppointmentButton().click();	

			
			LoginPage login = new LoginPage(driver);
//			login.getUsername().sendKeys(username);
//
//			login.getPassword().sendKeys(password);
//			
//			login.getLoginBtn().click();
			
			login.loginToCuraHealth(username, password);
		}

		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}
}
