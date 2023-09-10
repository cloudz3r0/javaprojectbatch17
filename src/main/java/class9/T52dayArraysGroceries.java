package class9;

public class T52dayArraysGroceries {
    public static void main(String[] args) {
        //Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets.
        // Retrieve all values from that array using 2 different loops
        String [][] items={
                {"Cucumber","Carrot","Broccoli","Onion"},
                {"Orange","Mango","Tomato","Apple"},
                {"Milk","Yogurt","Cheese","heavy cream"},
                {"Candy","Chocolate","Fruitrollup","Lollipop"}
        };
        for(String []row:items){
            for(String col:row){
                System.out.print(col+" ");
            }
            System.out.println();

        }
        System.out.println("=========");
        for (int i = 0; i <items.length ; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j]+" ");
            }
            System.out.println();
        }
    }
}
