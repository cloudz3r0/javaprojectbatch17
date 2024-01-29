package class28;

import util.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester {
    public static void main(String[] args) throws IOException {
       String path="C:\\Users\\Ren7e\\IdeaProjects\\Java project\\Files\\Book1.xlsx";
       List<Map<String,String>> data= ExcelReader.readExcelData(path,"Sheet1");
        System.out.println(data);
    }
}
