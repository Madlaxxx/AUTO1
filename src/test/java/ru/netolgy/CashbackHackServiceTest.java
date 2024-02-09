package ru.netolgy;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 800;

        int actual = cashbackHackService.remain(amount);

        int expected = 200;

        assertEquals(actual, expected);
    }
}