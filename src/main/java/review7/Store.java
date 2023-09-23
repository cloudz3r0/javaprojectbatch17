package review7;

public class Store {


    public static void main(String[] args) {
Book.type="Audiobook";//access static variable.
        Book book1=new Book();
        book1.title="Nightwork";
        book1.author="Irwin Shaw";
        book1.year=1975;
        book1.price=45;
       // book1.page=298;
        //book1.page=298; CE: variable does not exist in the Book class
        book1.read();
        book1.changePrice(41);
      double total= book1.totalWithTax(0.1);
        System.out.println(total);//this is the original price's price with tax


        new Book() ;
        new Book() ;

    }

}
