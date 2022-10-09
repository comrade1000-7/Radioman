import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class Radio {
    private int currentVolume;
    private int maxVolume;

    private int currentWave;
    private int amountRadioStation;
    private int maxRadioStation;

    public Radio() {
        this.maxVolume = 100;
        this.amountRadioStation = 10;
        this.maxRadioStation = amountRadioStation - 1;
    }


    public Radio(int amountRadioStation) {
        this.maxVolume = 100;
        this.amountRadioStation = amountRadioStation;
        this.maxRadioStation = amountRadioStation - 1;
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
