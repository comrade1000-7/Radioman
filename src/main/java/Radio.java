public class Radio {
    private int currentVolume;
    private int currentWave;

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

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void nextWave() {
        if (currentWave == 9) {
            setCurrentWave(0);
            return;
        }
        currentWave++;
    }

    public void prevWave() {
        if (currentWave == 0) {
            setCurrentWave(9);
            return;
        }
        currentWave--;
    }

}
