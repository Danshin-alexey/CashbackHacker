package ru.netology.ru.netology.unit_hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    void shouldReturn900ifAmountIs1100 () {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;
        int actual = cashbackHackService.remain(amount);
        int expected = 900;

        assertEquals(expected, actual);
    }
    @Test
    void shouldReturn100ifAmountIs900 () {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
    @Test
    void shouldReturn0ifAmountIs1000 () {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}
