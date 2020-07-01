package main.task6;

import java.util.ArrayList;
import java.util.List;

public class Group { // в группе хранится брусок из первой кучки и подходящие бруски из второй
    private int number;
    private List<Integer> list;

    public Group(int number, List<Integer> list) {
        this.number = number;
        this.list = new ArrayList<>();
        for (int n: list) {
            if (Math.abs(this.number - n) <= 1) {
                this.list.add(n);
            }
        }
    }

    public int getNumber() {
        return number;
    }

    public List<Integer> getList() {
        return list;
    }
}
