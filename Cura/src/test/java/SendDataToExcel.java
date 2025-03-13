import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SendDataToExcel {
	public static void main(String[] args) 
	{
		//To write into or override in excel from selenium	

		//		try
		//		{
		//			FileInputStream fis=new FileInputStream("./Test Data/DemoExcel.xlsx");
		//
		//			Workbook wb = WorkbookFactory.create(fis);
		//
		//			Sheet sheet = wb.getSheet("CuraHealthcareSheet");
		//
		//			Row row=sheet.getRow(1);
		//
		//			Cell cell = row.getCell(1);
		//
		//
		//			cell.setCellValue("Demo text");
		//
		//			FileOutputStream fos= new FileOutputStream("./Test Data/DemoExcel.xlsx");
		//
		//			wb.write(fos);
		//
		//
		//			wb.close();
		//
		//		}

		// To create new sheet and write data into excel from selenium

		try
		{
			FileInputStream fis=new FileInputStream("./Test Data/DemoExcel.xlsx");

			Workbook wb = WorkbookFactory.create(fis);
			//
			//			Sheet newSheet=wb.createSheet("Marco");
			//
			//			Row newRow = newSheet.createRow(1);
			//
			//			Cell newCell = newRow.createCell(0);
			//	newCell.setCellValue("kaliya");

			Sheet newSheet=wb.getSheet("Marco");

			Row newRow = newSheet.createRow(0);

			Cell newCell = newRow.createCell(0);

			//newCell.setCellType(CellType.STRING);//not using now


			newCell.setCellValue("swati");

			FileOutputStream fos = new FileOutputStream("./Test Data/DemoExcel.xlsx");


			wb.write(fos);
			wb.close();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
