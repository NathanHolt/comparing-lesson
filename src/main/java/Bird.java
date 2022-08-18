public class Bird implements Animal{
    private int beakSize;
    private int size;

    public Bird(int beakSize, int size) {
        this.beakSize = beakSize;
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void doSomething() {
        System.out.println("woo");
    }

    @Override
    public String toString() {
        return "Bird this big - " + size;
    }
}
