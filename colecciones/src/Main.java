import java.util.*;

public class Main {
    public static void main(String[] args) {

        //
//        //creation
//        List<Integer> numbersList = new ArrayList<>();
//        Set<Integer> numberSet = new HashSet<>();
//
//        //add
//        numbersList.add(9);
//        numbersList.add(3);
//        numbersList.add(6);
//        numbersList.add(3);
//        numberSet.add(9);
//        numberSet.add(3);
//        numberSet.add(6);
//        numberSet.add(3);
//        System.out.println(numbersList);
//        System.out.println(numberSet);
//
//        //size
//        System.out.println(numbersList.size());
//        System.out.println(numberSet.size());
//
//        //get
//        System.out.println(numbersList.get(2));
//        // set no tiene indice para tomar elemento
//
//        //iter
//
//        for (Integer number : numbersList) {
//            System.out.println(number);
//
//        }
//        for (Integer number : numberSet){
//            System.out.println(number);
//
//        }
//
//    }

//        List<Integer> numberList = new ArrayList<>();
//
//        numberList.add(5);
//        numberList.add(1);
//        numberList.add(2);
//        numberList.add(4);
//        numberList.add(3);
//
//        numberList.sort(null);
//
//        System.out.println(numberList);

        List<Worker> workerList = new ArrayList<>();

        workerList.add(new Worker("a", 10));
        workerList.add(new Worker("b", 15));
        workerList.add(new Worker("c", 2));

        workerList.sort(null);

        System.out.println(workerList);
    }
}
