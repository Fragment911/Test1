package main.task6;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupService {
    int checkPairs(List<Group> groupList) {
        int number = 0;
        while (groupList.size() > 0) {
            Group group = groupList.stream().min(Comparator.comparingInt(x -> x.getList().size())).get();
            if (group.getList().size() != 0) {
                int min = getMin(group, groupList);
                for (Group group1 : groupList) {
                    group1.getList().remove((Integer)min);
                }
                number++;
            }
            groupList.remove(group);
        }
        return number;
    }

    int getMin(Group group, List<Group> groupList) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int n: group.getList()) {
            if (integerMap.containsKey(n)) continue;
            for (Group group1: groupList) {
                if (group1.getList().contains(n)) {
                    integerMap.compute(n, (i1, i2) -> i2 == null ? 1 : i2 + 1);
                }
            }
        }
        return integerMap.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();
    }
}
