package NoCommand;

public class Device {
    public String deviceName;

    public Device(String deviceName){
        this.deviceName = deviceName;
    }

    public void turnOn(){
        System.out.println("Turning on " + deviceName);
    }

    public void turnOff(){
        System.out.println("Turning off " + deviceName);
    }
}