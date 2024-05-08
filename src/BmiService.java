public class BmiService {
    public int calculate(double weight, double height) {
        double bmiIndex = weight / (height * height); // Расчет BMI индекса
        int bmiIndexInt = (int) bmiIndex; // Преобразование в целое число

        return bmiIndexInt;
    }
}
