public class ClockEx1 {
    String brand;
    boolean isDigital;
    String color;

    ClockEx1(String br, boolean isD, String clr){
        brand = br;
        isDigital = isD;
        color = clr;
    }

    void printInfo (){
        System.out.printf("The clock name is %s, is digital %b and its color is %s. \n", brand, isDigital,color);
    }

}
