package class8;

public class Hw7ReverseOrder {
    public static void main(String[] args) {
        char[]names={'A','B','C','D','E'};
        for (int i =names.length-1;  i>=0; i--) {//if there was no -1 then we'd get an error bc you would start at the 5th/6th element and we dont have that.
            System.out.println(names[i]);
        }

        }
    }

