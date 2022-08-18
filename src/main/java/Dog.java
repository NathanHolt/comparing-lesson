public class Dog implements Animal {
    String name;
    int size;

    public Dog(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void doSomething() {
        System.out.println("yayyy");
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dog this big - " + size;
    }
}
