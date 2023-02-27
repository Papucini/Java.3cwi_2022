package burtscher.OO.remote;

public class Battery {
    private String BatteryType;

    public Battery(String lithium, String aa, int chargingLevel) {
    }

    private int chargingLevel;

    public Battery(String BatteryType, int chargingLevel) {
        this.BatteryType = BatteryType;
        this.chargingLevel = chargingLevel;
    }

    public int getChargingLevel() {
        return chargingLevel;
    }

    public void setChargingLevel(int chargingLevel) {
        this.chargingLevel = chargingLevel;
    }

    public String getBatteryType() {
        return BatteryType;
    }
}