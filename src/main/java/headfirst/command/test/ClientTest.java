package headfirst.command.test;

/**
 * @Description
 * @ClassName ClientTest
 * @Author wangDi
 * @date 2020-11-12 11:50
 */
public class ClientTest {
    public static void main(String[] args) {

        LogCenter instance = LogCenter.getInstance();
        LogCenter instanceByEnum = LogCenter.getInstanceByEnum();

        instance.execute(new StartServerCommand());

    }
}
