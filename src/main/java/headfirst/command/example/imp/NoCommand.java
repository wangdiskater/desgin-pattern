package headfirst.command.example.imp;

import headfirst.command.example.Command;

/**
 * @Description
 * @ClassName NoCommand
 * @Author wangDi
 * @date 2020-11-11 16:12
 */
public class NoCommand extends Command {
    @Override
    public void execute() {
        System.out.println("no command");
    }

    @Override
    protected void undo() {

    }
}
