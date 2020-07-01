package main.task1;

public class Main {
    public static void main(String ... args) {
        NumberService numberService = new NumberService();

        int number1 = 43285;
        int number2 = 35432;
        number1 = numberService.transform(number1);
        numberService.compare(number1, number2);

        number1 = 47056;
        number2 = 40567;
        number1 = numberService.transform(number1);
        numberService.compare(number1, number2);

        number1 = 4600;
        number2 = 6004;
        number1 = numberService.transform(number1);
        numberService.compare(number1, number2);

        number1 = 8493;
        number2 = 3489;
        number1 = numberService.transform(number1);
        numberService.compare(number1, number2);
    }
}
