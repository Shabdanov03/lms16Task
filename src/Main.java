import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Shark("Shark "),
                new Shark("Akula"),
                new Shark("Kit"),
                new Eagle("Burkut"),
                new Eagle("Kush"),
                new Eagle("Eagle"),
                new Turtle("Cherepaha"),
                new Turtle("Ninjza"),
                new Turtle("Turtle")
        };
        System.out.println("~~~~~~~~~~GetClass~~~~~~~~~~");
        for (Animal animal : animals) {
            System.out.println();
            System.out.println(animal);
            if (animal.getClass().equals(Shark.class)) ((Shark) animal).attack();
            else if (animal.getClass().equals(Eagle.class)) ((Eagle) animal).fly();
            else if (animal.getClass().equals(Turtle.class)) ((Turtle) animal).swim();

        }

        System.out.println();


        Shark[] sharks = new Shark[3];
        Eagle[] eagles = new Eagle[3];
        Turtle[] turtle = new Turtle[3];

        System.out.println("~~~~~~~~~~~instanceof~~~~~~~~~~");

        for (int i = 0,j=0,k=0,g=0; i < animals.length; i++) {
            if (animals[i] instanceof Shark){
                sharks[j]=(Shark) animals[i];
                ((Shark) animals[i]).attack();
                j++;
            } else if (animals[i] instanceof Eagle) {
                eagles[k]=(Eagle) animals[i];
                ((Eagle) animals[i]).fly();
                k++;
            } else if (animals[i] instanceof Turtle) {
                turtle[g]=(Turtle) animals[i];
                ((Turtle) animals[i]).swim();
                g++;
            }
        }
        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(eagles));
        System.out.println(Arrays.toString(turtle));


    }
}
