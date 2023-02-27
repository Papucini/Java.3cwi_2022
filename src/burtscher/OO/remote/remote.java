package burtscher.OO.remote;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private List<Battery> batteries;

    public Remote() {
        this.batteries = new ArrayList<>();
    }

    public void addBatteries(Battery batteries) {
        this.batteries.add(batteries);
    }

    public void getStatus() {
        int numberOfBatteries = this.batteries.size();
        int sumChargingLevel = 0;
        for (int i = 0; i < numberOfBatteries; i++) {
            sumChargingLevel = sumChargingLevel + this.batteries.get(i).getChargingLevel();
        }
        int avgChargingLevel = sumChargingLevel / numberOfBatteries;
        System.out.println("Der aktuelle, durchschnittliche, Ladestand der Batterien beträgt: " + avgChargingLevel + "%");

    }

    public void turnOn() {
        int numberOfBatteries = this.batteries.size();
        int newChargingLevel = 0;
        for (int i = 0; i < numberOfBatteries; i++) {
            newChargingLevel = (this.batteries.get(i).getChargingLevel() - 5);
            this.batteries.get(i).setChargingLevel(newChargingLevel);
            System.out.println("Verbraucher wurde angeschlossen!");
            System.out.println("Der neue Ladestand beträgt: " + newChargingLevel + "%");
        }
    }

    public void turnOff() {
        int numberOfBatteries = this.batteries.size();
        for (int i = 0; i < numberOfBatteries; i++) {
            System.out.println("Keine Verbraucher angeschlossen!");
        }
    }

}
