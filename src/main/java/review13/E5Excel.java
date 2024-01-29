package review13;

import util.ExcelReader;

import java.util.List;
import java.util.Map;

public class E5Excel {
    public static void main(String[] args) {
        List<Map<String,String>>data= ExcelReader.readExcelData("C:\\Users\\Ren7e\\IdeaProjects\\Java project\\Files\\Book1.xlsx","Sheet1");
        System.out.println(data);
    }
}
