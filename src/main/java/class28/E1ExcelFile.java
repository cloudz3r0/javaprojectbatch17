package class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Ren7e\\IdeaProjects\\Java project\\Files\\Book1.xlsx";
        //Class that brings data in the form of bytes into the memory. Bringing from permanent storage to RAM
        FileInputStream fis = new FileInputStream(path);
        //a class that handles excel files
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        //accessing the sheet  from the xlsx file
        Sheet sheet = workbook.getSheet("Sheet1");
        Row row = null;
        //iterate through each row
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {//make a loop for all rows in the excel file.
            //getting current rows one by one then placing them in row variable.
            row = sheet.getRow(i);
        //iterate through each cell/column in the current row
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                //print the value of each cell in the current cell followed by a space
                System.out.print(row.getCell(j) + " ");
            }
            System.out.println();
        }
    }
}

