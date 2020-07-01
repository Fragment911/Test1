package main.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String ... args) {
        GroupService groupService = new GroupService();

        List<Integer> list1 = Arrays.asList(3, 2, 4, 7, 8);
        List<Integer> list2 = Arrays.asList(2, 1, 6, 3);

        List<Group> groupList = new ArrayList<>();

        for (int n: list1) { // формируем список брусков первой кучки с внутреннм списоком подходящих кусков из второй кучки
            groupList.add(new Group(n, list2));
        }

        System.out.println(groupService.checkPairs(groupList));

    }
}
