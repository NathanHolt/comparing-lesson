import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog one = new Dog("Doggy", 200);
        Dog two = new Dog("Yappers the Second", 30);
        Dog three = new Dog("Pupperoni", 450);

        Parrot b1 = new Parrot(21, 5);

        List<Animal> animals = new ArrayList<>();
        animals.add(one);
        animals.add(two);
        animals.add(three);
        animals.add(b1);

        System.out.println(one.compareTo(two));



        Collections.sort(animals, new GenericComparator("name.size", "name.size"));

        System.out.println(animals);

//        Collections.sort(animals, new AnimalComparator.AnimalNameComparator());
//
//        System.out.println(animals);
//
//        Collections.sort(animals, new AnimalComparator.AnimalSizeComparator());
//
//        System.out.println(animals);
//
//        Collections.sort(animals, new AnimalComparator.AnimalComparatorFirstByNameThenBySize());
//
//        System.out.println(animals);
//
//        Collections.sort(animals, new AnimalComparator.AnimalComparatorFirstBySizeThenName());
//
//        System.out.println(animals);

    }
}
