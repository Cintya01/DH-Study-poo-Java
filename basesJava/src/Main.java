// BASES JAVA ***********************************************************

//public class Main {
//
//    public static void main(String[] args) {
//
//        System.out.println("Hello world!");
//
//        String name = "Cin";
//        Integer age = 33;
//        Double height = 1.20;
//
//        System.out.println("Hello! My name is " + name + ", I have " + age + " years old and my height is " + height);
//
//        if (age > 15 && height >= 1.5){
//            System.out.println("podes subir");
//        } else {
//            System.out.println("no podes");
//        }
//
//        for( Integer i = 5; i < 10 ; i++){
//            System.out.println("Hello world!");
//            //se imprime 5 veces
//            // se declara siembre la variable del i con el integer
//        }
//    }
//}

// DATOS PRIMITIVOS

//public class Main {
//
//    public static void main(String[] args){
//        int number = 3; //primitivo
//
//        Integer anotherNumber = 3; // variable envolvente, permite usar metodos
//
//}
//}

// FIRMA DE UN METODO

//public class Main {
//
//    public static void main(String[] args){
//
//        System.out.println(addTwoNumbers(2.0, 4.3));
//    }
//// public o private, luego el tipo de dato que devuelve el metodo, el nombre del metodo y los parametros que el metodo recibe
//    public static Double addTwoNumbers(Double numberOne, Double numberTwo){
//
//        return numberOne + numberTwo;
//    }
//}

// SCANNER

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args){
//
//        Integer number = 1; // Scanner es para hacer mas dinamica el input de datos
//
//        Scanner scanner = new Scanner(System.in); // System.in recibe un input
//
//        Integer numberOne = scanner.nextInt();
//
//        Integer numberTwo = scanner.nextInt();
//
//        Integer addition = numberOne + numberTwo;
//
//        System.out.println( numberOne + " + " + numberTwo + " = " + addition);
//
//    }
//
//}

public class Main {

    public static void main(String[] args){

         Integer number = Integer.parseInt("75");
         System.out.println(number);

         Integer divide = Math.divideExact(10,2);
        System.out.println(divide);

    }

}