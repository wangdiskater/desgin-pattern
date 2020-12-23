package headfirst.command.example;

/**
 * @Description
 * @ClassName Command
 * @Author wangDi
 * @date 2020-11-11 16:10
 */
public abstract class Command {

    protected abstract void execute();

    protected abstract void undo();
}
