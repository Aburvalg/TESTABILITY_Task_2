public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = 85;
        int bmi = (int) service.calculate(index);
        System.out.println("Ваш индекс массы тела: " + bmi);
    }
}
