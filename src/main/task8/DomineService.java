package main.task8;

import java.util.List;

public class DomineService {
    public int check(List<Domino> dominoList) {
        int sumUp = dominoList.stream().mapToInt(Domino::getUp).sum();
        int sumDown = dominoList.stream().mapToInt(Domino::getDown).sum();

        if ((sumUp - sumDown) % 2 != 0) { // если разница между суммами всех верхних и всех нижних нечетная, то никак не решить
            return -1;
        }

        if (sumUp % 2 == 0 && sumDown % 2 == 0) { // если уже выполнено, то ничего поворачивать не нужно
            return 0;
        }

        for (Domino domino: dominoList) { // иначе нужно найти костяшку с нечетной разницей чисел
            if (domino.getUp() - domino.getDown() % 2 == 1) {
                return 1;
            }
        }

        // если не нашли, то никак не решить
        return -1;
    }
}
