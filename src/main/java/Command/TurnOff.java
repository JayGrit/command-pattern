package Command;

public class TurnOff implements Command {
    Device device;
    public TurnOff(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
