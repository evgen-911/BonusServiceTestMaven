import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shoutCalculateRegistredAndUnderlimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):

        assertEquals(expected, actual);
    }

    @Test
    void shoutCalculateRegistredAndOverlimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):

        assertEquals(expected, actual);
    }
    @Test
    void shoutCalculateRegistredAndBoundlimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 16667_66;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):

        assertEquals(expected, actual);
    }

    @Test
    void shoutCalculateNotRegistredUnderlimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 10000_60;
        boolean registered = false;
        long expected = 100;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):

        assertEquals(expected, actual);
    }

    @Test
    void shoutCalculateNotRegistredAndOverlimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 150000_60;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):

        assertEquals(expected, actual);
    }
    @Test
    void shoutCalculateNotRegistredAndBoundlimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 50000_60;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):

        assertEquals(expected, actual);
    }
}