package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDayMonday() {
        int expected = 1;
        String name = "Monday";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numberOfDayPonedelnik() {
        int expected = 1;
        String name = "Понедельник";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numberOfDayTuesday() {
        int expected = 2;
        String name = "Tuesday";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numberOfDayVtornik() {
        int expected = 2;
        String name = "Вторник";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numberOfDayWednesday() {
        int expected = 3;
        String name = "Wednesday";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numberOfDaySreda() {
        int expected = 3;
        String name = "Среда";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numberOfDayThursday() {
        int expected = 4;
        String name = "Thursday";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numberOfDayChetverg() {
        int expected = 4;
        String name = "Четверг";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numberOfDayFriday() {
        int expected = 5;
        String name = "Friday";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numberOfDayPyatnica() {
        int expected = 5;
        String name = "Пятница";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numberOfDaySaturday() {
        int expected = 6;
        String name = "Saturday";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numberOfDaySubbota() {
        int expected = 6;
        String name = "Суббота";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numberOfDaySunday() {
        int expected = 7;
        String name = "Sunday";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numberOfDayVoskresene() {
        int expected = 7;
        String name = "Воскресенье";
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }
}