public class BmiService {
    public double calculate(double mass, double height) {
        double bodyMassIndex;
        bodyMassIndex = mass / (height * height);
        return bodyMassIndex;
    }
}
