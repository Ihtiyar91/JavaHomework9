public class Radio {
    private int currentRadioStation;
    private int numberCurrentStation = 10;
    private int MaxStation = 9;
    private int MinStation = 0;

    public Radio(int numberCurrentStation) {
        this.numberCurrentStation=numberCurrentStation;
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
        if (newCurrentRadioStation < MinStation) {
            return;
        }
        if (newCurrentRadioStation > MaxStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if ((currentRadioStation) == MaxStation) {
            currentRadioStation = MinStation;
        } else {
            this.currentRadioStation = currentRadioStation + 1;
        }

    }

    public void prevRadioStation() {
        if ((currentRadioStation) == MinStation) {
            currentRadioStation = MaxStation;
        } else {
            this.currentRadioStation = currentRadioStation - 1;
        }

    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    private int MaxVolume = 100;
    private int MinVolume = 0;

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < MinVolume) {
            return;
        }
        if (newCurrentVolume > MaxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < MaxVolume) {
            currentVolume = currentVolume + 1;

        }
    }

    public void decreaseVolume() {
        if (currentVolume > MinVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}