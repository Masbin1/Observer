// File: Door.java
public class Door extends Device {
    public Door(String deviceName) {
        super(deviceName);
    }

    @Override
    public void update(String deviceName, boolean status) {
        if (this.deviceName.equals(deviceName)) {
            if (status) {
                turnOn();
            } else {
                turnOff();
            }
        }
    }
}
