package ru.netology.radio.Java_HW_9_1.services;

public class Radio {

    private int currentStation; // УПРАВЛЕНИЕ СТАНЦИЯМИ
    private int currentVolume; // УПРАВЛЕНИЕ ЗВУКОМ

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) { //допустимая станция и выставление станции через прямое указание п.4 ДЗ
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) { //допустимый уровень звука
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() { //переключение на станцию выше
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() { //переключение на станцию меньше
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public void increaseVolume() { // увеличение громкости
        if (currentVolume != 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() { // уменьшение громкости
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
}