package main.task3;

import java.util.ArrayList;
import java.util.List;

public class BagService {
    List<List<Integer>> bagList;

    public BagService() {
        bagList = new ArrayList<>();
    }

    void make(List<Integer> goodList, List<Integer> bag, int max) { // Перебираем комбинации
        if (goodList.size() > 0 && bag.stream().mapToInt(x -> x).sum() + goodList.get(0) <= max) {
            make(goodList.subList(1, goodList.size()), new ArrayList<>(bag), max);
            bag.add(goodList.get(0));
            make(goodList.subList(1, goodList.size()), new ArrayList<>(bag), max);
        }
        bagList.add(bag);
    }

    public List<List<Integer>> getBagList() {
        return bagList;
    }
}
