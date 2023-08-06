// File: Fan.java
public class Fan extends Device {
    public Fan(String deviceName) {
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

