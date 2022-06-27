import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void test() {
        Radio rad = new Radio(20);
        rad .setCurrentRadioStation(15);
        Assertions.assertEquals(15, rad.getCurrentRadioStation());
    }
    @Test
    public void shouldNumberRadioStation() {
        Radio rad = new Radio(10);
        Assertions.assertEquals(10, rad.getNumberCurrentStation());
    }
    @Test
    public void shouldFirstRadioStation() {
        Radio rad = new Radio();

        rad .setCurrentRadioStation(0);

        int expected = 0;
        int actual =  rad .getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSecondRadioStation() {
        Radio  rad  = new Radio();

        rad .setCurrentRadioStation(1);

        int expected = 1;
        int actual =  rad .getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNegativRadioStation() {
        Radio  rad  = new Radio();

        rad .setCurrentRadioStation(-1);

        int expected = 0;
        int actual =  rad .getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNinthRadioStation() {
        Radio  rad  = new Radio();

        rad .setCurrentRadioStation(8);

        int expected = 8;
        int actual =  rad .getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLastRadioStation() {
        Radio  rad  = new Radio();

        rad .setCurrentRadioStation(9);

        int expected = 9;
        int actual =  rad .getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStation() {
        Radio  rad  = new Radio();

        rad .setCurrentRadioStation(10);

        int expected = 0;
        int actual =  rad .getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextFirstRadioStation() {
        Radio  rad  = new Radio();

        rad .setCurrentRadioStation(9);

        rad .nextRadioStation();

        int expected = 0;
        int actual =  rad .getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextRadioStation() {
        Radio  rad  = new Radio();

        rad .setCurrentRadioStation(6);

        rad .nextRadioStation();

        int expected = 7;
        int actual =  rad .getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevLastRadioStation() {
        Radio  rad  = new Radio();

        rad .setCurrentRadioStation(0);

        rad .prevRadioStation();

        int expected = 9;
        int actual =  rad .getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevRadioStation() {
        Radio  rad  = new Radio();

        rad .setCurrentRadioStation(2);

        rad .prevRadioStation();

        int expected = 1;
        int actual =  rad .getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMinVolume() {
        Radio  rad  = new Radio();

        rad .setCurrentVolume(0);

        int expected = 0;
        int actual =  rad .getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSecondVolume() {
        Radio  rad  = new Radio();

        rad .setCurrentVolume(1);

        int expected = 1;
        int actual =  rad .getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNegativVolume() {
        Radio  rad  = new Radio();

        rad .setCurrentVolume(-1);

        int expected = 0;
        int actual =  rad .getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTenVolume() {
        Radio  rad  = new Radio();

        rad .setCurrentVolume(99);

        int expected = 99;
        int actual =  rad .getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        Radio  rad  = new Radio();

        rad .setCurrentVolume(100);

        int expected = 100;
        int actual =  rad .getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotMaxVolume() {
        Radio  rad  = new Radio();

        rad .setCurrentVolume(101);

        int expected =0 ;
        int actual =  rad .getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad  = new Radio();

        rad .setCurrentVolume(100);

        rad .increaseVolume();

        int expected = 100;
        int actual =  rad .getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio  rad  = new Radio();

        rad .setCurrentVolume(110);

        rad .increaseVolume();

        int expected = 1;
        int actual =  rad .getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio  rad  = new Radio();

        rad .setCurrentVolume(1);

        rad .decreaseVolume();

        int expected = 0;
        int actual =  rad .getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio  rad  = new Radio();

        rad .setCurrentVolume(-1);

        rad .decreaseVolume();

        int expected = 0;
        int actual =  rad .getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}