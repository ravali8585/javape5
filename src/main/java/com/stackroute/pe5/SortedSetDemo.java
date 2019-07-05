package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

        //    method is used to implement set interface which sorts the given randomly ordered names in
        //    ascending order
        public String sortArrayListUsingSortedSet(String string) {
            if (string == null) return null;
            //Arrays.asList is used to return a fixed-size list backed by the specified array.
            SortedSet<String> sortedSet = new TreeSet<>(Arrays.asList(string.split(" ")));

            return new ArrayList<String>(sortedSet).toString();
        }
    }

