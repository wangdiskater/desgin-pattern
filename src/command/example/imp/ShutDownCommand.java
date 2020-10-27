package command.example.imp;

import command.example.Command;
import command.example.Computer;

/**
 * @Description
 * @ClassName ShutDownCommand
 * @Author wangDi
 * @date 2020-10-13 11:52
 */
public class ShutDownCommand implements Command {
    Computer computer;
    public ShutDownCommand(Computer computer) {
        this.computer = computer;
    }
    @Override
    public void execute() {
        computer.shutDown();
    }
}
