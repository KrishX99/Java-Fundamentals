package impl;

import interfaces.StringModInterface;

public class StringModImpl implements StringModInterface {
    public void modify(String message){
        System.out.println(message.toUpperCase());
    }
}
