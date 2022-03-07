package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumFrom0To5Then15() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        assertEquals(expected, result);
    }

    @Test
    public void whenSumFrom0To10Then55() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        assertEquals(expected, result);
    }

    @Test
    public void whenSumFrom3To8Then33() {
        int start = 3;
        int finish = 8;
        int result = Counter.sum(start, finish);
        int expected = 33;
        assertEquals(expected, result);
    }

    @Test
    public void whenSumFrom1To1Then1() {
        int start = 1;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void whenSumFrom5To8Then1() {
        int start = 5;
        int finish = 8;
        int result = Counter.sum(start, finish);
        int expected = 26;
        assertEquals(expected, result);
    }

    @Test
    public void whenSumFrom3To5Then12() {
        int start = 3;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 12;
        assertEquals(expected, result);
    }

    @Test
    public void whenSumFrom3To7Then25() {
        int start = 3;
        int finish = 7;
        int result = Counter.sum(start, finish);
        int expected = 25;
        assertEquals(expected, result);
    }

    @Test
    public void sumByEvenFrom0To10Then30() {
        int start = 0;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertEquals(expected, result);
    }

    @Test
    public void sumByEvenFrom3To8Then18() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertEquals(expected, result);
    }

    @Test
    public void sumByEvenFrom1To1Then0() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertEquals(expected, result);
    }
}