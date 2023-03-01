package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100ByAmountUnder1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn300ByAmountOver1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 300;
        int actual = service.remain(1700);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnZeroByAmount1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnZeroByAmount5000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(5000);

        assertEquals(actual, expected);
    }
}