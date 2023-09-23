package class19;

public class Degree {
    /*
    Create a class degree with method preRequisite that prints
    to get a degree you need diploma. Then create two subclasses degree and bachelors
    In masters class override the preRequisite since it needs a bachelors to get a masters
    Create object of each class
     */
    public void preRequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}

     class Bachelors extends Degree {

//dont need anything here
    }
    class Masters extends Degree {
        @Override
        public void preRequisite() {

            System.out.println("You need Bachelors to get a masters.");
        }

    }

    class Tester {
        public static void main(String[] args) {

            Bachelors b = new Bachelors();
            b.preRequisite();

            Masters m = new Masters();
            m.preRequisite();

        }
    }
