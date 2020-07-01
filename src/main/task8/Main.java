package main.task8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String ... args) {
        DomineService domineService = new DomineService();

        List<Domino> dominoList = new ArrayList<>();
        int n = 2;
        dominoList.add(new Domino(4, 2));
        dominoList.add(new Domino(6, 4));
        System.out.println(domineService.check(dominoList));

        dominoList = new ArrayList<>();
        n = 1;
        dominoList.add(new Domino(2, 3));
        System.out.println(domineService.check(dominoList));

        dominoList = new ArrayList<>();
        n = 3;
        dominoList.add(new Domino(1, 4));
        dominoList.add(new Domino(2, 3));
        dominoList.add(new Domino(4, 4));
        System.out.println(domineService.check(dominoList));

        dominoList = new ArrayList<>();
        n = 2;
        dominoList.add(new Domino(2, 4));
        dominoList.add(new Domino(1, 3));
        System.out.println(domineService.check(dominoList));
    }
}
