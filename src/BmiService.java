public class BmiService {
    public double calculate(int index) {
        int height = 180; // рост в сантиметрах
        int weight = 80; // вес в килограммах
        int bmi = weight * 10000 / height / height;
        return bmi;
    }
}
