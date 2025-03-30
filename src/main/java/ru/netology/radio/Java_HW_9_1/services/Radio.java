package ru.netology.radio.Java_HW_9_1.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    // УПРАВЛЕНИЕ СТАНЦИЯМИ
    private int maxStation;
    private int minStation;
    private int currentStation = minStation;
    // УПРАВЛЕНИЕ ГРОМКОСТЬЮ
    private int maxVolume;
    private int minVolume;
    private int currentVolume = minVolume;

/*   public Radio(int size) {
        this.maxStation = size - 1;
    }

    public Radio() {
        this.maxStation = 9;
        this.maxVolume = 100;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }
*/
    public void setCurrentStation(int currentStation) { //допустимая станция и выставление станции через прямое указание п.4 ДЗ
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

   /* public int getCurrentVolume() {
        return currentVolume;
    }*/

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
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() { //переключение на станцию меньше
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
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