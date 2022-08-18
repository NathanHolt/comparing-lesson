import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog one = new Dog("Yappers", 20);
        Dog two = new Dog("Yappers the Second", 40);
        Dog three = new Dog("Pupperoni", 10);

        Bird b1 = new Bird(21, 5);

        List<Animal> animals = new ArrayList<>();
        animals.add(one);
        animals.add(two);
        animals.add(three);
        animals.add(b1);



        Collections.sort(animals, new AnimalComparator());
        System.out.println(animals);

    }
}
