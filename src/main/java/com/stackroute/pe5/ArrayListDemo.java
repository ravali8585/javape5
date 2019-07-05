package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    private List<String> stringList = new ArrayList<>();

    // convert array of string to List
    public List<String> addArray(String[] inputArray) {
        for (String input : inputArray) {
            stringList.add(input);
        }
        return stringList;
    }

    //  remove all element of list
    public List<String> removeAll() {
        stringList.clear();
        return stringList;
    }

    // replace list value with respective index
    public List<String> update(int index, String value) {
        stringList.set(index, value);
        return stringList;
    }
}
