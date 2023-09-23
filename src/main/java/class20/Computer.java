package class20;

        /*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
        Define common behavior within and some fields in parent class
        and override some of the methods in child classes
        Define some methods specific to child classes
        Create objects of child classes and store them into array.
         Loop through each object and execute available methods
         */
public class Computer {
    void speed() {
        System.out.println("Fast");
    }

        void storage(){
            System.out.println("Decent");
        }
        void Browser(){
            System.out.println("Google Chrome");
        }

    }
    class Apple extends Computer{
   @Override
    void Browser(){
       System.out.println("Safari");
    }
    @Override
    void storage(){
        System.out.println(512+"gigabytes");
    }
        void speed(){
            System.out.println("Very fast");
        }

    }
    class Lenovo extends Computer{
    void storage(){
        System.out.println(500+"gigabytes");
    }
    void speed(){
        System.out.println("Faster than HP");
    }

    }
class HP extends Computer{
void storage(){
    System.out.println("Can go up to a terabyte");
}
void speed(){
    System.out.println("Slower processor than Lenovo");
}
void Browser(){
    System.out.println("Edge");
}
}
class Dell extends Computer{
void storage(){
    System.out.println("Up to 2 Terabytes");
}
}
