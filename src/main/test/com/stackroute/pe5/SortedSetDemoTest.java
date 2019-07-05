package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedSetDemoTest {
    SortedSetDemo sortedSetDemo;
    @Before
    public void setUp() throws Exception {
        sortedSetDemo=new SortedSetDemo();
    }

    @After
    public void tearDown() throws Exception {
        sortedSetDemo=null;
    }

    @Test
    public void sortArrayListUsingSortedSet() {
        String expected="[Alice, Bluto, Eugene, Harry, Olive]";
        String actual=sortedSetDemo.sortArrayListUsingSortedSet("Harry Olive Alice Bluto Eugene");
        assertEquals(expected,actual);
    }

    @Test
    public void sortArrayListUsingSortedSetNull() {

        String actual=sortedSetDemo.sortArrayListUsingSortedSet(null);
        assertNull(actual);
    }


}