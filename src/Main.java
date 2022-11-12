public class Main {
    public static void main(String[] args) {

        Animal[] animals={
                new Shark("Shark "),
                new Eagle("Eagle"),
                new Turtle("Turtle")
        };
        for (Animal animal : animals) {
            System.out.println();
            System.out.println(animal);
            if (animal.getClass().equals(Shark.class))((Shark) animal).attack();
            else if(animal.getClass().equals(Eagle.class))((Eagle) animal).fly();
            else if (animal.getClass().equals(Turtle.class))((Turtle) animal).swim();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (Animal animal : animals) {
            System.out.println();
            System.out.println(animal);
            if (animal instanceof Shark)((Shark) animal).attack();
            else if (animal instanceof Eagle)((Eagle) animal).fly();
            else if (animal instanceof Turtle)((Turtle) animal).swim();
        }
        Shark[] sharks={new Shark("Shark")};
        Eagle[] eagles={new Eagle("Eagle")};
        Turtle[] turtle={new Turtle("Turtle")};

    }
}
