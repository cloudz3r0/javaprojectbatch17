package class9;

import java.util.Arrays;

public class E122dArraysEForLoop {
    public static void main(String[] args) {
        String [][] names =
                {              {"Adrian", "Ava", "Nero", "Cloud"},
                        {"Winnie", "Nala", "Cooper", "Raiden"},
                        {"Father", "Mother", "Son", "Daughter"},
                        {"Hi", "Hello", "Bye", "Goodbye"}

                };
       for(String [] row:names){
           //System.out.println(Arrays.toString(row)); print all arrays one by one
           for(String v:row){
               System.out.print(v+" ");// prints all elements one by one
           }
           System.out.println();
       }
        System.out.println(Arrays.deepToString(names));//for printing 2d array
        }
    }

