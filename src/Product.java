public class Product {
    String productName;
    double productPrice;
    String productDescription;
    Category productCategory;

    Product(String name, double price, String description, Category category){
        productName = name;
        productPrice = price;
        productDescription = description;
        productCategory = category;
    }

    String printInfoProduct(){
        return productName + " " + productPrice + "zł " + productDescription;
    }
}
