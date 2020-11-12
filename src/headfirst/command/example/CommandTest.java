package headfirst.command.example;

import headfirst.command.example.light.LightOffCommand;
import headfirst.command.example.light.LightOnCommand;
import headfirst.command.example.light.Light;

/**
 * @Description
 * @ClassName CommandTest
 * @Author wangDi
 * @date 2020-11-11 17:34
 */
public class CommandTest {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        remoteControl.setCommand(0,new LightOnCommand(light),new LightOffCommand(light));

        remoteControl.onButtonWasPushed(0);
    }
}
