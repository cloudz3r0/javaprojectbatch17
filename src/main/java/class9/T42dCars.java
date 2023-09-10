package class9;

public class T42dCars {
    public static void main(String[] args) {
        //create a 2d array of cars american german korean italian. 3 cars per country
        //Retrieve all values
        String [][] cars={
                {"Tesla","Honda","Chevrolet","Ford"},
                {"BMW","Mercedes","Volkswagen","Audi"},
                {"Kia","Hyundai","Sorento","Genesis Motor"},
                {"Lamborghini","Ferrari","Maserati","Fiat"}
        };
        for(String [] row:cars) {
            for (String col : row) {
                System.out.print(col + " ");

            }
            System.out.println();
        }
        System.out.println("==========");
            for (int i = 0; i < cars.length ;i++) {
                for (int j = 0; j < cars[i].length; j++) {
                    System.out.print(cars[i][j]+" ");
                }
                System.out.println();
            }
        }
        }


