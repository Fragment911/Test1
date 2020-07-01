package main.task1;

public class NumberService {
    int transform(int number) {
        StringBuilder numberStr = new StringBuilder().append(number); // переводим в StringBuilder для упрощения перестановки цифр
        for (int i = 0; i < numberStr.length() - 1; i++) {
            for (int j = i + 1; j < numberStr.length(); j++) {
                if (i == 0 && numberStr.charAt(j) == '0') continue; // для избежания подстановки нуля в ведущюю позицию
                if (numberStr.charAt(i) > numberStr.charAt(j)) { // допустимо сравнение по ascii коду
                    char c = numberStr.charAt(i);
                    numberStr.setCharAt(i, numberStr.charAt(j));
                    numberStr.setCharAt(j, c);
                }
            }
        }
        return Integer.parseInt(numberStr.toString());
    }

    void compare(int number1, int number2) {
        System.out.print(number1 + " " + number2 + " ");
        if (number1 == number2) System.out.println("OK");
        else System.out.println("ERROR");
    }
}
