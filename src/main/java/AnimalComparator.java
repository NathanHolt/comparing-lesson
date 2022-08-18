import java.util.Comparator;

public class AnimalComparator {


    public static class AnimalNameComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal o1, Animal o2) {
            return CharSequence.compare(o1.getName(), o2.getName());
        }
    }

    public static class AnimalSizeComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal o1, Animal o2) {
            return Integer.compare(o1.getSize(), o2.getSize());
        }
    }

    public static class AnimalComparatorFirstByNameThenBySize implements Comparator<Animal> {
        @Override
        public int compare(Animal o1, Animal o2) {
            // for first name comparison
            int nameCompare = CharSequence.compare(o1.getName(), o2.getName());

            // for last name comparison
            int sizeCompare = Integer.compare(o1.getSize(), o2.getSize());

            // Now comparing
            if (nameCompare == 0) {
                return sizeCompare;
            }
            return nameCompare;
        }

    }

    public static class AnimalComparatorFirstBySizeThenName implements Comparator<Animal> {
        @Override
        public int compare(Animal o1, Animal o2) {
            // for first name comparison
            int nameCompare = CharSequence.compare(o1.getName(), o2.getName());

            // for last name comparison
            int sizeCompare = Integer.compare(o1.getSize(), o2.getSize());

            // Now comparing
            if (sizeCompare == 0) {
                return nameCompare;
            }
            return sizeCompare;
        }

    }

}

