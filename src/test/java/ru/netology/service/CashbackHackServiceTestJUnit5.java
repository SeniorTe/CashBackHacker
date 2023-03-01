package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTestJUnit5 {
    @Test
    public void shouldReturn100ByAmountUnder1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn300ByAmountOver1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 300;
        int actual = service.remain(1700);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroByAmount1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroByAmount5000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(5000);

        Assertions.assertEquals(expected, actual);
    }
}