public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bmi = service.calculate(48, 1.63);
        System.out.println("Ваш индекс массы тела: " + bmi + " кг/м2");
    }
}
