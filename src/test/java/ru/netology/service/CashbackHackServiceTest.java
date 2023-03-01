package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100ByAmountUnder1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn300ByAmountOver1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 300;
        int actual = service.remain(1700);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroByAmount1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroByAmount5000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(5000);

        assertEquals(expected, actual);
    }
}