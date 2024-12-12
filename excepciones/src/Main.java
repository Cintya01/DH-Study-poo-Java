import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Integer> numberList = new ArrayList<>();
//
//        numberList.add(2);
//        numberList.add(5);
//        numberList.add(3);
//
//        try{
//           numberList.get(5);
//        }catch (IndexOutOfBoundsException e) {
//            e.printStackTrace();
//
//        }
//
//        System.out.println("llega hasta aca");

    ShoppingCart shoppingCart = new ShoppingCart();
    try{
        shoppingCart.addProduct(new Product("Remera",100.0));
        shoppingCart.addProduct(new Product("pantalon",150.0));
        shoppingCart.addProduct(null);
    } catch(Exception e){

        e.printStackTrace();

        }

    }
}