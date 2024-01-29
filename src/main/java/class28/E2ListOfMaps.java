package class28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E2ListOfMaps {
    public static void main(String[] args) {
        List<String> maps = new ArrayList<>();
        String name = "Adrian";
        maps.add(name);
//Creates a list that contains maps of strings.
        List<Map<String, String>> mapList = new ArrayList<>();
//creating the string map.
        Map<String, String> map = new HashMap<>();
        map.put("Name", "Ehab");
        map.put("City", "Maryland");
        map.put("Age", "150");
        map.put("Salary", "150000");
        //adding the complete map on index 0
        mapList.add(map);//adding this map into the List above.

        //creating another one.
        Map<String, String> map1 = new HashMap<>();
        map1.put("Name", "Ayesha");
        map1.put("City", "California");
        map1.put("Age", "200+");
        map1.put("Salary", "20000");
        mapList.add(map1);//adding this map into the List above.

          //getting complete map back from the list.
           var firstMap=mapList.get(0);
        System.out.println(firstMap.get("Name"));

    }
}
