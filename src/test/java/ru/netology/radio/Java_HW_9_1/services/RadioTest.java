package ru.netology.radio.Java_HW_9_1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetVolume() { // проверка текущего уровня звука
        Radio radio = new Radio();
        radio.setCurrentVolume(3);

        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // Граничные валидные значения Увеличение громкости:
    @Test
    public void increaseVolumeSetMin() {  //увеличение звук 0
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeSetMinPositive() {  //увеличение звук 1
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeSetMaxPositive() {  //увеличение звук 99
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeSetMax() {  //увеличение звук 100
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // Граничные не валидные значения Увеличение громкости:
    @Test
    public void increaseVolumeSetMaxNegative() {  //увеличение звук 101 текущий 0
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeSetMinNegative() {  //увеличение звук -1 текущий 0
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    // Граничные валидные значения Уменьшение громкости:
    @Test
    public void decreaseVolumeSetMin() {  //уменьшение звук 0
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeSetMinPositive() {  //уменьшение звук 1
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeSetMaxPositive() {  //уменьшение звук 99
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.decreaseVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeSetMax() {  //уменьшение звук 100
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // Граничные не валидные значения Увеличение громкости:
    @Test
    public void decreaseVolumeSetMaxNegative() {  //уменьшение звук 101 текущий 0
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeSetMinNegative() {  //уменьшние звук -1 текущий 0
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}