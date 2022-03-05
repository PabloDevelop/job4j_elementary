package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void nameOfDayMonday() {
        String expected = "Monday";
        int day = 1;
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void nameOfDayTuesday() {
        String expected = "Tuesday";
        int day = 2;
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void nameOfDayWednesday() {
        String expected = "Wednesday";
        int day = 3;
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void nameOfDayThursday() {
        String expected = "Thursday";
        int day = 4;
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void nameOfDayFriday() {
        String expected = "Friday";
        int day = 5;
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void nameOfDaySaturday() {
        String expected = "Saturday";
        int day = 6;
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void nameOfDaySunday() {
        String expected = "Sunday";
        int day = 7;
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void nameOfDayError() {
        String expected = "Ошибка";
        int day = 8;
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }
}