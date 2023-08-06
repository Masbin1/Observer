// File: Main.java
public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room Light");
        Fan ceilingFan = new Fan("Ceiling Fan");
        Door frontDoor = new Door("Front Door");

        // Menambahkan perangkat ke remote control sebagai observer
        remoteControl.addObserver(livingRoomLight);
        remoteControl.addObserver(ceilingFan);
        remoteControl.addObserver(frontDoor);

        // Menghidupkan dan mematikan perangkat menggunakan remote control
        remoteControl.onButtonPress("Living Room Light", true);
        remoteControl.onButtonPress("Ceiling Fan", true);
        remoteControl.onButtonPress("Front Door", true);

        remoteControl.onButtonPress("Living Room Light", false);
        remoteControl.onButtonPress("Ceiling Fan", false);
        remoteControl.onButtonPress("Front Door", false);
    }
}
