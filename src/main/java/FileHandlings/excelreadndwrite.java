package FileHandlings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelreadndwrite {
	
	String filepath="C:\\Users\\sathishkumar\\eclipse-workspace\\Ravi80clockonlineJavaSelenium\\input\\Inputdata.xls";
	String fileoutpath="C:\\Users\\sathishkumar\\eclipse-workspace\\Ravi80clockonlineJavaSelenium\\input\\Outputdata1.xls";
	
	public void readdata() throws IOException
	{
		File F = new File(filepath);
		FileInputStream FI=new FileInputStream(F);
		HSSFWorkbook workbook = new HSSFWorkbook(FI);
		//XSSFWorkbook workbook= new XSSFWorkbook(FI);
		Sheet sheet=workbook.getSheet("input");
		int totalrows=sheet.getPhysicalNumberOfRows();
		for (int i=0;i<totalrows;i++)
		{
			Row row=sheet.getRow(i);
			int columnvalue= row.getLastCellNum();
			for(int y=0;y<columnvalue;y++)
			{
				Cell cellvalue=row.getCell(y);
				getvalue(cellvalue);
				System.out.print(" ");
			}
			System.out.println();
		}
		//workbook.getSheetAt(0);
	}
	
	public Object getvalue(Cell cellvalue)
	{
		Object value = null;
		switch(cellvalue.getCellType())
		{
		case STRING:
			value=cellvalue.getStringCellValue();
			System.out.print(value);
			break;
		case NUMERIC:
			value=cellvalue.getNumericCellValue();
			System.out.print(value);
			break;
		
			
		}
		return value;
	}

	public void writedata() throws IOException
	{
		String[] course = {"python","java","sql","C#"};
		File F = new File(fileoutpath);
		FileOutputStream FO=new FileOutputStream(F);
		HSSFWorkbook workbook = new HSSFWorkbook();
		Sheet sheet=workbook.createSheet("Outdata");
		int valuesize=course.length;
		Row row=sheet.createRow(0);
		for(int i=0;i<valuesize;i++)
		{
			
			Cell cell=row.createCell(i);
			cell.setCellValue(course[i]);
		}
		workbook.write(FO);
		workbook.close();
		FO.close();
		
		System.out.println("Done");
	}
	
	public void readandwritetogther() throws IOException
	{
		File F = new File(filepath);
		FileInputStream FI=new FileInputStream(F);
		HSSFWorkbook workbook = new HSSFWorkbook(FI);
		//XSSFWorkbook workbook= new XSSFWorkbook(FI);
		File outF = new File(fileoutpath);
		FileOutputStream FO=new FileOutputStream(outF);
		HSSFWorkbook outworkbook = new HSSFWorkbook();
		Sheet outsheet=outworkbook.createSheet("Outdata");
		
		Sheet sheet=workbook.getSheet("input");
		int totalrows=sheet.getPhysicalNumberOfRows();
		for (int i=0;i<totalrows;i++)
		{
			Row row=sheet.getRow(i);
			Row outrow=outsheet.createRow(i);
			int columnvalue= row.getLastCellNum();
			
			for(int y=0;y<columnvalue;y++)
			{
				Cell cellvalue=row.getCell(y);
				Cell outcellvalue=outrow.createCell(y);
				//Object val=getvalue(cellvalue);
				outcellvalue.setCellValue(getvalue(cellvalue).toString());
			}
		}
		outworkbook.write(FO);
		outworkbook.close();
		FO.close();
		
		System.out.println("Done");
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		excelreadndwrite e =new excelreadndwrite();
		e.readandwritetogther();
	}

}
