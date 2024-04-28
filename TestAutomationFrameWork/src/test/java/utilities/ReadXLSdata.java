package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadXLSdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {//this method is last inthis sheet
		ReadXLSdata red = new ReadXLSdata();
		red.getData("login"); 

	}
	public String[][] getData(String excelsheetname) throws EncryptedDocumentException, IOException {  //here we need to mention read excel sheet name
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\testdata.xlsx"); //to find excel sheet location
		FileInputStream fis = new FileInputStream(f); //this is another class, to read the file 
		Workbook wb =  WorkbookFactory.create(fis); //select create input stream
		Sheet sheetName = wb.getSheet(excelsheetname);//select sheetName method
		
		int totalRows = sheetName.getLastRowNum(); // To KNOW LAST row no in sheet
		System.out.println(totalRows);
		Row rowCells = sheetName.getRow(0); 
		int totalCols = rowCells.getLastCellNum();
		System.out.println(totalCols); //total Columns   
		
		DataFormatter format = new DataFormatter(); //dataformatter class is used for while pick the data from excel sheet it will be int or string or boolean we should formated   and displayed in script.
		String testData[][] = new String[totalRows][totalCols]; //this test data created as local varible with two dimention array.
	    for (int i = 1; i<=totalRows; i++) {
	    	for (int j = 0; j<totalCols; j++) {
	    		testData[i-1][j]=format.formatCellValue(sheetName.getRow(i).getCell(j)); //we need to creat a local variable for testdata
				System.out.println(testData[i-1][j]);
			}
			
		}
	    return testData;
	
	
	
	}

}
