package headfirst.command.example.light;

import headfirst.command.example.Command;

/**
 * @Description
 * @ClassName LightOffCommand
 * @Author wangDi
 * @date 2020-11-11 16:24
 */
public class LightOffCommand extends Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    protected void execute() {
        getLight().off();
    }

    @Override
    protected void undo() {
        getLight().on();
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }
}
