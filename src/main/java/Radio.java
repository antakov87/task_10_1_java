public class Radio {
    private int currentStation;
    private  int maxStation;
    private int currentVolume;

    public Radio() {
        this.maxStation = 10;
    }

    public Radio(int maxStation){
        this.maxStation = maxStation;
    }

    public int getCurrentStation()
    {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation >= maxStation - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation <= 0) {
            currentStation = maxStation - 1;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= 100) {
            currentVolume = 100;
        } else {
            currentVolume++;
        }
    }

    public void downVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else {
            currentVolume--;
        }
    }
}
