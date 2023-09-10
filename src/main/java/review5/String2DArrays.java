package review5;

public class String2DArrays {
    public static void main(String[] args) {
        String[][] countries = {

                /*0*/   {"Canada", "Usa"},//0,1
                /*1*/ {"Ecuador", "Brazil", "Chile", "Argentina"},//0,1,2,3
                /*2*/  {"Romania", "France", "Italy"},//0,1,2

        };
        System.out.println(countries.length);//3-number of 1d arrays. Shows how many arrays are stored
        for (String[] countryArray : countries) {//outer loop iterates over each 1d array

            for (String country : countryArray) {//the values of each array gets stored into countryArray
                //then countryArray goes into country then it prints.


                System.out.println(country);
            }
        }
    }
}
