// File: RemoteControl.java
import java.util.ArrayList;
import java.util.List;

public class RemoteControl implements RemoteControlSubject {
    private List<RemoteControlObserver> observers;

    public RemoteControl() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(RemoteControlObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(RemoteControlObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String deviceName, boolean status) {
        for (RemoteControlObserver observer : observers) {
            observer.update(deviceName, status);
        }
    }

    // Metode untuk menerima perintah dari pengguna dan mengirimkan pembaruan status ke perangkat yang berlangganan
    public void onButtonPress(String deviceName, boolean status) {
        // Mengirimkan perintah ke perangkat yang berlangganan
        notifyObservers(deviceName, status);
    }
}
