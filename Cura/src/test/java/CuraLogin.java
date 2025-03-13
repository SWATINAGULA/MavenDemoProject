import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CuraLogin {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		try
		{
			FileInputStream fis=new FileInputStream("./Common Data/CuraProperty.properties");

			Properties property= new Properties();

			property.load(fis);

			String browser= property.getProperty("browser");
			String url= property.getProperty("url");
			String username= property.getProperty("username");
			String password= property.getProperty("password");

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


			driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			driver.findElement(By.xpath(" //button[@id='btn-login' or text()='Login']")).click();


			FileInputStream fis2=new FileInputStream("./Test Data/DemoExcel.xlsx");

			Workbook wb = WorkbookFactory.create(fis2);

			Sheet sheet = wb.getSheet("CuraHealthcareSheet");

			//	Cell commonCell = row.getCell(1);

			//	String comment=commonCell.getStringCellValue();

			int rowNum = sheet.getLastRowNum();
			for(int i=1; i<=rowNum ; i++)
			{
				Row row = sheet.getRow(i);
				String date = row.getCell(0).getStringCellValue();

				String comment = row.getCell(1).getStringCellValue();


				driver.findElement(By.xpath("//input[@name='visit_date' and @id='txt_visit_date']")).sendKeys(date);
				driver.findElement(By.xpath("//textarea[@id='txt_comment' and @name='comment']")).sendKeys(comment);

			}
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
