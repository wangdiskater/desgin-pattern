package command.trial;

/**
 * @Description
 * @ClassName StopWorkCommand
 * @Author wangDi
 * @date 2020-10-13 14:08
 */
public class StopWorkCommand  extends MyCommand{
    private Worker worker;

    public StopWorkCommand(Worker worker) {
        this.worker = worker;
    }

    @Override
    void excute() {
        worker.stopWork();
    }
}
