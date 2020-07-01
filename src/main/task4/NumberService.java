package main.task4;

public class NumberService {
    int getPosition(int number) {
        String numberStr = String.valueOf(number);
        // если мысленно разбить последовательность чисел на группы по длине числа, то логика чисел в группе близка к логике двоичных чисел
        int position = Integer.parseInt(numberStr.replace('4', '0').replace('7', '1'), 2); //позиция числа в группе
        // также нужно учесть, что до группы с нашим числом были еще числа
        for (int i = 0; i < numberStr.length(); i++) {
            position += Math.pow(2, i);
        }
        return position;
    }
}
