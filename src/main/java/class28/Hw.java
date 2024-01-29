package class28;

import util.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Hw {/*
Create an excel file store some data inside it and read that data using the methods we have just created
*/

    public static void main(String[] args) throws IOException {
        String path=System.getProperty("user.dir")+"\\Files\\Sales.xlsx";
        List<Map<String,String>> data= ExcelReader.readExcelData(path);
        System.out.println(data);
    }
}
