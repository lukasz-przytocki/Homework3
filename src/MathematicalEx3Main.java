public class MathematicalEx3Main {
    public static void main(String[] args) {
        MathematicalEx3 math = new MathematicalEx3();
        math.variable = 5;
        System.out.println("Variable is even: " + math.isEven(5));
        System.out.println("Variable is odd: " + math.isOdd(6));
        System.out.println("Variable power: " + math.power(4));
        System.out.println("Circle filed: " + math.circleField(4.1));
    }
}
