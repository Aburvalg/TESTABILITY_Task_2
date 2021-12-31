public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 5;
        int weight = 1_0;
        int bmi = (int) service.calculate(weight / height);
        System.out.println("Ваш индекс массы тела: " + bmi);
    }
}
