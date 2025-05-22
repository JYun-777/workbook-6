public class Main {
    public static void main(String[] args) {

        Basket<Smoothie> smoothieBasket = new Basket<>();
        smoothieBasket.addItem(new Smoothie("Strawberry Dream", 3.5));
        smoothieBasket.addItem(new Smoothie("Tropical Twist", 4.25));
        smoothieBasket.printReceipt();
        System.out.println("Total: €" + smoothieBasket.getTotalPrice());


    }
}