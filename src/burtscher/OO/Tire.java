package burtscher.OO;

public class Tire {
    private enum TYPE {STREET, OFFROAD}
    private int rimSize;
    private String rimType;
    private TYPE tireType;



    public Tire(int rimSize, String rimType, Tire.TYPE tireType) {
        this.rimSize = rimSize;
        this.rimType = rimType;
        this.tireType = tireType;
    }

    //Getters and Setters


    public int getRimSize() {
        return rimSize;
    }

    public void setRimSize(int rimSize) {
        this.rimSize = rimSize;
    }

    public String getRimType() {
        return rimType;
    }

    public void setRimType(String rimType) {
        this.rimType = rimType;
    }

    public TYPE getTireType() {
        return tireType;
    }

    public void setTireType(TYPE tireType) {
        this.tireType = tireType;
    }
}