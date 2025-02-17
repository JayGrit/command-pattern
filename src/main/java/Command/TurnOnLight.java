package Command;

public class TurnOnLight implements Command {
    Device device;
    public TurnOnLight(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOnLight();
    }
}
