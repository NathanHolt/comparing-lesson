public abstract class Bird extends AbstractAnimal  {
    private int beakSize;

//    @Override
//    public int compareTo(Bird o) {
//        return Integer.compare(this.beakSize, o.getSize());
//    }

    public int getBeakSize() {
        return beakSize;
    }

    public Bird(int beakSize, int size) {
        this.beakSize = beakSize;
        this.size = size;
    }

//    @Override
//    public void doSomething() {
//        System.out.println("woo");
//    }

    public abstract void doSomething();

//    @Override
//    public String toString() {
//        return "Bird this big - " + size;
//    }
}
