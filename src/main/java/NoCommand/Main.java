package NoCommand;


public class Main {
    public static void main(String[] args) {
        // 创建设备实例
        Device fridge = new Device("fridge");

        // 创建遥控器实例并直接传入设备
        Remote remoter = new Remote(fridge);

        // 使用遥控器控制设备开关
        remoter.turnOn();  // 打开设备
        remoter.turnOff(); // 关闭设备
        remoter.turnOnLight();
    }
}