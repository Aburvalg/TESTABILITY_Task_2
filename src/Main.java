public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(180, 80);
        System.out.println("Ваш индекс массы тела: " + bmi);
    }
}
