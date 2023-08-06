// File: RemoteControlSubject.java
public interface RemoteControlSubject {
    void addObserver(RemoteControlObserver observer);
    void removeObserver(RemoteControlObserver observer);
    void notifyObservers(String deviceName, boolean status);
}
