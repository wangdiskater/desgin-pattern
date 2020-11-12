package headfirst.command.test;

import headfirst.single.Singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description invoker
 * @ClassName LogCenter
 * @Author wangDi
 * @date 2020-11-12 11:35
 */
public class LogCenter {

    List<MyCommand> commands = new ArrayList<>();
    private volatile static LogCenter uniqueInstance;

    public void execute(MyCommand myCommand){
        commands.add(myCommand);
        myCommand.store();
        myCommand.execute();
    }


    public void load(){
        if (commands.isEmpty()) {
            return;
        }
        commands.forEach(MyCommand::load);

    }


    private LogCenter() {
    }

    /**
     *
     * @Description 双重校验
     * @param
     * @Author wangDi
     * @Date 2020-11-12 13:45
     **/
    public static LogCenter getInstance() {
        if (uniqueInstance == null) {
            synchronized (LogCenter.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new LogCenter();
                }
            }
        }
        return uniqueInstance;
    }


    public static LogCenter getInstanceByEnum() {
        return InnerLogCenter.INSTANCE.getInstance();
    }


    /**
     * 枚举类
     */

    private enum InnerLogCenter {
        /**
         * 实例化
         */
        INSTANCE;
        private LogCenter logCenter;

        /**
         * 只会执行一次
         */
        InnerLogCenter() {
            logCenter = new LogCenter();
        }

        private LogCenter getInstance() {
            return logCenter;
        }
    }

}
