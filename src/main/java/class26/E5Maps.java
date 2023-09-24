package class26;

import java.util.TreeMap;

public class E5Maps {    public static void main(String[] args) {
    TreeMap<String, Double> makeup = new TreeMap<>();
    makeup.put("LipStick", 22.0);
    makeup.put("BlushOn", 40.0);
    makeup.put("Base", 50.5);
    makeup.put("Foundation", 90.5);
    makeup.put("EyeLiner", 35.5);
    makeup.put("EyeLiner", 25.5);
    makeup.put("Concealer", 35.5);
    makeup.forEach((k,v)->System.out.println(k+" "+v));
    //instead of key and value we can use just k for key and v for value
    System.out.println("==================");
   makeup.forEach((k,v)-> System.out.println(k));//prints only keys
    System.out.println("=================");
   makeup.forEach((k,v)-> System.out.println(v));//print only values
    System.out.println("==================");
    makeup.forEach((k,v)-> {
        if(k.contains("a")){
            System.out.println(v);
        }
            });
    //if we have two parameters we need to contain in parentheses
}
}
