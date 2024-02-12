package ru.netolgy;

import org.junit.Test;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void testBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;

        int actual = cashbackHackService.remain(amount);

        int expected = 0;

        assertEquals(actual, expected);
    }
}