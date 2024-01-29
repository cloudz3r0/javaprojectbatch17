package review12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class E3Maps
{
    public static void main(String[] args) {
        Map<String,Double> studentsMarksMap=new HashMap<>();
        studentsMarksMap.put("Habib",95.5);
        studentsMarksMap.put("Madina",95.7);
        studentsMarksMap.put("Arthur",85.5);
        studentsMarksMap.put("Nelson",95.5);
        System.out.println(studentsMarksMap);

        LinkedHashMap<String,Double>studentsMarksMap1=new LinkedHashMap<>();
        studentsMarksMap1.put("Habib",95.5);
        studentsMarksMap1.put("Madina",95.7);
        studentsMarksMap1.put("Arthur",85.5);
        studentsMarksMap1.put("Nelson",95.5);
        System.out.println(studentsMarksMap1);
        TreeMap<String,Double>studentsMarksMap2=new TreeMap<>();
        studentsMarksMap2.put("Habib",95.5);
        studentsMarksMap2.put("Madina",95.7);
        studentsMarksMap2.put("Arthur",85.5);
        studentsMarksMap2.put("Nelson",95.5);
        System.out.println(studentsMarksMap2);
    }
}
