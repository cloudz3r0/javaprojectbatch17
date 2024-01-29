package review12;

import java.util.HashMap;
import java.util.Map;

public class E6Maps {
    public static void main(String[] args) {
        Map<String,Double> studentsMarksMap=new HashMap<>();
        studentsMarksMap.put("Habib",95.5);
        studentsMarksMap.put("Madina",95.7);
        studentsMarksMap.put("Arthur",85.5);
        studentsMarksMap.put("Nelson",95.5);
        System.out.println(studentsMarksMap);
        studentsMarksMap.replaceAll((k,v)-> {
            if(k.contains("a")){
                return 10.0;
            }else{
                return 0.0;
            }


        });
        System.out.println(studentsMarksMap);
    }
    void age(){

    }
}
