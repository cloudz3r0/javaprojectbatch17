package class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E3ExcelFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Ren7e\\IdeaProjects\\Java project\\Files\\Book1.xlsx";
        //Class that brings data in the form of bytes into the memory. Bringing from permanent storage to RAM
        FileInputStream fis = new FileInputStream(path);
        //a class that handles excel files
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        //accessing the sheet  from the xlsx file
        Sheet sheet = workbook.getSheet("EmpData");
        //a nested data structure that is going to hold all the info from the sheet
        List<Map<String, String>> bookListMap = new ArrayList<>();//storing all info from excel. each row creates a map.
        Row headerRow=sheet.getRow(0);//gets the keys. The values in first row.

        //starts at one bc we dont need the keys. Row 0 contains the keys.
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {//This loop goes through each row
            //like loops from before it gets the first values of each row.
            //like creating rows. 0,1,2,3,4. First one is John then goes through all the first names

            //getting current rows one by one then placing them in row variable.
            Row row = sheet.getRow(i);
            Map<String, String> rowMap = new LinkedHashMap<>();//creates a map to store the values



            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {//goes through all the values of each row
               String keyCell=headerRow.getCell(j).toString();//gets the header row and implements them into keys
               String valueCell=row.getCell(j).toString();//gets each value to be values.
//so each loop will give one of each. So first will be FirstName then its value. Keeps going one by one. Second will be
                //LastName then its value then keeps going until all values have keys.

               rowMap.put(keyCell,valueCell);//now we add all these into row Map.

            }
            bookListMap.add(rowMap);//Then we add the map into the List that we created.

        }
        System.out.println(bookListMap);

    }

}
