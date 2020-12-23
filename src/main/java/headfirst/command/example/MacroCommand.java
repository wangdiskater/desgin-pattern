package headfirst.command.example;

import java.util.List;

/**
 * @Description party mode 相当于宏命令
 * @ClassName MacroCommand
 * @Author wangDi
 * @date 2020-11-12 10:54
 */
public class MacroCommand extends Command {
    List<Command> commandList;

    public MacroCommand(List<Command> commandList) {
        this.commandList = commandList;
    }

    @Override
    protected void execute() {
        commandList.forEach(command -> command.execute());
    }

    @Override
    protected void undo() {
        commandList.forEach(command -> command.undo());

    }
}
