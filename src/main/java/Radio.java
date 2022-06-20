public class Radio {
    private int currentRadioStation;
    public int MaxStation = 9;
    public int MinStation = 0;

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
        if ((currentRadioStation ) == MaxStation) {
            currentRadioStation = MinStation;
        } else {
            this.currentRadioStation = currentRadioStation + 1;
        }

    }

    public void prevRadioStation() {
        if ((currentRadioStation) == MinStation) {
            currentRadioStation = MaxStation;
        } else  {
            this.currentRadioStation = currentRadioStation - 1;
        }

    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;

        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}