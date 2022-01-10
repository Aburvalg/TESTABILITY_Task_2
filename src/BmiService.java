public class BmiService {
    public double calculate(int height, int weight) {
        double bmi = weight * 10000 / height / height;
        return bmi;
    }
}
