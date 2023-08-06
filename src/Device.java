// File: Device.java
public abstract class Device implements RemoteControlObserver {
    protected String deviceName;
    protected boolean status;

    public Device(String deviceName) {
        this.deviceName = deviceName;
        this.status = false; // Default status perangkat mati
    }

    public void turnOn() {
        status = true;
        System.out.println(deviceName + " is turned ON");
    }

    public void turnOff() {
        status = false;
        System.out.println(deviceName + " is turned OFF");
    }
}
