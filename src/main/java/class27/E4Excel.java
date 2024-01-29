package class27;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E4Excel {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Ren7e\\IdeaProjects\\Java project\\Files\\Book1.xlsx";
        FileInputStream fis = new FileInputStream(path);
        //a class that handles excel files
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
       //acessign the sheet  from the xlsx file
        Sheet sheet = workbook.getSheet("Sheet1");
        Row row = sheet.getRow(1);
        Cell cell = row.getCell(2);
        System.out.println(cell);
    }
}
