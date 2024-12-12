import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        User user = new User("Cint", "123456");
//
//        System.out.println(user.getName());
//
//        user.setName("Juanito");
//
//        System.out.println(user.getName());
// ejercicio 2
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("enter name:");
//        String name = scanner.next();
//        System.out.println("enter age:");
//        Integer age = scanner.nextInt();
//
//        Dog dog = new Dog(name, age);

        Dog dog = new Dog("tonciano");
        DogOwner dogOwner = new DogOwner("cint", dog);

        dogOwner.play();

        DogWalker dogWalker = new DogWalker("pepito");
        dogWalker.walkDog(dog);

    }
}