package class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E6Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("LipStick", 22.0);
        makeup.put("BlushOn", 40.0);
        makeup.put("Base", 50.5);
        makeup.put("Foundation", 90.5);
        makeup.put("EyeLiner", 35.5);
        makeup.put("EyeLiner", 25.5);
        makeup.put("Concealer", 35.5);
        makeup.forEach((k,v)->System.out.println(k+" "+v));//lamda for the loop below.
      Set < Map.Entry<String,Double>> entries=makeup.entrySet();//returns us all the entries in a form of a set
        for(Map.Entry<String,Double> e:entries){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
