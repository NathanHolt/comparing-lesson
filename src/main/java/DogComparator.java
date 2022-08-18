import java.util.Comparator;

public class DogComparator implements Comparator<Dog> {


    @Override
    public int compare(Dog o1, Dog o2) {
        return Integer.compare(o1.getSize(), o2.getSize());
    }
}
