package main.task2;

public class Main {
    public static void main(String ... args) {
        ExpressionService expressionService = new ExpressionService();

        String str = "1+3+2";
        System.out.println(str);
        System.out.println(expressionService.transform(str));

        str = "3+1+2+3+2";
        System.out.println(str);
        System.out.println(expressionService.transform(str));

        str = "1+3+2+1+1+1";
        System.out.println(str);
        System.out.println(expressionService.transform(str));

        str = "2+3+3+2+1+3+2";
        System.out.println(str);
        System.out.println(expressionService.transform(str));

        str = "2";
        System.out.println(str);
        System.out.println(expressionService.transform(str));
    }
}
