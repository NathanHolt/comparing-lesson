public class Dog extends AbstractAnimal  {
    public Dog(String name, int size) {
        this.name = name;
        this.size = size;
    }


    @Override
    public void doSomething() {
        System.out.println("yayyy");
    }

//    @Override
//    public String toString() {
//        return "Dog this big - " + size;
//    }
}
