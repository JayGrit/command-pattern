package NoCommand;

public class Remote {

    public Device device;

    public Remote(Device device){
        this.device = device;
    }

    public void turnOn(){
        device.turnOn();
    }

    public void turnOff(){
        device.turnOff();
    }
}
