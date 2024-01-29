package class26;

import java.util.*;

public class Hw3 {/*
Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000
*/

    public static void main(String[] args) {


        TreeMap<String, Double> employeeSal = new TreeMap<>();
        employeeSal.put("John Smith", 10000.0);
        employeeSal.put("James M", 20000.0);
        employeeSal.put("Adrian F", 40000.0);
        employeeSal.put("Asghar Nazir", 1000000.0);
        System.out.println(employeeSal);

        var highSalary=(Collections.max(employeeSal.values()));

        var money=employeeSal.entrySet();
        for(var m:money){
            if(m.getValue()==highSalary){
                System.out.println(m.getKey()+ " $ "+m.getValue());
            }
        }

    }

}



