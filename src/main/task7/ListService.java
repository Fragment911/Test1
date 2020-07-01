package main.task7;

import java.util.LinkedList;
import java.util.List;

public class ListService {
    List<Integer> makeList(int n) {
        List<Integer> list = new LinkedList<>();
        if (n == 1) { // тривиальные случаи размещения для 1, 2 и 3 школьников
            list.add(1);
        }
        if (n == 2) {
            list.add(1);
        }
        if (n == 3) {
            list.add(1);
            list.add(3);
        }
        if (n >= 4) { // при 4 и более возможно разместить всех
            list.add(2);
            list.add(4);
            list.add(1);
            list.add(3);
            for (int i = 5; i <= n; i++) {
                if (i % 2 == 1) list.add(i);
                else list.add(0, i);
            }
        }
        return list;
    }
}
