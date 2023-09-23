package class18;

public class userClass {
    /*
    write program userClass that has a constructor that initializes a instance variable name and number.
    Create child/sub class userInfo that will have user address variable and it will be initialized through
    constructor call. Print users name, mobile number, and address.
     */



     String name;
    String number;

    protected userClass(String name, String number){
        this.name=name;
        this.number=number;
    }
}
class userInfo extends userClass {
    String address = "";
    public userInfo(String name, String number, String address) {

        super(name, number);
        this.address = address;
    }

    void userDetails() {
        System.out.println(name + " " + number + " "+address);
    }

}
class userTester {


    public static void main(String[] args) {
        userInfo c = new userInfo("Adrian","163734838","Rockville");
        c.userDetails();
    }
}






