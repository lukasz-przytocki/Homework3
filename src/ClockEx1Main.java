public class ClockEx1Main {
    public static void main(String[] args) {
        ClockEx1 clock1 = new ClockEx1();
        ClockEx1 clock2 = new ClockEx1();

        clock1.brand = "Sony";
        clock1.isDigital = true;
        clock1.color = "grey";

        clock2.brand = "JVD";
        clock2.isDigital = false;
        clock2.color = "balck";

        clock1.printInfo();
        clock2.printInfo();

    }
}
