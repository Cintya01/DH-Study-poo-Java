public class DogWalker {

    private String name;

    public DogWalker(String name) {
        this.name = name;
    }

    public void walkDog(Dog dog){
        System.out.println("I`m walking this dog" + dog.getName() );

    }
}
