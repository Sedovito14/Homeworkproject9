package netology.ru;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio station = new Radio();

        station.setCurrentStation(5);

        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        Radio station = new Radio();

        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio station = new Radio();

        station.setCurrentStation(11);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationIfMax() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.next();
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio station = new Radio();
        station.setCurrentStation(5);

        station.next();
        int expected = 6;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationIfMin() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        station.prev();
        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio station = new Radio();
        station.setCurrentStation(3);

        station.prev();
        int expected = 2;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeIfMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeIfMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(5);

        int expected = 5;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(105);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-7);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
