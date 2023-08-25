package review4;

public class E1NestedLoop {
    public static void main(String[] args) {
//clock example
        for (int h=0;h<24;h++){


        for (int s = 0; s < 60; s++) {//seconds in a minute


            for (int m = 0; m < 60; m++) {//minutes in an hour

                if(m<10&&s<10){//if seconds are under 10 put a 0 next to it and if minutes are less than 10 as well
                    System.out.println("0"+s+":0"+m);//when both are less than 10 then put 0 in front
                }else if(m>=10&&s<10){
                    System.out.println("0"+s+":"+m);//if seconds is greater than 10 bit the minutes are less than 10 then just put zero in minutes

                }else{
                    System.out.println(s+":"+m);
                }
            }
        }
    }
}
}
