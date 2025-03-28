package ru.netology.radio.Java_HW_9_1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // ДОПУСТИМЫЙ НОМЕР СТАНЦИИ:
    @Test
    public void acceptableStation() { // проверка допустимого номера станции
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void minStation() { // минимальный номер станции граничное
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void moreMinStationBorder() { // больше минимального номера станции граничное
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void lessMaxStationBorder() { // меньше максимального номера станции граничное
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void MaxStation() { // максимальный номер станции граничное
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void moreMaxStationBorderNegative() { // больше максимального номера станции граничное негативное
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void lessMinStationBorderNegative() { // меньше минимального номера станции граничное негативное
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void lessMinStationNegative() { // меньше минимального номера станции негативная
        Radio radio = new Radio();
        radio.setCurrentStation(-5);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void moreMaxStationNegative() { // больше максимального номера станции негативная
        Radio radio = new Radio();
        radio.setCurrentStation(15);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    // МЕТОД УВЕЛИЧЕНИЯ НОМЕРА СТАНЦИИ:
    @Test
    public void increaseStation() { //допустимая станция переключение вперед
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.nextStation();

        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void increaseMinStation() {  //минимальная станция переключение вперед граничное
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.nextStation();

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void increaseMoreMinStationBorder() {  //больше минимальной станции переключение вперед граничное
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.nextStation();

        Assertions.assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void increaseLessMaxStationBorder() {  //меньше максимальной станции переключение вперед граничное
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void increaseMaxStationBorder() {  //максимальная станция переключение вперед граничное
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    // МЕТОД УМЕНЬШЕНИЯ НОМЕРА СТАНЦИИ:
    @Test
    public void decreaseStation() { //допустимая станция переключение назад
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.prevStation();

        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void decraseMinStation() {  //минимальная станция переключение назад граничное
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void decreaseMoreMinStationBorder() {  //больше минимальной станции переключение назад граничное
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void decreaseLessMaxStationBorder() {  //меньше максимальной станции переключение назад граничное
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prevStation();

        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void decreaseMaxStationBorder() {  //максимальная станция переключение назад граничное
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    //ДОПУСТМЫЙ УРОВЕНЬ ГРОМКОСТИ:
    @Test
    public void acceptableVolume() { // проверка допустимого уровня звука
        Radio radio = new Radio();
        radio.setCurrentVolume(3);

        Assertions.assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    public void minVolume() { // минимальный уровень звука граничное
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void moreMinVolumeBorder() { // больше минимального уровня звука граничное
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void lessMaxVolumeBorder() { // меньше максимального уровня звука граничное
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void MaxVolume() { // максимальный уровень звука граничное
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void moreMaxVolumeBorderNegative() { // больше максимального уровня звука граничное негативное
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void lessMinVolumeBorderNegative() { // меньше минимального уровня звука граничное негативное
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void lessMinVolumeNegative() { // меньше минимального уровня звука негативная
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void moreMaxVolumeNegative() { // больше максимального уровня звука негативная
        Radio radio = new Radio();
        radio.setCurrentVolume(120);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    //МЕТОД УВЕЛИЧЕНИЯ ГРОМКОСТИ:
    @Test
    public void increaseVolume() { //допустимая громкость увеличение
        Radio radio = new Radio();
        radio.setCurrentVolume(30);
        radio.increaseVolume();

        Assertions.assertEquals(31, radio.getCurrentVolume());
    }

    @Test
    public void increaseMinVolume() {  //минимальная громкость увеличение граничное
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void increaseMoreMinVolumeBorder() {  //больше минимальной громкости увеличение граничное
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseVolume();

        Assertions.assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void increaseLessMaxVolumeBorder() {  //меньше максимальной громкости увеличение граничное
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void increaseMaxVolumeBorder() {  //максимальная громкость увеличение граничное
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    // МЕТОД УМЕНЬШЕНИЯ ГРОМКОСТИ:
    @Test
    public void decreaseVolume() { //допустимая громкость уменьшение
        Radio radio = new Radio();
        radio.setCurrentVolume(30);
        radio.decreaseVolume();

        Assertions.assertEquals(29, radio.getCurrentVolume());
    }

    @Test
    public void decreaseMinVolume() {  //минимальная громкость уменьшение граничное
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void decreaseMoreMinVolumeBorder() {  //больше минимальной громкости уменьшение граничное
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void decreaseLessMaxVolumeBorder() {  //меньше максимальной громкости уменьшение граничное
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.decreaseVolume();

        Assertions.assertEquals(98, radio.getCurrentVolume());
    }

    @Test
    public void decreaseMaxVolumeBorder() {  //максимальная громкость уменьшение граничное
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }
}