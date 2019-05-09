public class InternetShop {
    public static void main(String[] args) {
    Category healthyFood = new Category("Healthy food", "Good for your stomach and body");
    Category herbs = new Category("Herbs", "Spices and herbs");

    Product product1 = new Product("Mango", 20, "dry mango fruits", healthyFood);
    Product product2 = new Product("Coconut Chips", 15, "good snack with amino acids and vitamin C and iron", healthyFood);
    Product product3 = new Product("Hibiskus", 10, "Dry flowers,refreshing and antioxidant effect", herbs);

    System.out.println(product1.printInfoProduct() + healthyFood.printInfoCategory());
    System.out.println(product2.printInfoProduct() + healthyFood.printInfoCategory());
    System.out.println(product3.printInfoProduct() + herbs.printInfoCategory());

    SpecialOffer offer = new SpecialOffer(product2,"In may Healthy food 20% chipper", "1-05-2019", "31-05-2019", 0.2);

    offer.calculateDiscount(product2);
    offer.printSpecialOffer();
    System.out.println("Price after special offer discount: " + product2.printInfoProduct() + healthyFood.printInfoCategory());

    }
}
