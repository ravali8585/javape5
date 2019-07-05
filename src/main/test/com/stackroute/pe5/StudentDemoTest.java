package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentDemoTest {
    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testStudent() {

        List<StudentDemo> students = new ArrayList<>();
        StudentDemo obj1 = new StudentDemo(1, "Ajay", 27);
        StudentDemo obj2 = new StudentDemo(2, "Sneha", 23);
        StudentDemo obj3 = new StudentDemo(3, "Simran", 37);
        StudentDemo obj4 = new StudentDemo(4, "Ajay", 22);
        StudentDemo obj5 = new StudentDemo(5, "Ajay", 29);
        StudentDemo obj6 = new StudentDemo(6, "Sneha", 22);
        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);
        students.add(obj6);

        //BEFORE SORTING


        Collections.sort(students,new StudentSorter());

        // After Sorting

        String expected="[Student{id=3, name='Simran', age=37}, Student{id=5, name='Ajay', age=29}, Student{id=1, name='Ajay', age=27}, Student{id=2, name='Sneha', age=23}, Student{id=6, name='Sneha', age=22}, Student{id=4, name='Ajay', age=22}]";
        assertEquals(expected, students.toString());


    }

}