package Command;

public class Remote {
    public Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void press(){
        command.execute();
    }
}
