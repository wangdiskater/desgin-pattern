package firsttry.command.example.imp;

import firsttry.command.example.Command;
import firsttry.command.example.Computer;

/**
 * @Description
 * @ClassName RestartCommand
 * @Author wangDi
 * @date 2020-10-13 11:52
 */
public class RestartCommand implements Command {
    Computer computer;

    public RestartCommand(Computer computer) {
    }

    @Override
    public void execute() {
        computer.restart();
    }


}
