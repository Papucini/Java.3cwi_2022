package burtscher.OO.remote;

public class Main {
    public static void main(String[] args) {
        Battery b1 = new Battery("Lithium", 79);
        Battery b2 = new Battery("Lithium", 89);

        Remote r1 = new Remote();

        r1.addBatteries(b1);
        r1.addBatteries(b2);

        r1.getStatus();
        r1.turnOn();
        r1.turnOff();
    }
}
