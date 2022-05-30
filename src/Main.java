public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 100.00;
        double height = 2.00;
        double bodyMassIndex = service.calculate(mass, height);
        bodyMassIndex = mass / (height * height);
        System.out.println("индекс массы тела = " + (bodyMassIndex));
    }

}
