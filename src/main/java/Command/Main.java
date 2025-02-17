package Command;

public class Main {
    public static void main(String[] args) {
        Device fridge = new Device("fridge");

        Remote remoter = new Remote();

        Command turnOn = new TurnOn(fridge);
        Command turnOff = new TurnOff(fridge);


        remoter.setCommand(turnOn);
        remoter.press();
        remoter.setCommand(turnOff);
        remoter.press();
    }
}
