package command.trial;

/**
 * @Description
 * @ClassName WorkCommand
 * @Author wangDi
 * @date 2020-10-13 14:07
 */
public class WorkCommand extends MyCommand {

    private Worker worker;

    public WorkCommand(Worker worker) {
        this.worker = worker;
    }

    @Override
    void excute() {
        worker.startWork();
    }
}
