public class Radio {
    private int currentRadioStation;
    private int numberCurrentStation = 10;
    private int maxStation =9 ;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int numberCurrentStation,int maxStation,int minStation ) {
        this.numberCurrentStation = numberCurrentStation;
        this.maxStation= maxStation;
        this.minStation = minStation;
    }

    public Radio() {
    }

    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minStation) {
            return;
        }
        if (newCurrentRadioStation > maxStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if ((currentRadioStation) == maxStation) {
            currentRadioStation = minStation;
        } else {
            this.currentRadioStation = currentRadioStation + 1;
        }

    }

    public void prevRadioStation() {
        if ((currentRadioStation) == minStation) {
            currentRadioStation = maxStation;
        } else {
            this.currentRadioStation = currentRadioStation - 1;
        }

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;

        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}