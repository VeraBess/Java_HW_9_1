package ru.netology.radio.Java_HW_9_1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //ТЕСТЫ ДЛЯ ПОЛЬЗОВАТЕЛЬСКОГО КОЛИЧЕСВТВА СТАНЦИЙ:
    Radio radio = new Radio(40);

    @Test
    void radioStationCount() { // пользовательское кол-во радиостанций

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(39, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    // ГРАНИЧНЫЕ ЗНАЧЕНИЯ ДЛЯ КОЛИЧЕСТВА СТАНЦИЙ:
    @Test
    void acceptableStationManualSize() { //допустимый номер станции пользователький
        radio.setCurrentStation(15);

        Assertions.assertEquals(15, radio.getCurrentStation());
    }

    @Test
    void minStationManualSize() { // минимальный номер станции граничное пользовательский
        radio.setCurrentStation(0);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void moreMinStationBorderManualSize() { // больше минимального номера станции граничное пользовательский
        radio.setCurrentStation(1);

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void lessMaxStationBorderManualSize() { // меньше максимального номера станции граничное пользовательский
        radio.setCurrentStation(radio.getMaxStation() - 1);
        int expected = radio.getMaxStation() - 1;

        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void maxStationManualSizeManualSize() { // максимальный номер станции граничное пользовательский
        radio.setCurrentStation(radio.getMaxStation()); //!!!!!!!!!!!
        int expected = radio.getMaxStation();

        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void moreMaxStationBorderNegativeManualSize() { // больше максимального номера станции граничное негативное пользовательский
        radio.setCurrentStation(radio.getMaxStation() + 1);
        int expected = radio.getMinStation();

        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void lessMinStationBorderNegativeManualSize() { // меньше минимального номера станции граничное негативное пользовательский
        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    // УВЕЛИЧЕНИЕ НОМЕРА СТАНЦИИ ПОЛЬЗОВАТЕЛЬСКИЙ РАЗМЕР
    @Test
    void increaseStationManualSize() { //допустимая станция увеличение пользовательский
        radio.setCurrentStation(20);
        radio.nextStation();

        Assertions.assertEquals(21, radio.getCurrentStation());
    }

    @Test
    void increaseMinStationManualSize() {  //минимальная станция увеличение граничное пользовательский
        radio.setCurrentStation(0);
        radio.nextStation();

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void increaseMoreMinStationBorderManualSize() {  //больше минимальной станции увеличение граничное пользовательское
        radio.setCurrentStation(1);
        radio.nextStation();

        Assertions.assertEquals(2, radio.getCurrentStation());
    }

    @Test
    void increaseLessMaxStationBorderManualSize() {  //меньше максимальной станции увеличение граничное пользовательское
        radio.setCurrentStation(radio.getMaxStation() - 1);
        radio.nextStation();
        int expected = radio.getMaxStation();

        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void increaseMaxStationBorderManualSize() {  //максимальная станция увеличение граничное пользовательское
        radio.setCurrentStation(radio.getMaxStation());
        radio.nextStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    // УМЕНЬШЕНИЕ НОМЕРА СТАНЦИИ ПОЛЬЗОВАТЕЛЬСКИЙ РАЗМЕР
    @Test
    void decreaseStationManualSize() { //допустимая станция уменьшение пользовательский
        radio.setCurrentStation(25);
        radio.prevStation();

        Assertions.assertEquals(24, radio.getCurrentStation());
    }

    @Test
    void decraseMinStationManualSize() {  //минимальная станция уменьшение граничное пользовательский
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = radio.getMaxStation();

        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void decreaseMoreMinStationBorderManualSize() {  //больше минимальной станции уменьшение граничное пользовательский
        radio.setCurrentStation(1);
        radio.prevStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void decreaseLessMaxStationBorderManualSize() {  //меньше максимальной станции уменьшение граничное пользовательский
        radio.setCurrentStation(radio.getMaxStation() - 1);
        radio.prevStation();
        int expected = radio.getMaxStation() - 2;

        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void decreaseMaxStationBorderManualSize() {  //максимальная станция уменьшение граничное пользовательский
        radio.setCurrentStation(radio.getMaxStation());
        radio.prevStation();
        int expected = radio.getMaxStation() - 1;

        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    // ТЕСТЫ ДЛЯ КОЛ-ВА СТАНЦИЙ ПО УМОЛЧАНИЮ:
    Radio radioFix = new Radio();

    @Test
    void radioStationFix(){// фиксированное кол-во станций
        Radio radio = new Radio();

        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    //ГРАНИЧНЫЕ ЗНАЧЕНИЯ ДЛЯ КОЛ-ВА СТАНЦИЙ ПО УМОЛЧАНИЮ
    @Test
    void acceptableStation() { // проверка допустимого номера станции
        radioFix.setCurrentStation(5);

        Assertions.assertEquals(5, radioFix.getCurrentStation());
    }

    @Test
    void minStation() { // минимальный номер станции граничное
        radioFix.setCurrentStation(0);

        Assertions.assertEquals(0, radioFix.getCurrentStation());
    }

    @Test
    void moreMinStationBorder() { // больше минимального номера станции граничное
        radioFix.setCurrentStation(1);

        Assertions.assertEquals(1, radioFix.getCurrentStation());
    }

    @Test
    void lessMaxStationBorder() { // меньше максимального номера станции граничное
        radioFix.setCurrentStation(8);

        Assertions.assertEquals(8, radioFix.getCurrentStation());
    }

    @Test
    void maxStation() { // максимальный номер станции граничное
        radioFix.setCurrentStation(9); //!!!!!!!!!!!

        Assertions.assertEquals(9, radioFix.getCurrentStation());
    }

    @Test
    void moreMaxStationBorderNegative() { // больше максимального номера станции граничное негативное
        radioFix.setCurrentStation(10);

        Assertions.assertEquals(0, radioFix.getCurrentStation());
    }

    @Test
    void lessMinStationBorderNegative() { // меньше минимального номера станции граничное негативное
        radioFix.setCurrentStation(-1);

        Assertions.assertEquals(0, radioFix.getCurrentStation());
    }

    @Test
    void lessMinStationNegative() { // меньше минимального номера станции негативная
        radioFix.setCurrentStation(-5);

        Assertions.assertEquals(0, radioFix.getCurrentStation());
    }

    @Test
    void moreMaxStationNegative() { // больше максимального номера станции негативная
        radioFix.setCurrentStation(15);

        Assertions.assertEquals(0, radioFix.getCurrentStation());
    }

    // УВЕЛИЧЕНИЯ НОМЕРА СТАНЦИИ РАЗМЕР ПО УМОЛЧАНИЮ:
    @Test
    void increaseStation() { //допустимая станция увеличение
        radioFix.setCurrentStation(6);
        radioFix.nextStation();

        Assertions.assertEquals(7, radioFix.getCurrentStation());
    }

    @Test
    void increaseMinStation() {  //минимальная станция увеличение граничное
        radioFix.setCurrentStation(0);
        radioFix.nextStation();

        Assertions.assertEquals(1, radioFix.getCurrentStation());
    }

    @Test
    void increaseMoreMinStationBorder() {  //больше минимальной станции увеличение граничное
        radioFix.setCurrentStation(1);
        radioFix.nextStation();

        Assertions.assertEquals(2, radioFix.getCurrentStation());
    }

    @Test
    void increaseLessMaxStationBorder() {  //меньше максимальной станции увеличение граничное
        radioFix.setCurrentStation(8);
        radioFix.nextStation();

        Assertions.assertEquals(9, radioFix.getCurrentStation());
    }

    @Test
    void increaseMaxStationBorder() {  //максимальная станция увеличение граничное
        radioFix.setCurrentStation(9);
        radioFix.nextStation();

        Assertions.assertEquals(0, radioFix.getCurrentStation());
    }

    // УМЕНЬШЕНИЕ НОМЕРА СТАНЦИИ РАЗМЕР ПО УМОЛЧАНИЮ:
    @Test
    void decreaseStation() { //допустимая станция уменьшение
        radioFix.setCurrentStation(6);
        radioFix.prevStation();

        Assertions.assertEquals(5, radioFix.getCurrentStation());
    }

    @Test
    void decraseMinStation() {  //минимальная станция уменьшение граничное
        radioFix.setCurrentStation(0);
        radioFix.prevStation();

        Assertions.assertEquals(9, radioFix.getCurrentStation());
    }

    @Test
    void decreaseMoreMinStationBorder() {  //больше минимальной станции уменьшение граничное
        radioFix.setCurrentStation(1);
        radioFix.prevStation();

        Assertions.assertEquals(0, radioFix.getCurrentStation());
    }

    @Test
    void decreaseLessMaxStationBorder() {  //меньше максимальной станции уменьшение граничное
        radioFix.setCurrentStation(8);
        radioFix.prevStation();

        Assertions.assertEquals(7, radioFix.getCurrentStation());
    }

    @Test
    void decreaseMaxStationBorder() {  //максимальная станция уменьшение граничное
        radioFix.setCurrentStation(9);
        radioFix.prevStation();

        Assertions.assertEquals(8, radioFix.getCurrentStation());
    }

/*
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
    }*/
}