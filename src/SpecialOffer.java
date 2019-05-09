public class SpecialOffer {
    Product specialOfferProduct;
    String specialOfferDescription;
    String startSpecialOffer;
    String endSpecialOffer;
    double discount;

    SpecialOffer(Product product, String description, String start, String stop, double dc){
        specialOfferProduct = product;
        specialOfferDescription = description;
        startSpecialOffer = start;
        endSpecialOffer = stop;
        discount = dc;
    }

    void printSpecialOffer(){
        System.out.println("Special offer for "+ specialOfferProduct.productName + " " + specialOfferDescription + " starts " +
                startSpecialOffer + " ends " + endSpecialOffer + " with discount " + discount*100 +"%.");
    }

    void calculateDiscount(Product product){
        product.productPrice = product.productPrice* (1-discount);
    }

}
