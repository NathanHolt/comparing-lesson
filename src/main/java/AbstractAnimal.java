public abstract class AbstractAnimal implements Animal, Comparable<Animal> {
    protected int size;
    protected String name = "";

    @Override
    public int compareTo(Animal o) {
        return Integer.compare(this.size, o.getSize());
    }

    public abstract void doSomething();

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.getName() + " this big - " + size;
    }
}
