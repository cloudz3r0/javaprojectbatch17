package class26;

import java.util.TreeMap;

public class E11 {
    public static void main(String[] args) {
        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("LipStick", 22.0);
        makeup.put("BlushOn", 40.0);
        makeup.put("Base", 50.5);
        makeup.put("Foundation", 90.5);
        makeup.put("EyeLiner", 35.5);
        makeup.put("EyeLiner", 25.5);
        makeup.put("Concealer", 35.5);

        /*Set<Map.Entry<String,Double>> entries=makeup.entrySet();
        for(Map.Entry<String,Double> e:entries){
            System.out.println(e.getKey()+" "+e.getValue());
            */
        var entries= makeup.entrySet();//short cut for cut out part above.
            for(var e:entries){
                System.out.println(e.getKey()+" "+e.getValue());
        }
            String name="adrian";
            var name2="Ava";//now just use var instead of putting each datatype.

    }
}
class Remove{
    public static void main(String[] args) {
        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("LipStick", 22.0);
        makeup.put("BlushOn", 40.0);
        makeup.put("Base", 50.5);
        makeup.put("Foundation", 90.5);
        makeup.put("EyeLiner", 35.5);
        makeup.put("EyeLiner", 25.5);
        makeup.put("Concealer", 35.5);
        makeup.entrySet().removeIf(x->x.getKey().contains("a"));
        System.out.println(makeup);
    }
}