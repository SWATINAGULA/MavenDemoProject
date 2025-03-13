package com.CurahealthcareDataprovider;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
public class CuraDataProviderUsingExcel
{
	Object[][] dataStorage;
	@DataProvider
	public Object[][] getData()
	{
		try
		{
			FileInputStream fis=new FileInputStream("./Test Data/DemoExcel.xlsx");

			Workbook wb = WorkbookFactory.create(fis);

			Sheet sheet = wb.getSheet("CuraHealthcareSheet");

			Row row = sheet.getRow(1);

			int cellNum = row.getLastCellNum();

			int rowCount = sheet.getPhysicalNumberOfRows();
				
			dataStorage = new Object[rowCount][cellNum];

			for(int i =0; i<rowCount;i++)
			{
				Row row1 = sheet.getRow(i);
				for(int  j=0 ; j<cellNum; j++)
				{
					dataStorage[i][j] = row1.getCell(j).getStringCellValue();
				}

			}

		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		return dataStorage;

	}
}
