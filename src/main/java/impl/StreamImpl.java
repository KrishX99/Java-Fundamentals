package impl;

import constant.OperationType;
import jdk.dynalink.Operation;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamImpl {

    //Map
    public List<Integer> multiplyBy2(List<Integer> list) {
        return list.stream().map(el -> el * 2).collect(Collectors.toList());
    }

    //Filter
    public List<Integer> filterList(List<Integer> list) {
        return list.stream().filter(el -> el % 2 == 0).collect(Collectors.toList());
    }

    //Count
    public Long countElements(List<Integer> list) {
        return list.stream().count();
    }

    //Distinct
    public List<Integer> distinctList(List<Integer> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    //Reduce
    public Integer reduceOperation(List<Integer> list, OperationType operationType) {
        if (operationType == OperationType.MAX) {
            return list.stream().reduce(Integer.MIN_VALUE, (a, b) -> a.compareTo(b) > 0 ? a : b);
        } else if (operationType == OperationType.MIN) {
            return list.stream().reduce(Integer.MAX_VALUE, (a, b) -> a.compareTo(b) > 0 ? b : a);
        } else if (operationType == OperationType.SUM) {
            return list.stream().reduce(0, (a, b) -> a + b);
        }

        return 0;
    }


    //sorted
    public List<Integer> sortList(List<Integer> list) {
        Comparator<Integer> comparator = (a, b) -> b.compareTo(a);
        return list.stream().sorted(comparator).collect(Collectors.toList());
    }

    //GroupingBy
    public Map<Integer, List<Integer>> groupByValue(List<Integer> list) {
        return list.stream().collect(Collectors.groupingBy(el -> el));
    }

}
