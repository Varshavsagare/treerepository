package Screencshot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EX_Parameter {
public static void main(String[] args) throws EncryptedDocumentException, IOException {

	
	FileInputStream f=new FileInputStream("C:\\Users\\vaibhav\\Desktop\\velocity\\new_EX_sheet.xlsx");
				Sheet sh = WorkbookFactory.create(f).getSheet("Sheet3");						

				int ce=sh.getRow(0).getLastCellNum();
//				System.out.println(i);

				for(int i=0;i<=ce-1;i++)
				{
					String st=sh.getRow(0).getCell(i).getStringCellValue();
					System.out.print(st+ " ");
				}

				





}

}
