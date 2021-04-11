package Screencshot;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example9_readNumericDataAsASring {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\vaibhav\\Desktop\\velocity\\new_EX_sheet.xlsx");	
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
int i=	sh.getRow(0).getLastCellNum();
System.out.println(i);
		for(int j=0;j<=i-1;i++)
		{
	String data = sh.getRow(0).getCell(j).getStringCellValue();
	System.out.println(data);
		}
}
}