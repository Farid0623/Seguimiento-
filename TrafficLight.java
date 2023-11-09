package Predicate;

public class TrafficLight {
    private boolean switchedOn;

    public TrafficLight(boolean switchedOn) {
        this.switchedOn = switchedOn;
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public void setSwitchedOn(boolean switchedOn) {
        this.switchedOn = switchedOn;
    }
}
