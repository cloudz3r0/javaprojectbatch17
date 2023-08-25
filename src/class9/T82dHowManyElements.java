package class9;

public class T82dHowManyElements {
    public static void main(String[] args) {
        // Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
        // Then print all values from that array using 2 different loops and calculate
        // how many total countries been stored.
        String[][] countries = {
                {"Usa", "Canada", "Mexico", "greenland"},
                {"Colombia", "Brazil", "Argentina", "Venezuela"},
                {"Denmark", "France", "Spain", "Germany"},
                {"Nigeria", "Ghana", "Somalia", "Senegal"},
                {"Japan", "North Korea", "South Korea", "China","Phillipines"}
        };
        for (String[] row : countries) {
            for (String h : row) {
                System.out.print(h + " ");
            }
            System.out.println();
        }
        System.out.println("======");
        for (int row = 0; row < countries.length; row++) {
            for (int col = 0; col < countries[row].length; col++) {
                System.out.print(countries[row][col] + " ");
            }
            System.out.println();
        }
        int totalElements = 0;
        for (int row = 0; row < countries.length; row++) {
/*can also do for(String[] row:countries){
totalElements+=row.length*/
            //totalElements+= countries[row].length; can also do this
            // but it basically means this
            totalElements=totalElements+countries[row].length;
        }
        System.out.println(totalElements);
    }

}
