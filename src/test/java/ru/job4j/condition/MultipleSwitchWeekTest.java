package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDay1() {
        int expected = 1;
        String name = "Monday";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }
}