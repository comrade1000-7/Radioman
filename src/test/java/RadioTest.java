import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNextWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(7);
        radio.nextWave();

        int expected = 8;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextWaveZero() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);
        radio.nextWave();

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(8);
        radio.prevWave();

        int expected = 7;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevWaveNine() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);
        radio.prevWave();

        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
