package review12;


import java.util.HashMap;
import java.util.Map;

public class E5Maps {
    public static void main(String[] args) {
        Map<String,Double>studentsMarksMap=new HashMap<>();
        studentsMarksMap.put("Habib",95.5);
        studentsMarksMap.put("Madina",95.7);
        studentsMarksMap.put("Arthur",85.5);
        studentsMarksMap.put("Nelson",95.5);
        System.out.println(studentsMarksMap);
        //Set<Map.Entry<String, Double>> entries = studentsMarksMap.entrySet();
        var entries=studentsMarksMap.entrySet();
      /* entries.removeIf(x->{
           if(x.getKey().contains("e")){
               return true;
           }else{
               return false;
           }
       });*/
        entries.removeIf(x->x.getKey().contains("e")||x.getValue()<90);
        System.out.println(studentsMarksMap);


    }

}


