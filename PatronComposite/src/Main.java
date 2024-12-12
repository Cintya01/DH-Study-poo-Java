public class Main {
    public static void main(String[] args) {


    ProductSingle hamburger = new ProductSingle("Hambur", 5.0);
        ProductSingle fries = new ProductSingle("fries", 2.0);
        ProductSingle cola = new ProductSingle("cola", 1.0);


        BurgerJoint burgerJoint = new BurgerJoint();

        burgerJoint.addProduct(hamburger);
        burgerJoint.addProduct(fries);
        burgerJoint.addProduct(cola);

        ProductComposite productComposite = new ProductComposite("Combo1", 0.1);
       productComposite.addProduct(hamburger);
       productComposite.addProduct(fries);
       productComposite.addProduct(cola);

       burgerJoint.addProduct(productComposite);

       ProductComposite megaPC = new ProductComposite("MCombo", 0.25);
       megaPC.addProduct(productComposite);
        megaPC.addProduct(productComposite);
        megaPC.addProduct(productComposite);
        megaPC.addProduct(productComposite);
        megaPC.addProduct(fries);

        burgerJoint.addProduct(megaPC);

        System.out.println(burgerJoint.calculateCartPrice());
    }
}