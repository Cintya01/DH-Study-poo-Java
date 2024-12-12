public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("guau guau");
    }


    public void fetchBall(){
        System.out.println("estoy corriendo por la pelota, culero!");
        makeSound();
    }
}
