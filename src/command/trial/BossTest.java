package command.trial;

/**
 * @Description
 * @ClassName Boss
 * @Author wangDi
 * @date 2020-10-13 14:17
 */
public class BossTest {
    public static void main(String[] args) {
        Worker worker = new Worker();
        StopWorkCommand stopWorkCommand = new StopWorkCommand(worker);
        WorkCommand workCommand = new WorkCommand(worker);
        Assistant assistant = new Assistant();
        assistant.storeAndSaveCommand(workCommand);
        assistant.storeAndSaveCommand(stopWorkCommand);

    }
}
