package main.task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExpressionService {
    String transform(String expression) {
        List<String> numberList = Arrays.stream(expression.split("\\+")).sorted().collect(Collectors.toList()); // разделяем по '+' и сортируем
        return String.join("+", numberList); // объединяем
    }
}
