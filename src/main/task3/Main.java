package main.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String ... args) {
        BagService bagService = new BagService();

        String str1 = "5 15 60 10";
        int min = Integer.parseInt(str1.split(" ")[1]);
        int max = Integer.parseInt(str1.split(" ")[2]);
        int dif = Integer.parseInt(str1.split(" ")[3]);

        String str2 = "10 20 30 35 25";
        List<Integer> goodList = new ArrayList<>();
        String[] goodArray = str2.split(" ");
        for (String s : goodArray) {
            goodList.add(Integer.parseInt(s));
        }

        goodList = goodList.stream().filter(x -> (x >= min)).sorted().collect(Collectors.toList());

        bagService.make(goodList, new ArrayList<>(), max);
        bagService.make(goodList.subList(1, goodList.size()), new ArrayList<>(), max);

        System.out.println(bagService.getBagList().stream().distinct() // отфильтровываем повторы и наборы, где разница между весом выше допустимой
                .filter(x -> x.size() > 0)
                .filter(x -> (x.get(x.size() - 1) - x.get(0) <= dif))
                .collect(Collectors.toList()));
    }
}