import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationAboveLimits() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(30);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationBelowLimits() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationToZero() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(0);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationToNinth() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(29);
        Assertions.assertEquals(29, radio.getCurrentStation());
    }

    @Test
    public void NextStationFromMax() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(29);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void NextStationFromMiddle() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(15);
        radio.nextStation();
        Assertions.assertEquals(16, radio.getCurrentStation());
    }

    @Test
    public void PrevStationFromMin() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(29, radio.getCurrentStation());
    }

    @Test
    public void PrevStationFromMiddle() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(16);
        radio.prevStation();
        Assertions.assertEquals(15, radio.getCurrentStation());
    }

    @Test
    public void currentVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void currentVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void currentVolumeMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);
        Assertions.assertEquals(55, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumesFromMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumesFromMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(44);
        radio.increaseVolume();
        Assertions.assertEquals(45, radio.getCurrentVolume());
    }

    @Test
    public void downVolumesFromMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.downVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void downVolumesFromMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(69);
        radio.downVolume();
        Assertions.assertEquals(68, radio.getCurrentVolume());
    }
}
