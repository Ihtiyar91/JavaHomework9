import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void test() {
        Radio rad = new Radio(10);
        Assertions.assertEquals(10, rad.getNumberCurrentStation());
    }
    @Test
    public void shouldFirstRadioStation() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(0);

        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSecondRadioStation() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(1);

        int expected = 1;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNegativRadioStation() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNinthRadioStation() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(8);

        int expected = 8;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLastRadioStation() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(9);

        int expected = 9;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStation() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(10);

        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextFirstRadioStation() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(9);

        cond.nextRadioStation();

        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextRadioStation() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(6);

        cond.nextRadioStation();

        int expected = 7;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevLastRadioStation() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(0);

        cond.prevRadioStation();

        int expected = 9;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevRadioStation() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(2);

        cond.prevRadioStation();

        int expected = 1;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMinVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(0);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSecondVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(1);

        int expected = 1;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNegativVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-1);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTenVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(99);

        int expected = 99;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);

        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotMaxVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(101);

        int expected =0 ;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);

        cond.increaseVolume();

        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(110);

        cond.increaseVolume();

        int expected = 1;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(1);

        cond.decreaseVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-1);

        cond.decreaseVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}