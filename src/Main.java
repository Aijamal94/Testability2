public class Main {
    public static void main(String[] args) {

        double weight = 98; // Вес в кг
        double height = 1.87; // Рост в метрах

        BmiService bmiService = new BmiService();
        int bmiIndex = bmiService.calculate(weight, height);

        System.out.println("BMI индекс: " + bmiIndex);

    }
}