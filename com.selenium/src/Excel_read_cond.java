import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read_cond 
{	public static XSSFSheet sheet;
	
	public static String getCellValues(int row,int col)
{
	XSSFRow r=sheet.getRow(row);
	XSSFCell c=r.getCell(col);
	String a=c.getStringCellValue();
	return a;
}
	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream fis =new FileInputStream("C:/Users/jigar.desai/Downloads/Test.xlsx");
		XSSFWorkbook book =new XSSFWorkbook(fis);
		sheet= book.getSheetAt(0);
	//	XSSFRow r = sheet.get
		
		XSSFRow r = sheet.getRow(0);
	//	int rows=sheet.getPhysicalNumberOfRows();
		int row = sheet.getLastRowNum();
		System.out.println("Number of Rows"+row);
		
		int col = r.getLastCellNum();
		System.out.println("Number of Col "+col);
		for(int i=1; i<=row;i++)
		{
			for(int j = 0;j<col-1;j++)
			{
			String action=getCellValues(i,4);
			switch(action)
			{
				case"y":
					System.out.print(sheet.getRow(i).getCell(j));
					System.out.print("||");

				break;
				case "n":
					break;
					
				case "s":
					break;
			}
			}
			System.out.println();
	}
	}
}
