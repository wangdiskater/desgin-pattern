package headfirst.command.example.stereo;

import headfirst.command.example.Command;

/**
 * @Description
 * @ClassName StereoOnWithCommand
 * @Author wangDi
 * @date 2020-11-12 10:51
 */
public class StereoOnWithCommand extends Command {
    Stereo stereo;

    public StereoOnWithCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    protected void execute() {
        stereo.on();
        stereo.setCd(new CD());
        stereo.setVolume(11);
    }

    @Override
    protected void undo() {

        stereo.off();
    }
}
