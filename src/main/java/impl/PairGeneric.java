package impl;

import java.util.List;

public class PairGeneric < K , V>{

    private K key;
    private V value;

    public PairGeneric(K key , V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }


}
