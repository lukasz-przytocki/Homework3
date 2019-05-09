public class Category {
    String categoryName;
    String categoryDescription;

    Category(String name, String description){
        categoryName = name;
        categoryDescription = description;
    }

    String printInfoCategory(){
        return categoryName + " " + categoryDescription +".";
    }
}
