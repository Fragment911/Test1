package main.task4;

public class Main {
    public static void main(String ... args) {
        NumberService numberService = new NumberService();

        int number = 4;
        System.out.println(number);
        System.out.println(numberService.getPosition(number));

        number = 7;
        System.out.println(number);
        System.out.println(numberService.getPosition(number));

        number = 77;
        System.out.println(number);
        System.out.println(numberService.getPosition(number));

        number = 7474;
        System.out.println(number);
        System.out.println(numberService.getPosition(number));
    }
}
