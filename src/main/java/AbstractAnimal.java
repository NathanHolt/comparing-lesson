public abstract class AbstractAnimal {
    int size;


    public abstract void doSomething();

    public int getSize() {
        return this.size;
    }

    public String toString() {
        return this.getClass() + " this big - " + size;
    }
}
