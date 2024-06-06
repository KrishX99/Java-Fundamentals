package impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionalInterfaceImpl {

    //Predicate: takes T return boolean
    List<Integer> predicateDemo(List<Integer> list){
        return list.stream().filter( el -> el % 2 == 0).collect(Collectors.toList());
    }

    //Function : takes T return V
    List<Integer> functionDemo(List<Integer> list){
        return list.stream().map(el -> el * 2).collect(Collectors.toList());
    }

    //Consumer : takes T return void
    void consumerDemo(List<Integer> list){
        list.forEach(el -> System.out.println("We are on: " + el));
    }

    //Supplier: no argument, returns T
    Supplier<Double> supplierDemo(){
        return () -> Math.random();
    }

    //Comparator : takes T,V and return int
    List<Integer> comparatorDemo(List<Integer> list){
        Comparator<Integer> comparator = (a,b) -> Integer.compare(b,a);
        Collections.sort(list , comparator);
        return list;
    }

}
