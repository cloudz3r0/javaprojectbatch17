package class26;

import java.util.Collection;
import java.util.TreeMap;

public class E4Maps {
    public static void main(String[] args) {
        TreeMap<String,Double>makeup= new TreeMap<>();
        makeup.put("LipStick",22.0);
        makeup.put("BlushOn",40.0);
        makeup.put("Base",50.5);
        makeup.put("Foundation",90.5);
        makeup.put("EyeLiner",35.5);
        makeup.put("EyeLiner",25.5);
        makeup.put("Concealer",35.5);
        System.out.println(makeup);
        Collection<String> onlyKeys=makeup.keySet();
        Collection<Double> onlyValues=makeup.values();
        System.out.println(onlyKeys);
        System.out.println(onlyValues);
    }
}
