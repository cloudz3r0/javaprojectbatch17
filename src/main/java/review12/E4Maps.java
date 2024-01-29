package review12;

import java.util.HashMap;
import java.util.Map;

public class E4Maps {
    public static void main(String[] args) {
        Map<String,Double>studentsMarksMap=new HashMap<>();
        studentsMarksMap.put("Habib",95.5);
        studentsMarksMap.put("Madina",95.7);
        studentsMarksMap.put("Arthur",85.5);
        studentsMarksMap.put("Nelson",95.5);
        System.out.println(studentsMarksMap);
      //  studentsMarksMap.forEach((k,v)-> System.out.println(k+" "+v));
       final int []counter=new int[1];
        studentsMarksMap.forEach((k,v)-> {

           if (k.contains("a") || v > 96) {
                System.out.println(k + " " + v);
                counter[0]++;
            }
        });
        System.out.println(counter[0]);
        }

}


