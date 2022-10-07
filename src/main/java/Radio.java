public class Radio {
    private int currentVolume;
    private int maxVolume;

    private int currentWave;
    private int amountRadioStation;
    private int maxRadioStation;


    public Radio(int amountRadioStation) {
        this.maxVolume = 100;
        this.amountRadioStation = amountRadioStation;
        this.maxRadioStation = amountRadioStation - 1;
    }

    public Radio() {
        this.maxVolume = 100;
        this.amountRadioStation = 10;
        this.maxRadioStation = amountRadioStation - 1;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setCurrentWave(int currentWave) {
        this.currentWave = currentWave;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void nextWave() {
        if (currentWave == maxRadioStation) {
            setCurrentWave(0);
            return;
        }
        currentWave++;
    }

    public void prevWave() {
        if (currentWave == 0) {
            setCurrentWave(maxRadioStation);
            return;
        }
        currentWave--;
    }

}
