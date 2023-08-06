// File: Light.java
public class Light extends Device {
    public Light(String deviceName) {
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

